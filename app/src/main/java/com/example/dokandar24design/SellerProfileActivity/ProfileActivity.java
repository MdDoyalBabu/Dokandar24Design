package com.example.dokandar24design.SellerProfileActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerActivity.CreateShopActivity;
import com.example.dokandar24design.SellerActivity.SellerLoginActivity;
import com.example.dokandar24design.SellerActivity.SellerRegisteredActivity;
import com.example.dokandar24design.SellerBalanceActivity.AddBalanceActivity;
import com.example.dokandar24design.SellerBalanceActivity.SendBalanceActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private TextView name,phone,joinDate,cashBalance;
    private Button addBalance,sendBalance,allOrderds,pendingOrders,deliveryOrders,createShop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        initi();

        createShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this, CreateShopActivity.class);
                startActivity(intent);
            }
        });


        addBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this, AddBalanceActivity .class);
                startActivity(intent);
            }
        });


        sendBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProfileActivity.this, SendBalanceActivity.class);
                startActivity(intent);
            }
        });



    }

    private void initi() {

        circleImageView=findViewById(R.id.profileImage);

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        joinDate=findViewById(R.id.joiningDate);
        cashBalance=findViewById(R.id.cashBalance);

        addBalance=findViewById(R.id.addBalance);
        sendBalance=findViewById(R.id.sendBalance);
        allOrderds=findViewById(R.id.allorders);
        pendingOrders=findViewById(R.id.pendingDelivery);
        deliveryOrders=findViewById(R.id.deliveredOrder);

        createShop=findViewById(R.id.create_shop);

    }
}