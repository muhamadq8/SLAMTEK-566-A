package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button back = findViewById(R.id.bu4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Login2.class);
                startActivity(intent);

            }
        });

    }
    public void show(View v){
        Toast toast = Toast.makeText(this,"تم التسجيل بنجاح",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,20,90);
        toast.show();
    }
}
