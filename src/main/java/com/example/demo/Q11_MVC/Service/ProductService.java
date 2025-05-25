package com.example.demo.Q11_MVC.Service;
import java.util.*;
import com.example.demo.Q11_MVC.Model.*;
public class ProductService {
    private List<Product> productlist = new ArrayList<>();

    //get id
    public Product getbyId(int id){
        for(Product p:productlist){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    } 

//add
    public void addProduct(Product addProd){
        Product oldProduct= getbyId(addProd.getId());
        if(oldProduct == null){
            productlist.add(addProd);
        }
    }

//get all id

    public List<Product> getAllProducts(){
        return productlist;
    }

// update
    public void updateProd(Product prod){
        Product oldProduct = getbyId(prod.getId());
        if(oldProduct != null){
            oldProduct.setPrice(prod.getPrice());
            oldProduct.setName(prod.getName());
        }
    }

// remove

    public void removeProd(int prod){
        Product oldProduct = getbyId(prod);
        if(oldProduct != null){
           productlist.remove(oldProduct); 
        }
    }

    //patch update

    public void patchProd(Product prod){
        Product oldProduct = getbyId(prod.getId());
        if(oldProduct != null){
            if(!oldProduct.getName().equals(prod.getName())){
                oldProduct.setName(prod.getName());
            }
            if(oldProduct.getPrice() != prod.getPrice()){
                oldProduct.setPrice(prod.getPrice());
            }  
        }
    }

}
