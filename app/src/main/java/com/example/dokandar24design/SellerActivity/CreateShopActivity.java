package com.example.dokandar24design.SellerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class CreateShopActivity extends AppCompatActivity {



    private EditText referalShop,shopName,shopDescription,shopLocation;
    private Button shopLogo,shopBanner,createShop;
    protected CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_shop);


        initi();

        createShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateShopActivity.this,ShopActivity.class);
                startActivity(intent);
            }
        });


    }

    private void initi() {


        checkBox=findViewById(R.id.checkbox);

        referalShop=findViewById(R.id.referralshopid);
        shopName=findViewById(R.id.shopname);
        shopDescription=findViewById(R.id.shopdescription);
        shopLocation=findViewById(R.id.shoplocation);

        shopLogo=findViewById(R.id.shopLogo);
        shopBanner=findViewById(R.id.shopBanner);
        createShop=findViewById(R.id.create_shop);

    }
}