package com.example.demo.Q12_MVC_Interface.Controller;

import java.util.List;

import com.example.demo.Q12_MVC_Interface.Model.User;
import com.example.demo.Q12_MVC_Interface.Service.IRepository.IUserService;

public class UserController {
    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }
    
    public void createUser(String id, String name, String email , int mobile_no){
            userService.add(new User(id,name,email,mobile_no));

        }
    public boolean updateUser(String id, String name, String email,int mobile_no){
         return userService.update(id, new User(id,name,email,mobile_no));
    }
    public boolean removeUser(String id){
        return userService.remove(id);
    }
    public User getUser(String id){
        return userService.getById(id);
    }
    public List<User> getAllUsers(){
        return userService.getAll();
    }
    public boolean patch(String id, String name, String email,int mobile_no){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setMobile_no(mobile_no);
        return userService.patch(id, user);
    }
    
}