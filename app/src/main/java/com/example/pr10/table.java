package com.example.pr10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class table extends AppCompatActivity implements View.OnClickListener {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
        ImageButton imgbuttonback = (ImageButton) findViewById(R.id.imgbuttonback);
        imgbuttonback.setOnClickListener(this);
        Button buttonborsch = (Button) findViewById(R.id.buttonborsch);
        buttonborsch.setOnClickListener(this);
        Button buttonblinchik = (Button) findViewById(R.id.buttonblinchik);
        buttonblinchik.setOnClickListener(this);
        Button buttoncesar = (Button) findViewById(R.id.buttoncesar);
        buttoncesar.setOnClickListener(this);
        Button buttonmilk = (Button) findViewById(R.id.buttonmilk);
        buttonmilk.setOnClickListener(this);
        Button buttonspagetti = (Button) findViewById(R.id.buttonspagetti);
        buttonspagetti.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.imgbuttonback)
            startActivity(new Intent(this, main.class));
        if(v.getId()==R.id.buttonborsch)
            startActivity(new Intent(this, borsch.class));
        if(v.getId()==R.id.buttoncesar)
            startActivity(new Intent(this, cesar.class));
        if(v.getId()==R.id.buttonblinchik)
            startActivity(new Intent(this, blinchik.class));
        if(v.getId()==R.id.buttonmilk)
            startActivity(new Intent(this, milkshake.class));
        if(v.getId()==R.id.buttonspagetti)
            startActivity(new Intent(this, spagetti.class));
    }
}