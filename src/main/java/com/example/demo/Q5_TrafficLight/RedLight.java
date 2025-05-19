package com.example.demo.Q5_TrafficLight;

public class RedLight extends TrafficLight{
    @Override
    public void changeLight(){
        System.out.println("RedLight Says STOP");
    }

    @Override
    public void changeLight(int duration){
        System.out.println("RedLight Says STOP for " + duration);
    }
}
