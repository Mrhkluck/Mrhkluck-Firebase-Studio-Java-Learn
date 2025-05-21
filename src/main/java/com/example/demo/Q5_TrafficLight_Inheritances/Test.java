package com.example.demo.Q5_TrafficLight_Inheritances;

public class Test {
    public static void main(String[] args) {
        TrafficLight redLight = new TrafficLight();
        TrafficLight greenLight = new TrafficLight();
        TrafficLight yellowLight = new TrafficLight();

        redLight.changeLight();
        greenLight.changeLight();
        yellowLight.changeLight();
        System.out.println();
        redLight.changeLight(5);
        greenLight.changeLight(10);
        yellowLight.changeLight(15);
    }

}
