package com.example.user.ims_i_can;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView txt=findViewById(R.id.txt1);

        txt.setText("You"+"\n"+"Learn"+"\n"+" Something");
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this,Ranker_list.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}

