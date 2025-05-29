package com.example.demo.Q12_MVC_Interface.Service.IRepository;
import com.example.demo.Q12_MVC_Interface.Model.Product;
public interface IProductService extends IService<Product>{
    public abstract boolean update(String id , Product product);
    boolean patch(String id , Product product);
}
