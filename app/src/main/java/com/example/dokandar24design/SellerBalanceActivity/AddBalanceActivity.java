package com.example.dokandar24design.SellerBalanceActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.dokandar24design.R;

public class AddBalanceActivity extends AppCompatActivity {

    private LinearLayout linearLayout,linearLayoutSub;
    private Button bkash,bank;

    View mBkashView,mBankView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_balance);


        linearLayoutSub=findViewById(R.id.linerSub);
        bkash=findViewById(R.id.bkash);
        bank=findViewById(R.id.bank);

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
    }

    private void bkashView() {

        linearLayoutSub.removeAllViews();
        mBkashView= LayoutInflater.from(this).inflate(R.layout.bkash_layout,null);
        linearLayoutSub.addView(mBkashView);
    }

    private void bankView() {

        linearLayoutSub.removeAllViews();
        mBankView= LayoutInflater.from(this).inflate(R.layout.bank_layout,null);
        linearLayoutSub.addView(mBankView);

    }
}