package com.example.slamtek566a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phon2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phon2);



        Button call00 = findViewById(R.id.bo111);
        Button call111 = findViewById(R.id.bo222);
        Button call222 = findViewById(R.id.bo333);
        Button call333 = findViewById(R.id.bo444);





        Button back2222 = findViewById(R.id.btn111);
        back2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phon2.this,dr4.class);
                startActivity(intent);

            }
        });



        Button back22222 = findViewById(R.id.btn222);
        back22222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phon2.this,phon.class);
                startActivity(intent);

            }
        });






        call00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "112";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });




        call111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "50880755";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });


        call222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "96992079";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });





        call333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String Phone = "99613948";
                String s = "tel:"+Phone;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(s));

                startActivity(callIntent);
            }
        });
    }
}