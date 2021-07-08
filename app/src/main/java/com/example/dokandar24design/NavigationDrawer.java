package com.example.dokandar24design;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.dokandar24design.Adapter.AllProductsAdapter.HomeAdapter;
import com.example.dokandar24design.AgentActivity.AgentLoginActivity;
import com.example.dokandar24design.AgentActivity.AgentRegisteredActivity;
import com.example.dokandar24design.AgetProfileMainActivity.AgentUpdateProfileActivity;
import com.example.dokandar24design.DeliveryBoyActivity.DeliveryBoyUpdateProfileActivity;
import com.example.dokandar24design.DeliveryBoyActivity.DeliveryLoginActivity;
import com.example.dokandar24design.DeliveryBoyActivity.DeliveryRegActivity;
import com.example.dokandar24design.Model.AllProducts.HomeModel;
import com.example.dokandar24design.SellerActivity.SellerLoginActivity;
import com.example.dokandar24design.SellerActivity.SellerRegisteredActivity;
import com.example.dokandar24design.SellerProfileActivity.UpdateProfileActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class NavigationDrawer extends AppCompatActivity {


    private MaterialToolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerView recyclerView;

    private HomeAdapter homeAdapter;
    private List<HomeModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        toolbar = findViewById(R.id.tollbar);


        getlist();

        init();


        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager=new GridLayoutManager(this,3);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        homeAdapter=new HomeAdapter(this,list);
        recyclerView.setAdapter(homeAdapter) ;






        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawer(GravityCompat.START);
                if (item.getItemId() == R.id.home_menu) {
                    Toast.makeText(NavigationDrawer.this, "Home", Toast.LENGTH_SHORT).show();
                }

                else if (item.getItemId() == R.id.login_reg_menu) {
                    startActivity(new Intent(NavigationDrawer.this, SellerRegisteredActivity.class));
                }

                else if (item.getItemId() == R.id.login_menu) {
                    startActivity(new Intent(NavigationDrawer.this, SellerLoginActivity.class));
                }
                else if (item.getItemId() == R.id.updateProfile) {
                    startActivity(new Intent(NavigationDrawer.this, UpdateProfileActivity.class));
                }
                else if (item.getItemId() == R.id.agent_login_menu) {
                    startActivity(new Intent(NavigationDrawer.this, AgentLoginActivity.class));
                }
                else if (item.getItemId() == R.id.agent_reg_menu) {
                    startActivity(new Intent(NavigationDrawer.this, AgentRegisteredActivity.class));
                }
                else if (item.getItemId() == R.id.agentUpdateProfile) {
                    startActivity(new Intent(NavigationDrawer.this, AgentUpdateProfileActivity.class));
                }
                else if (item.getItemId() == R.id.delivery_login_menu) {
                    startActivity(new Intent(NavigationDrawer.this, DeliveryLoginActivity.class));
                }

                else if (item.getItemId() == R.id.delivery_reg_menu) {
                    startActivity(new Intent(NavigationDrawer.this, DeliveryRegActivity.class));
                }

                else if (item.getItemId() == R.id.deliveryBoyagentUpdateProfile) {
                    startActivity(new Intent(NavigationDrawer.this, DeliveryBoyUpdateProfileActivity.class));
                }



                else {
                    Toast.makeText(NavigationDrawer.this, "Others", Toast.LENGTH_SHORT).show();
                }
                /*    switch (item.getItemId()) {
                    case R.id.home_menu: {
                        Toast.makeText(NavigationDrawer.this, "Home", Toast.LENGTH_SHORT).show();
                    }
                    case R.id.cart_menu:
                        Toast.makeText(NavigationDrawer.this, "Cart Menu", Toast.LENGTH_SHORT).show();

                    case R.id.category_menu:
                        Toast.makeText(NavigationDrawer.this, "Category Menu", Toast.LENGTH_SHORT).show();

                    case R.id.orderTracking_menu:
                        Toast.makeText(NavigationDrawer.this, "Order Tracking Menu", Toast.LENGTH_SHORT).show();

                    case R.id.account_menu:
                        Toast.makeText(NavigationDrawer.this, "Account Menu", Toast.LENGTH_SHORT).show();

                    case R.id.contact_menu:
                        Toast.makeText(NavigationDrawer.this, "Contact Menu", Toast.LENGTH_SHORT).show();

                    case R.id.login_menu:
                        Toast.makeText(NavigationDrawer.this, "Login", Toast.LENGTH_SHORT).show();
//                        Intent login=new Intent(NavigationDrawer.this,SellerLoginActivity.class);
//                        startActivity(login);

                    case R.id.login_reg_menu:
                        Toast.makeText(NavigationDrawer.this, "Registration", Toast.LENGTH_SHORT).show();
                        *//*Intent reg=new Intent(NavigationDrawer.this,SellerRegisteredActivity.class);
                        startActivity(reg);*//*

                    case R.id.agent_login_menu:{

                    }


                    case R.id.agent_reg_menu:
                        Toast.makeText(NavigationDrawer.this, "Home", Toast.LENGTH_SHORT).show();
                }*/


                return true;
            }
        });


    }

    private void getlist() {


        list=new ArrayList<>();

        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shir20t,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));

        list.add(new HomeModel(R.drawable.sanglass,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.product,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.laptop,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));

        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shir20t,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokndar24","100tk"));

        list.add(new HomeModel(R.drawable.sanglass,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.product,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.laptop,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));


        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shir20t,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.image_prodcuts,"Dokandar24","100tk"));

        list.add(new HomeModel(R.drawable.sanglass,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.product,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.laptop,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));



        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shir20t,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokndar24","100tk"));
        list.add(new HomeModel(R.drawable.shirt,"Dokandar24","100tk"));
        list.add(new HomeModel(R.drawable.shoss,"Dokandar24","100tk"));


    }

    private void init() {

        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawerLayout);
        recyclerView = findViewById(R.id.recyclerVIew_home_id);

    }
}