package com.example.dokandar24design.Adapter;

import android.content.Context;
import android.icu.util.ULocale;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dokandar24design.Model.CategoryModel;
import com.example.dokandar24design.R;

import java.util.List;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder>
{
  private Context context;
  String[] categoryNames;
  private SubCategoryAdapter subCategoryAdapter;
  private String[] subCategorys={"Sub Category 1","Sub Category 2","Sub Cateogry 3"};

    public CategoryAdapter(Context context, String[] categoryNames) {
        this.context = context;
        this.categoryNames = categoryNames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.m_category_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder holder, int position) {
      //  holder.textView.setText(categoryNames[position]);

        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        subCategoryAdapter=new SubCategoryAdapter(context,categoryNames[position],subCategorys);
        holder.recyclerView.setAdapter(subCategoryAdapter);

    }

    @Override
    public int getItemCount() {
        return categoryNames.length;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        private TextView textView;
        private RecyclerView recyclerView;
        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);
           // textView=itemView.findViewById(R.id.categoryTextView);
            recyclerView=itemView.findViewById(R.id.subCategoryRecyclerView);
        }
    }
}
