package com.example.m213_ch03_cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activity01 extends AppCompatActivity {
    ImageView ivBulb;
    Boolean isOff = true;
    ImageButton ibClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);

        ivBulb = findViewById(R.id.ivBulb);
        ibClose = findViewById(R.id.ibClose);

        ivBulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOff)
                    ivBulb.setImageResource(R.drawable.bulbon);
                else
                    ivBulb.setImageResource(R.drawable.bulboff);

                isOff = !isOff;
            }
        });

        ibClose.setOnClickListener(v -> finish());
    }
}