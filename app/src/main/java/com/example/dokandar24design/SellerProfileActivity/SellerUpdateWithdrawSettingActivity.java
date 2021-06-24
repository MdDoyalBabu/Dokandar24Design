package com.example.dokandar24design.SellerProfileActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.dokandar24design.R;

public class SellerUpdateWithdrawSettingActivity extends AppCompatActivity {



    private Button bkash,bank,nagad,cash;
    private LinearLayout linearLayout;

    private View mBkash,mBank,mNagad,mCash;
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_update_withdraw_setting);

        titleMethod();

        init();

        bkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bkashView();
            }
        });
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bankView();
            }
        });

        nagad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nagadView();
            }
        });


        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cashView();
            }
        });


    }

    private void titleMethod() {

        mToolbar=findViewById(R.id.login_appbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    private void cashView() {

        linearLayout.removeAllViews();
        mCash= LayoutInflater.from(this).inflate(R.layout.cash_layout,null);
        linearLayout.addView(mCash);

    }

    private void nagadView() {
        linearLayout.removeAllViews();
        mNagad= LayoutInflater.from(this).inflate(R.layout.nagad_layout,null);
        linearLayout.addView(mNagad);

    }

    private void bankView() {

        linearLayout.removeAllViews();
        mBank= LayoutInflater.from(this).inflate(R.layout.bank_layout,null);
        linearLayout.addView(mBank);
    }

    private void bkashView() {

        linearLayout.removeAllViews();
        mBkash= LayoutInflater.from(this).inflate(R.layout.bkash_layout,null);
        linearLayout.addView(mBkash);
    }

    private void init() {

        linearLayout=findViewById(R.id.linerSub);
        bkash=findViewById(R.id.bkash);
        bank=findViewById(R.id.bank);
        nagad=findViewById(R.id.nagad);
        cash=findViewById(R.id.cash);


    }
}