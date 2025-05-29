package com.example.demo.Q12_MVC_Interface.Service.IRepository;

import java.util.List;

//abs and public apne aap likha jata hai
public interface IService<T> {
    //we are using here generic
        public abstract void add(T item);
        boolean remove(String id);
        List<T> getAll();
        T getById(String id);
    
    }
    
