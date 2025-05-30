package com.example.demo.Q_1.a_Condition_Example;

import java.util.Scanner;

// In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
// Wikipedia if-else flow chart
// Source: Wikipedia
// Task
// Given an integer, , perform the following conditional actions:
// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print Not Weird
// If n is even and in the inclusive range of 6 to 20, print Weird
// If n is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not n is weird.
// Input Format
// A single line containing a positive integer, n.
// Constraints 1<=n<=100
// Output Format
// Print Weird if the number is weird; otherwise, print Not Weird.

public class Weird_and_NotWeird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }else if(n%2==0 && n>=2 && n<=5){
            System.out.println("Not Weird");
        }else if(n%2==0 && n>=6 && n<=20){
            System.out.println("Weird");
        }else if(n%2==0 && n>20){
            System.out.println("Not Weird");
        }
// Suggested code may be subject to a license. Learn more: ~LicenseLog:2577822897.
        sc.close();
    }

}
