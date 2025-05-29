package com.example.demo.Q12_MVC_Interface.Model;

public class User {
    private String id;
    private String name;
    private String email;
    private int mobile_no;
    //getter and setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getMobile_no() {
        return mobile_no;
    }
    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    //constructer
    public User(){};
    public User(String id, String name, String email, int mobile_no) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
    }

     // data store formate
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobile_no=" + mobile_no + "]";
    }
}

