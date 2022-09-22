package com.mdp.formulir2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText etNPM, etNama;
    private RadioGroup rgJK;
    private RadioButton rbJK;
    private Spinner spProdi;
    private Button btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNPM = findViewById(R.id.et_npm);
        etNama = findViewById(R.id.et_nama);
        rgJK = findViewById(R.id.rg_jk);
        spProdi = findViewById(R.id.sp_prodi);
        btnDaftar = findViewById(R.id.btn_daftar);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String npm, nama, jk, prodi;
                int selectedID;
                npm = etNPM.getText().toString();
                nama = etNama.getText().toString();
                prodi = spProdi.getSelectedItem().toString();
                selectedID = rgJK.getCheckedRadioButtonId();
                rbJK = findViewById(selectedID);
                jk = rbJK.getText().toString();
                if (npm.trim().equals("")){
                    etNPM.setError("NPM Tidak Boleh Kosong");
                }
                else if(nama.trim().equals("")){
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else{
                    Intent intent = new Intent(MainActivity.this, HalamanKedua.class);
                    intent.putExtra("varNPM", npm);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varJK", jk);
                    intent.putExtra("varProdi", prodi);
                    startActivity(intent);
                }
            }
        });
    }
}