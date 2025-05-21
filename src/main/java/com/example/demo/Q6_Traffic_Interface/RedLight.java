package com.example.demo.Q6_Traffic_Interface;

public class RedLight implements TrafficLight{
    @Override
    public void changeLight(){
        System.out.println("RedLight Says STOP");
    }

    @Override
    public void changeLight(int duration){
        System.out.println("RedLight Says STOP for " + duration);
    }
}
