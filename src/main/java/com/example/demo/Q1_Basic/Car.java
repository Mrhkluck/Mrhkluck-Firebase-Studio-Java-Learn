package com.example.demo.Q1_Basic;

public class Car {
    // Write a Java program using OOPs concepts to model a simple Car with the following:
    // A Car class with the following:
    // Data members: brand, color, and speed. // by default -- default if not given the  take private
    // A method displayInfo() that prints the car's details.
    // A constructor to initialize all properties.
    // Create a main() method to:
    // Create an object of the Car class.
    // Call the displayInfo() method.
    // change value to green ,70 for that we need to create getter and setter
    //because of private access modifier 
    //since it not user define we can skip scanner

// Suggested code may be subject to a license. Learn more: ~LicenseLog:1400810800.
    private String brand;
    private String color;
    private double speed;

    //default value or jab hum khud se den

    public Car (String brand,String color,double speed){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }

    public void displayInfo(){
        System.out.println("Brand: " +brand+ "\nColor: " +color+ "\nSpeed: " +speed);
    }

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String b){
        this.brand=b;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String c){
        this.color=c;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setSpeed(double s){
        this.speed=s;
    }
}
