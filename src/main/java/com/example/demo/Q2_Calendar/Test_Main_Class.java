package com.example.demo.Q2_Calendar;

import java.util.Scanner;

public class Test_Main_Class {
    public static void main(String[] args) {
        //explicitivly giving value
        // int month = 8;
        // int day = 20;
        // int year = 2017;

        //given input from user for that we need to use scanner 

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month");
        int month=sc.nextInt();
        System.out.println("Enter day");
        int day=sc.nextInt();
        System.out.println("Enter year");
        int year=sc.nextInt();
        sc.close();

        String dayOfWeek = DataUtility1.getDay(month,day,year);
        System.out.println("Day of the week " +dayOfWeek);
    }

}
