 package com.example.demo.Q7_UnlimitedTraffic;

public  class Test {

    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        light = new TrafficLight();
        for(; true;){
            light.changeLight();
            Thread.sleep((int)(Math.random()*10000+2000));
            
        }
    }
}