package com.example.dokandar24design.Model.AllProducts;

public class ProductsModel {

    int image;
    String productsName;
    String price;

    public  ProductsModel(){

    }

    public ProductsModel(int image, String productsName, String price) {
        this.image = image;
        this.productsName = productsName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
