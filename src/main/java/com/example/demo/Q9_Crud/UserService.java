package com.example.demo.Q9_Crud;

import java.util.*;
public class UserService{
    //we add arry but it can take fix amount of data
    private List<User> user = new ArrayList<>(); //list is a interface and empty arrylist
//C
    public void addUser(User u){
        user.add(u);
    }
//R
    public User getUserById(String Id){
        for(User u:user){  //(datatype nameassign : ArrayListuser)
            if(u.getId().equals(Id)){
                return u;
            }
        }
        return null;
    }
    public void getAllUsers(){
        for (User u:user){
            System.out.println(u.toString());
        }
    }
// U
    public boolean updateUser(String id,String name,String email){
        User oldUser = getUserById(id);
        if(oldUser != null){
            oldUser.setName(name);
            oldUser.setEmail(email);
            return true;
        }
        return false;
    }

// D
    public boolean deleteUser(String id){
        User oldUser = getUserById(id);
        if(oldUser !=null){
            user.remove(oldUser);
            return true;
        }
        return false;
    }
}