package com.example.need2hear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class YourHoroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_horo);
        generateHoroscope();
        generateCompatibility();
    }

    private void generateHoroscope() {
        String[] horoscopes = {"A lifetime friend shall soon be made.", "A lifetime of happiness lies ahead of you.",
                "A light heart carries you through all the hard times.", "A new perspective will come with the new year.",
                "A person is never too old to learn.","A person of words and not deeds is like a garden full of weeds.",
                "A pleasant surprise is waiting for you.", "A short pencil is usually better than a long memory any day.",
                "A smile is your personal welcome mat.",
                "A soft voice may be awfully persuasive.", "A truly rich life contains love and art in abundance.",
                "Accept something that you cannot change, and you will feel better.", "Adventure can be real happiness.",
                "Advice is like kissing. It costs nothing and is a pleasant thing to do.",
                "Advice, when most needed, is least heeded.",
                "All the effort you are making will ultimately pay off.",
                "All the troubles you have will pass away very quickly.", "All will go well with your new project.",
                "All your hard work will soon pay off.",
                "Allow compassion to guide your decisions.",
                "An acquaintance of the past will affect you in the near future.",
                "An agreeable romance might begin to take on the appearance.",
                "An important person will offer you support.",
                "An inch of time is an inch of gold.",
                "Any decision you have to make tomorrow is a good decision.",
                "At the touch of love, everyone becomes a poet.",
                "Be careful or you could fall for some tricks today.",
                "Beauty in its various forms appeals to you.",
                "Because you demand more from yourself, others respect you deeply.",
                "Believe in yourself and others will too.",
                "Believe it can be done.",
                "Better ask twice than lose yourself once.",
                "Bide your time, for success is near."};
        int random = (int)(Math.random() * horoscopes.length);
        TextView finalHoro = findViewById(R.id.horoscopeTxt);
        finalHoro.setText(horoscopes[random]);
    }

    public void generateCompatibility() {
        String[] signs = {"Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Capricorn", "Sagittarius", "Scorpio", "Aquarius"};
        int random = (int)(Math.random() * signs.length);
        TextView compatible = findViewById(R.id.compatTxt);
        compatible.setText(signs[random]);
    }
}
