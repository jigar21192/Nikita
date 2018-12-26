package com.example.user.ims_i_can;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Faculty_Login extends AppCompatActivity {
    Button login;
    TextView fpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty__login);
        login=(Button)findViewById(R.id.login);
        fpassword=(TextView)findViewById(R.id.fpassword);
        fpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Faculty_Login.this,Faculty_Forget_Password.class);
                startActivity(intent1);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Faculty_Login.this,Faculty_Dashboard.class);
                startActivity(intent);
            }
        });
    }
}
