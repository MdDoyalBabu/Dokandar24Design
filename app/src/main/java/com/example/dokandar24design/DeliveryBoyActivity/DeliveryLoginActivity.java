package com.example.dokandar24design.DeliveryBoyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.R;

public class DeliveryLoginActivity extends AppCompatActivity {


    private EditText phone,password;
    private Button loin_btn;
    private TextView creatTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_login);


        init();

        loin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DeliveryLoginActivity.this,DeliveryBoyUpdateProfileActivity.class);
                startActivity(intent);
            }
        });


        creatTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DeliveryLoginActivity.this,DeliveryRegActivity.class);
                startActivity(intent);
            }
        });


    }

    public void init(){
        phone=findViewById(R.id.phone_boy_id);
        password=findViewById(R.id.password_boy_id);
        creatTextview=findViewById(R.id.create_id);

        loin_btn=findViewById(R.id.login_boy_id);
    }
}