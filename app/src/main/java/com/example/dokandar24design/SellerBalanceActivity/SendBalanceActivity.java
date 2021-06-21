package com.example.dokandar24design.SellerBalanceActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.dokandar24design.R;

public class SendBalanceActivity extends AppCompatActivity {


    private EditText phoneNumber,name,amount,newBalance;
    private Button sendMoney_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_balance);


        initi();


    }

    private void initi() {

        phoneNumber=findViewById(R.id.reviverPhoneNumber);
        name=findViewById(R.id.reviveName);
        amount=findViewById(R.id.amount);
        newBalance=findViewById(R.id.newBalance);

        sendMoney_btn=findViewById(R.id.sendmoney);


    }
}