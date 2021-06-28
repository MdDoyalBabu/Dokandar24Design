package com.example.dokandar24design.AgentActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dokandar24design.R;

public class AgentRegisteredActivity extends AppCompatActivity {




    private EditText name,phone,password;
    private Button reg_btn;
    private TextView textViewLogin;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent_registered);


        titleMethod();

        init();

    }

    private void titleMethod() {

        mToolbar=findViewById(R.id.agent_reg_appbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(" Agent Registered");
    }


    private void init() {

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phoneNumber);
        password=findViewById(R.id.password);
        reg_btn=findViewById(R.id.create_btn);
        textViewLogin=findViewById(R.id.login_textView_agent);
    }

}