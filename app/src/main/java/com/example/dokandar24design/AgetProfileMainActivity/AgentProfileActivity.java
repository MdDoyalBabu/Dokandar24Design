package com.example.dokandar24design.AgetProfileMainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dokandar24design.R;
import com.example.dokandar24design.SellerBalanceActivity.AllSendBalanceActivity;
import com.example.dokandar24design.SellerBalanceActivity.WithdrawBalanceActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class AgentProfileActivity extends AppCompatActivity {


    private CircleImageView circleImageView;
    private TextView name,phone,joiningDate;
    private Button addBalance,sendBalance,withdrawBalance;
    private Button profitSendBalance,profitWithdrawBalance;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_profile);



        init();


        addBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentProfileActivity.this, AllSendBalanceActivity.class);
                startActivity(intent);
            }
        });

        sendBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentProfileActivity.this, AllSendBalanceActivity.class);
                startActivity(intent);
            }
        });
        withdrawBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentProfileActivity.this, WithdrawBalanceActivity.class);
                startActivity(intent);
            }
        });

        profitSendBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentProfileActivity.this, AllSendBalanceActivity.class);
                startActivity(intent);
            }
        });

        profitWithdrawBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgentProfileActivity.this, WithdrawBalanceActivity.class);
                startActivity(intent);
            }
        });




    }

    private void init() {

        circleImageView=findViewById(R.id.profileImage);

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        joiningDate=findViewById(R.id.joiningDate);

        addBalance=findViewById(R.id.addBalace);
        sendBalance=findViewById(R.id.sendbalance);
        withdrawBalance=findViewById(R.id.withdraw);


        profitSendBalance=findViewById(R.id.sendBalanceProfit);
        profitWithdrawBalance=findViewById(R.id.withdrawBalanceProfit);
    }
}