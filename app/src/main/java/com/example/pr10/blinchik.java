package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class blinchik extends AppCompatActivity implements View.OnClickListener {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blinchik);
        ImageButton imgbuttonback4 = (ImageButton) findViewById(R.id.imgbuttonback5);
        imgbuttonback4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, table.class));
    }
}