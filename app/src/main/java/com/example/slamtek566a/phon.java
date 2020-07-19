package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phon);


        Button call0 = findViewById(R.id.bo11);
        Button call11 = findViewById(R.id.bo22);
        Button call22 = findViewById(R.id.bo33);
        Button call33 = findViewById(R.id.bo44);



        Button back22 = findViewById(R.id.btn11);
        back22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phon.this,dr4.class);
                startActivity(intent);

            }
        });



        Button back222 = findViewById(R.id.btn33);
        back222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phon.this,phon2.class);
                startActivity(intent);

            }
        });







        call0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "112";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });




        call11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "24812000";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });


        call22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "22450005";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });





        call33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "24888000";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });


    }
}