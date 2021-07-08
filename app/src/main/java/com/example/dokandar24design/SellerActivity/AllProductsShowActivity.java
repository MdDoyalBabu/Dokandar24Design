package com.example.dokandar24design.SellerActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.dokandar24design.Adapter.AllProductsAdapter.ProductsAdapter;
import com.example.dokandar24design.Model.AllProducts.ProductsModel;
import com.example.dokandar24design.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AllProductsShowActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private TextView name,phone,joiningDate;
    private Button shopeCode;

    private RecyclerView recyclerView;

    private List<ProductsModel> list;
    private ProductsAdapter productsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products_show);

        productList();


        init();

        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        productsAdapter=new ProductsAdapter(this,list);
        recyclerView.setAdapter(productsAdapter);




    }

    private void init() {


        circleImageView=findViewById(R.id.profileimage);
        recyclerView=findViewById(R.id.recyclerView_id);

        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        joiningDate=findViewById(R.id.joiningDate);

        shopeCode=findViewById(R.id.shopcode);

    }

    private void productList() {

        list=new ArrayList<>();
        list.add(new ProductsModel(R.drawable.shoss,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.laptop,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.sanglass,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.laptop,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.sanglass,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.shoss,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.laptop,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.sanglass,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.laptop,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.shoss,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.laptop,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.sanglass,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.sanglass,"Dokandar24","2000"));
        list.add(new ProductsModel(R.drawable.laptop,"Dokandar24","2000"));
    }
}