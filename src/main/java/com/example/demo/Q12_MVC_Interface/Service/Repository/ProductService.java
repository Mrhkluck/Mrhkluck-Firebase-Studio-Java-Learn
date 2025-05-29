package com.example.demo.Q12_MVC_Interface.Service.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Q12_MVC_Interface.Model.Product;
import com.example.demo.Q12_MVC_Interface.Service.IRepository.IProductService;

// same level pa extends 
//class to interface --- implements
public class ProductService implements IProductService
 {
    private List<Product> productlist = new ArrayList<>();

    //get id
    public Product getById(String id){
        for(Product p:productlist){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    } 

//add
    public void add(Product prod){
        Product oldProduct= getById(prod.getId());
        if(oldProduct == null){
            productlist.add(prod);
        }
    }

//get all id

    public List<Product> getAll(){
        return productlist;
    }

// update
    public boolean update(String id , Product prod){
        Product oldProduct = getById(id);
        if(oldProduct != null){
            oldProduct.setPrice(prod.getPrice());
            oldProduct.setName(prod.getName());
            return true;
        }
        return false;
    }

// remove

    public boolean remove(String id){
        Product oldProduct = getById(id);
        if(oldProduct != null){
           productlist.remove(oldProduct); 
           return true;
        }
        return false;
    }

    //patch update

    public boolean patch(String id,Product prod){
        Product oldProduct = getById(id);
        if(oldProduct != null){
            if(prod.getName() != null){
                oldProduct.setName(prod.getName());
            }
            if(prod.getPrice() != 0.0f){
                oldProduct.setPrice(prod.getPrice());
            }  
            return true;
        }
        return false;
    }

}
