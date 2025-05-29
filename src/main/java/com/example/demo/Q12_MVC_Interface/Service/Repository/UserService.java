package com.example.demo.Q12_MVC_Interface.Service.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Q12_MVC_Interface.Model.User;
import com.example.demo.Q12_MVC_Interface.Service.IRepository.IUserService;

public class UserService implements IUserService {
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
    public void add(User user){
        User u = getById(user.getId());
        if(u == null){
            us.add(user);
        }
    }

    //Get all user
    public List<User> getAll(){ //use foreach 
      return us;
    }

    //update
    public boolean update(String id,User user){
        User oldUser =getById(id);
        if(oldUser != null){
            oldUser.setName(user.getName());
            oldUser.setEmail(user.getEmail());
            oldUser.setMobile_no(user.getMobile_no());
            return true;
        }
        return false;
    }

    //patch
    @Override
    public boolean patch(String id,User user){
        User oldUser = getById(id);
        if(oldUser != null){
            if(user.getName()!= null && !user.getName().isEmpty()){
                oldUser.setName(user.getName());
            }
            if(user.getEmail()!= null && !user.getEmail().isEmpty()){
                oldUser.setEmail(user.getEmail());
            }
            if(user.getMobile_no()!= 0){
                oldUser.setMobile_no((user.getMobile_no()));
            }
            return true;

        }
        return false;
    }

    //Delete
    public boolean remove(String id){
        User oldUser = getById(id);   
        if(oldUser !=null){
            us.remove(oldUser);
            return true;
        }
        return false;
    }
}
