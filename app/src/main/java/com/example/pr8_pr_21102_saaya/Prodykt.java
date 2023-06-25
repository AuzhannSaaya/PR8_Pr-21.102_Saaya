package com.example.pr8_pr_21102_yadikcin_sergey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Prodykt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodykt);

        ImageButton btnGoToSecAct = (ImageButton) findViewById(R.id.BTR3);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Prodykt.this, Basket.class);
                startActivity(intent);
            }
        };

        btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct);
        Button btnGoToSecAct2 = (Button) findViewById(R.id.BTR2);

        View.OnClickListener oclBtnGoToSecAct2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Prodykt.this, Basket.class);
                startActivity(intent);
            }
        };

        btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct);
    }
}

