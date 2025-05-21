package com.example.demo.Q7_UnlimitedTraffic;

public class GreenLight implements Light{
    @Override
    public void showLight() {
        System.out.println("GreenLight - GO");
    }

    @Override
    public Light nextState() {
        return new RedLight();
    }
    
}
