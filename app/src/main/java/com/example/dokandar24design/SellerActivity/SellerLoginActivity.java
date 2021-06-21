package com.example.dokandar24design.SellerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.NavigationDrawer;
import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerProfileActivity.ProfileActivity;

public class SellerLoginActivity extends AppCompatActivity {


    private Button login;
    private EditText number,password;
    private TextView forgetPassword,createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_login);

        initi();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SellerLoginActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });



    }

    private void initi() {
        login=findViewById(R.id.login_button_id);
        number=findViewById(R.id.phoneNumber);
        password=findViewById(R.id.password);
        createAccount=findViewById(R.id.create_account_seller);


    }
}