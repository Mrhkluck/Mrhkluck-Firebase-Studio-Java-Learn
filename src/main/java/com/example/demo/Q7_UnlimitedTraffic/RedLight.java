package com.example.demo.Q7_UnlimitedTraffic;

public class RedLight implements Light{
    @Override
    public void showLight() {
        System.out.println("RedLight - STOP");
    }

    @Override
    public Light nextState() {
        return new YellowLight();

    }
}
