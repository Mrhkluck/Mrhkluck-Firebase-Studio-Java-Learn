package com.example.demo.Q9_Crud;


public class Main{
    public static void main(String args[]){
        
        User u1= new User();
        u1.setId("Mrhk123");
        u1.setName("Rashid");
        u1.setEmail("mrhkluck@gmail.com");


        UserService us= new UserService();
        us.addUser(u1);
        us.getAllUsers();
        System.out.println();
        
        User u2= new User("Haluid123","Aadil","aadillove@outlook.com");
        us.addUser(u2);   
        us.getAllUsers();
        System.out.println();

        User t = us.getUserById("Haluid123");
        if(t!=null){
           System.out.println( t.toString());
        }else{
            System.out.println("User not found");
        }
        System.out.println();

        System.out.println(us.updateUser("Mrhk123","Lucky","luck@gmail.com"));
        System.out.println();
        us.getAllUsers();
        System.out.println();

        User u3= new User("Landa123","Furry","furry@outlook.com");
        us.addUser(u3);
        us.getAllUsers();
        System.out.println();

        User u4 = new User();  //int a = 10 a++
        u4.setId("Kallu123");
        u4.setName("KalluKaliya");
        u4.setEmail("kallukaliya@hotmail.com");
        us.addUser(u4);
        us.getAllUsers();
        System.out.println();

        us.deleteUser("Landa123");
        us.getAllUsers();

    }


}