package com.example.demo.Q11_MVC;
//import Controller.ProductController;
import com.example.demo.Q11_MVC.Controller.*;
import com.example.demo.Q11_MVC.Model.User.*;
//import Service.ProductService;
import com.example.demo.Q11_MVC.Service.*;
//import View.ProductView;
import com.example.demo.Q11_MVC.View.*;
public class Main {
    public static void main(String[] args) {
    //dependency inject karte hai but humlog yahan manually kar rahen hain

        // UserService service = new UserService();
        // UserView view = new UserView();
        // UserController controller = new UserController(service, view);
        
        // controller.createUser("Mrkl123", "Rashid", "mrjkdf@gmai;lafas",921480);
        // controller.createUser("laudra123","burchodi","burchatta@pornhub.com",69);
        // controller.readUser("Mrhk2323");
        // controller.readAllUser();

        // controller.deleteUser("nullsdf");
        // controller.readAllUser();


        ProductService service = new ProductService();
        ProductView view = new ProductView();
        ProductController controller = new ProductController(service, view);

        controller.createProduct(876, "Mrhk", 0.2f);
        controller.createProduct(875, "Rashid", 097.56f);

        controller.readAllProduct();
        controller.deleteProd(875);

        controller.readAllProduct();

        controller.updateProd(876, "Lucky", 100.097f);
        controller.readAllProduct();


    }

}
