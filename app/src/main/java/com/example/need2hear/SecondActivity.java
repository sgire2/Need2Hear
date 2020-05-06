package com.example.need2hear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button fortune = findViewById(R.id.fortuneBtn);
        fortune.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToFortuneActivity();
            }
        });

        Button home = findViewById(R.id.homeBtn);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToMainActivity();
            }
        });
    }

    private void goToFortuneActivity() {
        Intent intent = new Intent(this, FortuneActivity.class);
        startActivity(intent);
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
