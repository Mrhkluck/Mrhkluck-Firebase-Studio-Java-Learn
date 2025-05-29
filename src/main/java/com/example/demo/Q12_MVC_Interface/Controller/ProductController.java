package com.example.demo.Q12_MVC_Interface.Controller;

import java.util.List;

import com.example.demo.Q12_MVC_Interface.Model.Product;
import com.example.demo.Q12_MVC_Interface.Service.IRepository.IProductService;
import com.example.demo.Q12_MVC_Interface.View.ProductView;

public class ProductController {
    private IProductService service;
    private ProductView view;

    public ProductController(IProductService service, ProductView view) {
        this.service = service;
        this.view = view;
    }

    public void createProduct(String id,String name, float price){
       // Product prod = new Product(id, name, price);
        service.add(new Product(id, name, price));
        view.displayMsg("Product added");
    }

  // read 
    public void readProduct(String id) {
        service.getById(id);
        view.displayProduct(service.getById(id));
    }

    public void readAllProduct(){
        List<Product> rau = service.getAll();
        if (rau.isEmpty()) {
            view.displayMsg("koi bhi Product nhi list khalli hai bsdk");
        } else {
            for (Product u : rau) {
                view.displayProduct(u);
            }
        }
    }

    // Update 
    public void updateProduct(String id, String newName, float newPrice) {
        service.update(id ,new Product(id, newName, newPrice));
        view.displayMsg(  "Prod updated successfully.");
    }

    // delete
    public void deleteProd(String id) {
        service.remove(id);
        view.displayMsg("Prod deleted successfully.");
    }

    //PATCH

    public void patchProduct(String id,String newName, float newPrice){

        Product prod1 = new Product(id, newName, newPrice);
        service.patch(id, prod1);
        view.displayMsg("Product Pach Successfully");
    } 

}
