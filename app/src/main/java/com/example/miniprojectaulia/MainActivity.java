package com.example.miniprojectaulia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPengignat, btnKalkulator, btnJelajah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPengignat = findViewById(R.id.infoJadwal);
        btnPengignat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PengingatActivity.class);
                startActivity(intent);
            }
        });
        btnKalkulator = findViewById(R.id.btnKalkulatorBMI);
        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KalkulatorBmiActivity.class);
                startActivity(intent);
            }
        });

    }
}