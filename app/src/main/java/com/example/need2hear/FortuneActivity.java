package com.example.need2hear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class FortuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fortune);
        Button home = findViewById(R.id.goHome);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToMainActivity();
            }
        });
        ImageButton cookie = findViewById(R.id.cookieBtn);
        cookie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                giveFortune();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToMainActivity();
            }
        });
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void giveFortune() {
        setContentView(R.layout.activity_fortune);

        final String url = "https://yerkee.com/api/fortune/people";

        TextView textView = findViewById(R.id.fortuneText);
        textView.setText("You know what the next step is. Why don't you take it?");

//        RequestQueue queue = Volley.newRequestQueue(this);
//        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url , null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        try {
//                            String fortune = response.get("fortune").toString();
//                            TextView textView = findViewById(R.id.fortuneText);
//                            textView.setText(fortune);
//                        }
//                        catch (JSONException e) {
//                            System.out.print("error :(");
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        System.out.println(error.toString());
//                    }
//                });
//        queue.add(request);
    }
}
