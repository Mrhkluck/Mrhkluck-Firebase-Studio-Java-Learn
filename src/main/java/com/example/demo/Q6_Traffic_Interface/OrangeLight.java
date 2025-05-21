package com.example.demo.Q6_Traffic_Interface;

public class OrangeLight implements TrafficLight{
    @Override
    public void changeLight(){
        System.out.println("OrangeLight Says WAIT");
    }

    @Override
    public void changeLight(int duration){
        System.out.println("OrangeLight Says WAIT for " + duration);
    }
}
