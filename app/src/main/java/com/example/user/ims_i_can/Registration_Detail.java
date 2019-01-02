package com.example.user.ims_i_can;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Registration_Detail extends AppCompatActivity {
    Button Login;
    TextView fname,enrNo,lname,bdate,email,address,mobno,pmobno,state,city,area,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__detail);
        enrNo=(TextView)findViewById(R.id.EnrNo);
        lname=(TextView)findViewById(R.id.Lname);
        bdate=(TextView)findViewById(R.id.Bdate);
        fname=(TextView)findViewById(R.id.Fname);
        email=(TextView)findViewById(R.id.Email);
        address=(TextView)findViewById(R.id.Address);
        mobno=(TextView)findViewById(R.id.Mobno);
        pmobno=(TextView)findViewById(R.id.Pmobno);
        area=(TextView)findViewById(R.id.area);
        state=(TextView)findViewById(R.id.State);
        city=(TextView)findViewById(R.id.City);
        gender=(TextView)findViewById(R.id.gender);





        String fname1=getIntent().getStringExtra("fname");
        String enrno1=getIntent().getStringExtra("enrNo");
        String lanme1=getIntent().getStringExtra("lname");
        String bdate1=getIntent().getStringExtra("bdate");
        String email1=getIntent().getStringExtra("email");
        String address1=getIntent().getStringExtra("address");
        String mobno11=getIntent().getStringExtra("mobno");
        String pmobno1=getIntent().getStringExtra("pmobno");
        String area1=getIntent().getStringExtra("area");
        String gen=getIntent().getStringExtra("gender");
        String spi=getIntent().getStringExtra("state");
        String spi2=getIntent().getStringExtra("city");
        Toast.makeText(this, gen, Toast.LENGTH_SHORT).show();
        fname.setText(fname1);
        enrNo.setText(enrno1);
        lname.setText(lanme1);
        bdate.setText(bdate1);
        email.setText(email1);
        address.setText(address1);
        mobno.setText(mobno11);
        pmobno.setText(pmobno1);
        area.setText(area1);
        state.setText(spi);
        city.setText(spi2);
        gender.setText(gen);


        Login=(Button)findViewById(R.id.Btn);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Registration_Detail.this,LogIn.class);
                startActivity(intent);
            }
        });
    }
}
