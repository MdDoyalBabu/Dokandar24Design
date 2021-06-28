package com.example.dokandar24design.Adapter.AllProductsAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dokandar24design.Model.AllProducts.HomeModel;
import com.example.dokandar24design.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Holder> {



    Context context;
    List<HomeModel> modelList;

    public HomeAdapter(Context context, List<HomeModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @NotNull
    @Override
    public HomeAdapter.Holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(context).inflate(R.layout.home_page_layout,parent,false);


        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull HomeAdapter.Holder holder, int position) {


        holder.imageView.setImageResource(modelList.get(position).getImage());
        holder.productName.setText(modelList.get(position).getProduct_name());
        holder.price.setText(modelList.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView productName;
        TextView price;

        public Holder(@NonNull @NotNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_id);
            productName=itemView.findViewById(R.id.product_id);
            price=itemView.findViewById(R.id.price_id);


        }
    }
}
