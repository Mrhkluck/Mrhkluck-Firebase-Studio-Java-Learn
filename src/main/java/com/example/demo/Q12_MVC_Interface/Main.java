package com.example.demo.Q12_MVC_Interface;

import com.example.demo.Q12_MVC_Interface.Controller.ProductController;
import com.example.demo.Q12_MVC_Interface.Controller.UserController;
import com.example.demo.Q12_MVC_Interface.Service.Repository.ProductService;
import com.example.demo.Q12_MVC_Interface.Service.Repository.UserService;
import com.example.demo.Q12_MVC_Interface.View.ProductView;

public class Main {
    public static void main(String[] args) {
    //dependency inject karte hai but humlog yahan manually kar rahen hain

        UserService ser = new UserService();
       // UserView view = new UserView();
        UserController control = new UserController(ser); //view);
        
        control.createUser("Mrkl123", "Rashid", "mrjkdf@gmai;lafas",921480);
        control.createUser("laudra123","burchodi","burchatta@pornhub.com",69);
        control.getUser("Mrhk2323");
        control.getAllUsers();

        control.removeUser("nullsdf");
        control.getAllUsers();


        ProductService service = new ProductService();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(service, view);
        controller.createProduct("876", "Mrhk", 0.2f);
        controller.createProduct("875", "Rashid", 097.56f);
        controller.readAllProduct();
        controller.deleteProd("875");
        controller.readAllProduct();
        controller.updateProduct("876", "Lucky", 100.097f);
        controller.readAllProduct();
    }
}

//interferance main use for contract , sab ka name same ho sake
//ek si unit wala kam karna hoga -- sab k liye common 
//multiple inharitance

