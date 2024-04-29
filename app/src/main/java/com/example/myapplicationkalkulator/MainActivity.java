package com.example.myapplicationkalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final TextView tv1 = findViewById(R.id.tvHasil);
        final TextView tv2 = findViewById(R.id.tvANGKA1);
        final TextView tv3 = findViewById(R.id.textView3);
        final EditText et1 = findViewById(R.id.editTextNumber);
        final EditText et2 = findViewById(R.id.editTextNumber2);
        final Button bt1 = findViewById(R.id.bttambah);
        final Button bt2 = findViewById(R.id.btkurang);
        final Button bt3 = findViewById(R.id.btkali);
        final Button bt4 = findViewById(R.id.btbagi);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId() == bt1.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 + x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                }

            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId() == bt2.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 - x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                }

            }

        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId() == bt3.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 * x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                }

            }

        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId() == bt4.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 / x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                }

            }

        });




    }
}