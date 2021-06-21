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


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>
{
  private Context context;
  String[] products;

    public ProductAdapter(Context context, String[] products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.product_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position) {

        holder.textView.setText(products[position]);

    }

    @Override
    public int getItemCount() {
        return products.length;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        private TextView textView;
         public MyViewHolder(@NonNull  View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.productName);
         }
    }
}
