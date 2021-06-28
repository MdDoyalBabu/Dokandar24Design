package com.example.dokandar24design.Model.AllProducts;

public class HomeModel {


    int image;
    String product_name;
    String price;


    public HomeModel(){

    }


    public HomeModel(int image, String product_name, String price) {
        this.image = image;
        this.product_name = product_name;
        this.price = price;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
