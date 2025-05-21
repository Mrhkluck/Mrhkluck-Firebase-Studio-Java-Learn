package com.example.demo.Q7_UnlimitedTraffic;
// You are tasked with creating a traffic light simulation in Java using object-oriented principles. The system should simulate the behavior of a real-world traffic signal, cycling through Yellow → Green → Red → Yellow... and displaying a countdown timer for each light duration.
// Implement the program such that:
// Each light (Red, Yellow, Green) is a separate class implementing a TrafficLight interface.
// Each light knows what the next state should be.
// The system begins with a YellowLight, and loops through 7 transitions.
// For each light:
// The name and action should be printed (e.g., GreenLight - GO).
// A random timer (between 2 to 12 seconds) should be generated.
// A countdown should be displayed for each second remaining.
public interface Light{

    public void showLight();

    public Light nextState(); //light will be parent

    //her ka apna apna function bnana parta but oop concept will get fail
}