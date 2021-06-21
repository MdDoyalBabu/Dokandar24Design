package com.example.dokandar24design.SellerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerBalanceActivity.WithdrawBalanceActivity;
import com.example.dokandar24design.SellerBalanceActivity.AllSendBalanceActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShopActivity extends AppCompatActivity {



    private CircleImageView circleImageView;
    private TextView name,phone,joiningDate;
    private TextView amountShop,amountShell,amountBonus;
    private Button shopCode,shopSendBalance,shellSendBalance,bonusSendBalance;
    private Button withdrawShopBalance,withdrawShellBalance,withdrawBonusBalance;
    private Button addProducts,allProducts,pendingOrders,acceptedOrder,successfullyDelivered;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        initi();



        addProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this,AddProductsActivity.class);
                startActivity(intent);
            }
        });



        allProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this,AllProductsShowActivity.class);
                startActivity(intent);
            }
        });


        withdrawShopBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this, WithdrawBalanceActivity.class);
                startActivity(intent);
            }
        });
        withdrawShellBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this, WithdrawBalanceActivity.class);
                startActivity(intent);
            }
        });
        withdrawBonusBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this, WithdrawBalanceActivity.class);
                startActivity(intent);
            }
        });

        shopSendBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this, AllSendBalanceActivity.class);
                startActivity(intent);
            }
        });

        shellSendBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this, AllSendBalanceActivity.class);
                startActivity(intent);
            }
        });

        bonusSendBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShopActivity.this, AllSendBalanceActivity.class);
                startActivity(intent);
            }
        });






    }




    private void initi() {


        circleImageView=findViewById(R.id.profileImage);

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        joiningDate=findViewById(R.id.joiningDate);


        amountShop=findViewById(R.id.amountShop);
        amountShell=findViewById(R.id.amountsell);
        amountBonus=findViewById(R.id.amountbonus);

        shopCode=findViewById(R.id.shopcode);
        shopSendBalance=findViewById(R.id.sendBalanceSop);
        shellSendBalance=findViewById(R.id.sendBalanceSell);
        bonusSendBalance=findViewById(R.id.sendBalanceBonus);


        withdrawShopBalance=findViewById(R.id.shopWithdraw);
        withdrawShellBalance=findViewById(R.id.shellWithdraw);
        withdrawBonusBalance=findViewById(R.id.bonusWithdraw);

        addProducts=findViewById(R.id.addProducts);
        allProducts=findViewById(R.id.allProducts);
        pendingOrders=findViewById(R.id.pendingProducts);
        successfullyDelivered=findViewById(R.id.successfullyDeliveryOrder);
        acceptedOrder=findViewById(R.id.acceptOrder);




    }


}