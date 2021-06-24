package com.example.dokandar24design.SellerBalanceActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.R;

public class AllSendBalanceActivity extends AppCompatActivity {


    private EditText phoneNumber,name,amount,newBalance;
    private Button sendMoney_btn;
    private TextView textView;

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_send_balance);

        titleMethod();

        init();
    }

    private void titleMethod() {


        mToolbar=findViewById(R.id.sendBalance_appbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Send Balance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    private void init() {

        phoneNumber=findViewById(R.id.reviverPhoneNumber);
        name=findViewById(R.id.reviveName);
        amount=findViewById(R.id.amount);
        newBalance=findViewById(R.id.newBalance);
        textView=findViewById(R.id.textview_id);

        sendMoney_btn=findViewById(R.id.sendmoney);


    }
}