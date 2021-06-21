package com.example.dokandar24design.AgetProfileMainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.dokandar24design.R;

public class AgentUpdateProfileActivity extends AppCompatActivity {

    private EditText email,thana,area,houseRoad,homeAddress;
    private Button primary_btn;
    private Spinner countryName,region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_update_profile);

        init();

    }

    private void init() {

        email=findViewById(R.id.email);
        thana=findViewById(R.id.thana);
        area=findViewById(R.id.area);
        houseRoad=findViewById(R.id.house_Road_no);
        homeAddress=findViewById(R.id.homeAddress);
        primary_btn=findViewById(R.id.primary_id);
        countryName=findViewById(R.id.countryName);
        region=findViewById(R.id.region);



    }

}