package com.example.demo.Q5_TrafficLight;
   
public class GreenLight extends TrafficLight{
        @Override
        public void changeLight(){
            System.out.println("GreenLight Says GO");
        }

        @Override
        public void changeLight(int duration){
            System.out.println("GreenLight Says GO " + duration);
        }
}
