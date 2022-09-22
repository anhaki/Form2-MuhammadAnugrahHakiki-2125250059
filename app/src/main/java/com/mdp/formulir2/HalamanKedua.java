package com.mdp.formulir2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class HalamanKedua extends AppCompatActivity {
    private TextView tvNPM, tvNama, tvProdi, tvJK;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kedua);
        tvNPM = findViewById(R.id.tv_NPM);
        tvNama = findViewById(R.id.tv_nama);
        tvJK = findViewById(R.id.tv_jk);
        tvProdi = findViewById(R.id.tv_prodi);
        Intent intent = getIntent();
        tvNPM.setText(intent.getStringExtra("varNPM"));
        tvNama.setText(intent.getStringExtra("varNama"));
        tvJK.setText(intent.getStringExtra("varJK"));
        tvProdi.setText(intent.getStringExtra("varProdi"));
    }
}