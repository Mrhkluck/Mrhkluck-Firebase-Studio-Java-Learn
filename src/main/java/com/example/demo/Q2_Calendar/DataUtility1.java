package com.example.demo.Q2_Calendar;

import java.util.Calendar;

public class DataUtility1 {
    public static String getDay(int month,int day,int year){
        Calendar cal = Calendar.getInstance();
// Suggested code may be subject to a license. Learn more: ~LicenseLog:755572048.
        // cal.set(Calendar.MONTH,month-1);
        // cal.set(Calendar.DATE,day);
        // cal.set(Calendar.YEAR,year);
        //cal.set(year, month - 1, day);
        cal.set(month - 1, day, year);
        String days[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
        
    }
}
