package com.example.demo.Q11_MVC.View;
import com.example.demo.Q11_MVC.Model.*;
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
