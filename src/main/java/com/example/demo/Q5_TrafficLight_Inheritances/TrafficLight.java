// Create a base class TrafficLight with the following:
// A method named changeLight() that prints a generic message like "Changing light...".
// Create subclasses RedLight, GreenLight, and YellowLight that inherit from TrafficLight and:
// Override the changeLight() method to print a message specific to the light color:
// For RedLight, print "Red light - Stop!"
// For GreenLight, print "Green light - Go!"
// For YellowLight, print "Yellow light - Slow down!"
// (Optional for method overloading): In any of the classes, implement method overloading by creating multiple versions of the changeLight() method. For example:
// changeLight() – no arguments.
// changeLight(int duration) – where duration specifies how long the light stays on.
// Write a main function or test script that:
// Creates objects for each light class.
// Calls their respective changeLight() methods to demonstrate overriding.
// If overloading is implemented, call the overloaded method with a parameter.

package com.example.demo.Q5_TrafficLight_Inheritances;

public class TrafficLight{
    public void changeLight(){
        System.out.println("Changing light...");
    }

    public void changeLight(int duration){
        System.out.println("Changing light for " + duration);
    }
}
