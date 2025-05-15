package com.example.demo.Q2_Calendar;

import java.util.Calendar;

public class DataUtility {
    public static String getDay(int month,int day,int year){
        // Set kar rahe input se mila hua date
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month - 1);
        cal.set(Calendar.DATE,day);
        //Day array
        String days[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];

    }

    public static void main(String[] args) {
        int month = 8;
        int day = 20;
        int year = 2017;

        //String dayOfWeek = getDay(month,day,year);
        System.out.println(getDay(month,day,year));
    }

}
