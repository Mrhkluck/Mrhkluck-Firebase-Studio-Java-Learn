package com.example.demo.Q11_MVC.Controller;
//middlewaere waiter manage view to model and vice verca
import java.util.List;
import com.example.demo.Q11_MVC.Model.*;
import com.example.demo.Q11_MVC.Service.*;
import com.example.demo.Q11_MVC.View.*;

public class ProductController {
    private ProductService service;
    private ProductView view;

    public ProductController(ProductService service, ProductView view) {
        this.service = service;
        this.view = view;
    }

    public void createProduct(int id,String name, float price){
       // Product prod = new Product(id, name, price);
        service.addProduct(new Product(id, name, price));
        view.displayMsg("Product added");
    }

  // read 
    public void readProduct(int id) {
        // service.getById(id);
        view.displayProduct(service.getbyId(id));
    }

    public void readAllProduct(){
        List<Product> rau = service.getAllProducts();
        if (rau.isEmpty()) {
            view.displayMsg("koi bhi Product nhi list khalli hai bsdk");
        } else {
            for (Product u : rau) {
                view.displayProduct(u);
            }
        }
    }

    // Update 
    public void updateProd(int id, String newName, float newPrice) {
        service.updateProd(new Product(id, newName, newPrice));
        view.displayMsg(  "Prod updated successfully.");
    }

    // delete
    public void deleteProd(int id) {
        service.removeProd(id);
        view.displayMsg("Prod deleted successfully.");
    }
}
