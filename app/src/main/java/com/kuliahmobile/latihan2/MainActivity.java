package com.kuliahmobile.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOK = findViewById(R.id.btnOK);
        buttonOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOK:
                Intent helpIntent = new Intent(MainActivity.this, newActivity.class);
                helpIntent.putExtra(newActivity.EXTRA_NAMA,"Budi");
                helpIntent.putExtra(newActivity.EXTRA_NIM,2023);
                startActivity(helpIntent);
                break;
        }
    }
}
