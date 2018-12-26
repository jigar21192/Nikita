package com.example.user.ims_i_can;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    EditText email,password;
    Button Login;
    TextView Fpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Fpassword=(TextView)findViewById(R.id.Fpassword);
        Login=(Button)findViewById(R.id.Login);
       Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(LogIn.this, Welcome_page.class);
                startActivity(intent1);
            }
        });
        Fpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogIn.this,Forget_pwd.class);
                startActivity(intent);
            }
        });



    }
}
