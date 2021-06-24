package com.example.dokandar24design.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dokandar24design.R;


public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.MyViewHolder>
{
  private Context context;
  String categoryName;
  String[] subCategorys;
    private  SubCategoryTwoAdapter subCategoryTwoAdapter;
    String [] subCategorysTwo={"Sub Category Two","Sub Category Two-2","Sub Category Two","Sub Category Two-2"};

    public SubCategoryAdapter(Context context, String categoryName, String[] subCategorys) {
        this.context = context;
        this.categoryName = categoryName;
        this.subCategorys = subCategorys;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sub_category_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryAdapter.MyViewHolder holder, int position) {

        holder.categoryTextView.setText(categoryName);
        holder.subCategoryTextview.setText(subCategorys[position]);
        holder.recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recyclerView.setLayoutManager(linearLayoutManager);
        subCategoryTwoAdapter=new SubCategoryTwoAdapter(context,subCategorysTwo);
        holder.recyclerView.setAdapter(subCategoryTwoAdapter);
    }

    @Override
    public int getItemCount() {
        return subCategorys.length;    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        private TextView categoryTextView,subCategoryTextview;
        private RecyclerView recyclerView;

        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);

            recyclerView=itemView.findViewById(R.id.subCategoryRecyclerView);
            categoryTextView=itemView.findViewById(R.id.categoryTextView);
            subCategoryTextview=itemView.findViewById(R.id.subCategoryTextView);


        }
    }
}
