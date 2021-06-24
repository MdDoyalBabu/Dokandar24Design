package com.example.dokandar24design.SellerBalanceActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.dokandar24design.Adapter.DialogFragments.MyDailogFragment;
import com.example.dokandar24design.R;

public class WithdrawBalanceActivity extends AppCompatActivity {



    private EditText selectWithdraw,amount;
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_balance);

        titleMethod();

        initi();

        selectWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MyDailogFragment().show(getSupportFragmentManager(),"MyDialogFragment");
            }
        });

    }

    private void titleMethod() {

        mToolbar=findViewById(R.id.withdraw_appbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Withdraw Balance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void initi() {

        selectWithdraw=findViewById(R.id.withdraw_select);
        amount=findViewById(R.id.amount);
    }
}