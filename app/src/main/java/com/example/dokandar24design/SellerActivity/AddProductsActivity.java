package com.example.dokandar24design.SellerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dokandar24design.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddProductsActivity extends AppCompatActivity {




    private ImageView selectImage;
    private Button addButton;
    private EditText productsName,productsPrice,productDescription;
    private EditText discount,from,to;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_products);

        initi();


    }

    private void initi() {


        selectImage=findViewById(R.id.select_Image);
         addButton=findViewById(R.id.add_btn);

        productsName=findViewById(R.id.product_name);
        productsPrice=findViewById(R.id.product_price);
        productDescription=findViewById(R.id.product_description);

        discount=findViewById(R.id.discount);
        from=findViewById(R.id.from);
        to=findViewById(R.id.to);

    }


}