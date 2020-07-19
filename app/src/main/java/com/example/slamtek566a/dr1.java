package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dr1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr1);





        Button star = findViewById(R.id.bttt222);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr1.this,start.class);
                startActivity(intent);

            }
        });








    }
    public void show1(View v){
    Toast toast = Toast.makeText(this,"تم الأبلاغ",Toast.LENGTH_SHORT);
    toast.setGravity(Gravity.BOTTOM,20,90);
    toast.show();
    }
}

