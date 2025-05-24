package com.example.demo.Q9_Crud;

import java.util.*;
public class UserService{
    //we add arry but it can take fix amount of data
    private List<User> user = new ArrayList<>(); //list is a interface and empty arrylist
//C
    public void addUser(User u){  //public void addUser(int i)
        user.add(u);
    }
//Read
    public User getUserById(String Id){
        // for(User u:user){  //(datatype nameassign : ArrayListuser)
        //     if(u.getId().equals(Id)){
        //         return u;
        //     }
        // }
        for(int i =0;i<user.size();i++){
            if(user.get(i).getId().equals(Id)){
                return user.get(i);
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