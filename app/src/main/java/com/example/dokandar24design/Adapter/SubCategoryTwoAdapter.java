package com.example.dokandar24design.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dokandar24design.R;


public class SubCategoryTwoAdapter extends RecyclerView.Adapter<SubCategoryTwoAdapter.MyViewHolder>
{
  private Context context;
  String[] subCategorys;
   private  ProductAdapter productAdapter;
   private String [] products={"Product 1","Product  2","Product  3","Product  4"};
    public SubCategoryTwoAdapter(Context context, String[] subCategorys) {
        this.context = context;
        this.subCategorys = subCategorys;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sub_category_two_item_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCategoryTwoAdapter.MyViewHolder holder, int position) {

        holder.subCategoryTextview.setText(subCategorys[position]);
        holder.productRecyclerView.setHasFixedSize(true);
        holder.productRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        productAdapter=new ProductAdapter(context,products);
        holder.productRecyclerView.setAdapter(productAdapter);


    }

    @Override
    public int getItemCount() {
        return subCategorys.length;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        private TextView subCategoryTextview;
        private RecyclerView productRecyclerView;

        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);

            subCategoryTextview=itemView.findViewById(R.id.subCategoryTextView);
            productRecyclerView=itemView.findViewById(R.id.productRecyclerView);


        }
    }
}
