package com.example.dokandar24design.Adapter.AllProductsAdapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dokandar24design.Model.AllProducts.HomeModel;
import com.example.dokandar24design.ProductsViewActivity.ViewActivity;
import com.example.dokandar24design.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Holder> {



    Activity context;
    List<HomeModel> modelList;

    public HomeAdapter(Activity context, List<HomeModel> modelList) {
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


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,ViewActivity.class);

                Pair[] pairs=new Pair[1];
                pairs[0]=new Pair<View,String>(holder.imageView,"btn");


                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(context,pairs);

                context.startActivity(i,optionsCompat.toBundle());
            }
        });


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imageView;
        TextView productName;
        TextView price;
        Button add,view;

        public Holder(@NonNull @NotNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_id);
            productName=itemView.findViewById(R.id.product_id);
            price=itemView.findViewById(R.id.price_id);
            add=itemView.findViewById(R.id.add_btn);
            view=itemView.findViewById(R.id.view_btn);
            cardView=itemView.findViewById(R.id.cardview_id);


            //image show animation

            cardView.setAlpha(0f);
            cardView.setTranslationY(10);
            cardView.animate().alpha(1f).translationYBy(0).setStartDelay(100).setDuration(2500);



        }
    }
}
