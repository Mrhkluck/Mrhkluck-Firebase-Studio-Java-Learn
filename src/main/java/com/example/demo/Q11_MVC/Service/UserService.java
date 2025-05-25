package com.example.demo.Q11_MVC.Service;

import com.example.demo.Q11_MVC.Model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> us = new ArrayList<>();

    //get by id
    public User getById(String id){
        for(User u: us){
            if(u.getId().equals(id)) {
                return u;
            }
            
        }
        return null;
    }
    //Add User
    public void addUser(User user){
        User u = getById(user.getId());
        if(u == null){
            us.add(user);
        }
    }

    //Get all user
    public List<User> getAllUser(){ //use foreach 
      return us;
    }

    //update
    public boolean updateUser(String id,String name,String email, int number){
        User oldUser =getById(id);
        if(oldUser != null){
            oldUser.setName(name);
            oldUser.setEmail(email);
            oldUser.setMobile_no(number);
            return true;
        }
        return false;
    }

    //Delete
    public boolean deleteUser(String id){
        User oldUser = getById(id);   
        if(oldUser !=null){
            us.remove(oldUser);
            return true;
        }
        return false;
    }
}
