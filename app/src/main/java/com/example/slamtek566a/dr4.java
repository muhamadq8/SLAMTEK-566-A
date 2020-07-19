package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dr4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr4);
        Button call = findViewById(R.id.bo1);
        Button call1 = findViewById(R.id.bo2);
        Button call2 = findViewById(R.id.bo3);
        Button call3 = findViewById(R.id.bo4);



        Button stars = findViewById(R.id.bttt222);
        stars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr4.this,start.class);
                startActivity(intent);

            }
        });




        Button back2 = findViewById(R.id.btn2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr4.this,phon2.class);
                startActivity(intent);

            }
        });



        Button back22 = findViewById(R.id.btn3);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr4.this,phon.class);
                startActivity(intent);

            }
        });





        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "112";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });




        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "24575300";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });


        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "22450005";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });





        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "25742790";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });


        
    }
}


