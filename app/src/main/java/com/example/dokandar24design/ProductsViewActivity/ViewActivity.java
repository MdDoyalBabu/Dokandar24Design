package com.example.dokandar24design.ProductsViewActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dokandar24design.R;

public class ViewActivity extends AppCompatActivity {


    private ImageView imageView;
    private TextView prodcutName,price,favorite,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        init();


    }

    public void init(){
        imageView=findViewById(R.id.image_view_id);
        prodcutName=findViewById(R.id.product_name_m);
        price=findViewById(R.id.price_m);
        favorite=findViewById(R.id.favorite_m);
        location=findViewById(R.id.location_m);
    }

}