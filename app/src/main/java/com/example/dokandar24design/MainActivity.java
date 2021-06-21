package com.example.dokandar24design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dokandar24design.Adapter.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

        private RecyclerView  recyclerView;
        private CategoryAdapter categoryAdapter;
        String[] categoryData={"Category1","Category2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.categoryRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        categoryAdapter=new CategoryAdapter(this,categoryData);
        recyclerView.setAdapter(categoryAdapter);




    }
}