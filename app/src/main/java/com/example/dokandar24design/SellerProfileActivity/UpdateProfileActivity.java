package com.example.dokandar24design.SellerProfileActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerActivity.CreateShopActivity;

public class UpdateProfileActivity extends AppCompatActivity {



    private EditText shopId,shopName,shopPhone,shopLocation;
    private Button update_btn,withdrawSetting_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);


        initi();


        withdrawSetting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UpdateProfileActivity.this, SellerUpdateWithdrawSettingActivity.class);
                startActivity(intent);
            }
        });


    }

    private void initi() {

        shopId=findViewById(R.id.shopId);
        shopName=findViewById(R.id.shop_name);
        shopPhone=findViewById(R.id.shopPhone);
        shopLocation=findViewById(R.id.shop_location);

        update_btn=findViewById(R.id.update_btn);
        withdrawSetting_btn=findViewById(R.id.updateWithdrawSettin);

    }


}