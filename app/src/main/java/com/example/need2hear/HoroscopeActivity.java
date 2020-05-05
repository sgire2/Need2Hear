package com.example.need2hear;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HoroscopeActivity extends AppCompatActivity {

    private void goToFortuneActivity() {
        Intent intent = new Intent(this, FortuneActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscopes);

        Button aquarius = findViewById(R.id.aquarius);
        aquarius.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button pisces = findViewById(R.id.pisces);
        pisces.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button aries = findViewById(R.id.aries);
        aries.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });
        Button taurus = findViewById(R.id.taurus);
        taurus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button gemini = findViewById(R.id.gemini);
        gemini.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button cancer = findViewById(R.id.cancer);
        cancer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button leo = findViewById(R.id.leo);
        leo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button virgo = findViewById(R.id.virgo);
        virgo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button libra = findViewById(R.id.libra);
        libra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button scorpio = findViewById(R.id.scorpio);
        scorpio.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button sagittarius = findViewById(R.id.sagittarius);
        sagittarius.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });
    }
}