package com.example.demo.Q6_Traffic_Interface;
   
public class GreenLight implements TrafficLight{
        @Override
        public void changeLight(){
            System.out.println("GreenLight Says GO");
        }

        @Override
        public void changeLight(int duration){
            System.out.println("GreenLight Says GO " + duration);
        }
}
