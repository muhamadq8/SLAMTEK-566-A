package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dr2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr2);



        Button stars = findViewById(R.id.bttt222);
        stars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr2.this,start.class);
                startActivity(intent);

            }
        });



        Button back1 = findViewById(R.id.bn1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr2.this,db1.class);
                startActivity(intent);

            }
        });


        Button back2 = findViewById(R.id.bn2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr2.this,db2.class);
                startActivity(intent);

            }
        });



        Button back3 = findViewById(R.id.bn3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr2.this,db3.class);
                startActivity(intent);

            }
        });


        Button back4 = findViewById(R.id.bn4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr2.this,db4.class);
                startActivity(intent);

            }
        });
    }
}