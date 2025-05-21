package com.example.demo.Q7_UnlimitedTraffic;

public class YellowLight  implements Light{
    @Override
    public void showLight() {
        System.out.println("YellowLight - BE READY");
    }

    @Override
    public Light nextState() {
        return new GreenLight();
    }
    
}
