package com.example.user.ims_i_can;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Signup extends AppCompatActivity {

    ImageView imageVIew1,imageVIew2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        imageVIew1=(ImageView)findViewById(R.id.imageVIew1);
        imageVIew2=(ImageView)findViewById(R.id.imageVIew2);
        imageVIew1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Signup.this,Registration.class);
                startActivity(intent);
            }
        });
        imageVIew2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Signup.this,Faculty_Registration.class);
                startActivity(intent1);
            }
        });
    }
}
