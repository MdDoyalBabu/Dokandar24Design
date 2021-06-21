package com.example.dokandar24design.SellerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerProfileActivity.ProfileActivity;

public class SellerRegisteredActivity extends AppCompatActivity {



    private EditText name,phone,password;
    private Button  reg_btn;
    private TextView textViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_registered);


        initi();

        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SellerRegisteredActivity.this,SellerLoginActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initi() {

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phoneNumber);
        password=findViewById(R.id.password);
        reg_btn=findViewById(R.id.create_btn);
        textViewLogin=findViewById(R.id.login_textView_seller);
    }
}