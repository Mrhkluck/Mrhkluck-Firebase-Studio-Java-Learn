package com.example.demo.Q9_Crud;

// Implement a simple in-memory CRUD system in Java to manage User records.
// Your program should include the following:
// A User class with fields: id, name, and email.
// A UserService class that supports the following operations:
// addUser(User user) – to add a new user.
// getUserById(int id) – to retrieve a user by ID.
// updateUser(int id, String newName, String newEmail) – to update a user’s details.
// deleteUser(int id) – to delete a user by ID.
// getAllUsers() – to print all users.
// A Main class to demonstrate all CRUD operations.

public class User {
    private String id;
    private String name;
    private String email;
    
    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        name=n;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String e){
        this.email=e;
    }
//name Np and P constructor
    public User(){};
    public User(String id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    //jab humlog khud ka new object bnate hain to toString ko override karete hain nhi dung ga toh hashcode print hoga

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
