package com.example.demo.Q6_Traffic_Interface;

public class Test {
    public static void main(String[] args) {
        // TrafficLight redLight = new TrafficLight();
        // TrafficLight greenLight = new TrafficLight();
        // TrafficLight yellowLight = new TrafficLight();

        TrafficLight redLight= new RedLight ();
        TrafficLight greenLight = new GreenLight();
        TrafficLight orangeLight = new OrangeLight();

        redLight.changeLight();
        greenLight.changeLight();
        orangeLight.changeLight();
        System.out.println();
        redLight.changeLight(5);
        greenLight.changeLight(10);
        orangeLight.changeLight(15);
    }

}
