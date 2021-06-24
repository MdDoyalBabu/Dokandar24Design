package com.example.dokandar24design.AgentActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.AgetProfileMainActivity.AgentProfileActivity;
import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerActivity.AddProductsActivity;
import com.example.dokandar24design.SellerActivity.ShopActivity;

public class AgentLoginActivity extends AppCompatActivity {



    private Button login;
    private EditText number,password;
    private TextView forgetPassword,createAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_login);


        init();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentLoginActivity.this, AgentProfileActivity .class);
                startActivity(intent);
            }
        });

    }


    private void init() {
        login=findViewById(R.id.agent_login_id);
        number=findViewById(R.id.phoneNumber);
        password=findViewById(R.id.password);
        createAccount=findViewById(R.id.create_account_agent);


    }
} 