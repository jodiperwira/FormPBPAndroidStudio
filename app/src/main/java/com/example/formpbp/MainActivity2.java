package com.example.formpbp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView nama, ttl, cct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = findViewById(R.id.tabnama);
        ttl = findViewById(R.id.tabttl);
        cct = findViewById(R.id.tabcct);

        Intent intent = getIntent();

        String namaUsr = intent.getStringExtra("namaUsr");
        String ttlUsr = intent.getStringExtra("ttlUsr");
        String ctct = intent.getStringExtra("ctct");

        nama.setText(namaUsr);
        ttl.setText(ttlUsr);
        cct.setText(ctct);
    }
}