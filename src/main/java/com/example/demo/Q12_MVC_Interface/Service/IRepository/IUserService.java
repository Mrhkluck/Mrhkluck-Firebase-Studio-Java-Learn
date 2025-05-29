package com.example.demo.Q12_MVC_Interface.Service.IRepository;

import com.example.demo.Q12_MVC_Interface.Model.User;

public interface IUserService extends IService<User> {
    boolean update(String id, User user);
    boolean patch(String id,User user);

}