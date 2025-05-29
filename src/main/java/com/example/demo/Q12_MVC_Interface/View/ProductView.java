package com.example.demo.Q12_MVC_Interface.View;

import com.example.demo.Q12_MVC_Interface.Model.Product;

public class ProductView {
    //display Product

    public void displayProduct(Product prod){
        if(prod != null){
            System.out.println(prod.toString());
        }
        else{
            System.out.println("Product not found garnd mara");
        }
        System.out.println();
    }

    //display msg
    public void displayMsg(String msg){
        System.out.println(msg +"\n");
    }
}
