package com.example.demo.Q12_MVC_Interface.Model;

public class Product {
    //id name price 
    private String id;
    private String name;
    private float price;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "id = " +id+ " Product_Name = " +name+ " Product_Price = "+price;
    }
    

}
