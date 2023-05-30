package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class milkshake extends AppCompatActivity implements View.OnClickListener {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.milkshake);
        ImageButton imgbuttonback5 = (ImageButton) findViewById(R.id.imgbuttonback5);
        imgbuttonback5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, table.class));
    }
}