package com.kuliahmobile.latihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class newActivity extends AppCompatActivity {
    public static final String EXTRA_NIM = "extra_nim";
    public static final String EXTRA_NAMA = "extra_nama";
    TextView textNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        textNew = findViewById(R.id.txtNew);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        int nim = getIntent().getIntExtra(EXTRA_NIM, 0);

        String text = "Nama : " + nama + ",\nNIM : " + nim;
        textNew.setText(text);
    }
}
