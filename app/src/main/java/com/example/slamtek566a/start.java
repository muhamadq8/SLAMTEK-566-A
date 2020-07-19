package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        Button back1 = findViewById(R.id.bt2);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start.this,dr1.class);
                startActivity(intent);

            }
        });


        Button back2 = findViewById(R.id.bt3);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start.this,dr2.class);
                startActivity(intent);

            }
        });



        Button back3 = findViewById(R.id.bt1);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start.this,dr3.class);
                startActivity(intent);

            }
        });


        Button back4 = findViewById(R.id.bt4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start.this,dr4.class);
                startActivity(intent);

            }
        });
    }
}