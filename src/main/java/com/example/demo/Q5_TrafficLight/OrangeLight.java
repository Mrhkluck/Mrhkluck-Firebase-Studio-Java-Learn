package com.example.demo.Q5_TrafficLight;

public class OrangeLight extends TrafficLight{
    @Override
    public void changeLight(){
        System.out.println("OrangeLight Says WAIT");
    }

    @Override
    public void changeLight(int duration){
        System.out.println("OrangeLight Says WAIT for " + duration);
    }
}
