package com.example.dokandar24design.DeliveryBoyActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dokandar24design.R;

public class DeliveryRegActivity extends AppCompatActivity {



    private EditText name,phone,password;
    private Button reg_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_reg);


        init();


        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DeliveryRegActivity.this, "hey i am delivery boy", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void init(){

        name=findViewById(R.id.name_boy_id);
        phone=findViewById(R.id.phone_boy_id);
        password=findViewById(R.id.password_boy_id);

        reg_btn=findViewById(R.id.registered_boy);

    }
}