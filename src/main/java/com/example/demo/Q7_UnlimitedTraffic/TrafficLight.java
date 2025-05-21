package com.example.demo.Q7_UnlimitedTraffic;

public class TrafficLight {

    private Light currentLight;

    public TrafficLight() {
        this.currentLight = new RedLight();
    }

    public void changeLight() {
        currentLight.showLight();
        currentLight = currentLight.nextState();
    }

}
