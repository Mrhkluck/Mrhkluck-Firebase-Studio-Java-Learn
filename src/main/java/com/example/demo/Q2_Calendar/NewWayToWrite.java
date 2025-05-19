package com.example.demo.Q2_Calendar;
     import java.time.LocalDate;
    import java.time.DayOfWeek;
import java.util.Scanner;
public class NewWayToWrite {


    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek(); // e.g., MONDAY, TUESDAY, etc.
        return dayOfWeek.toString(); // returns in uppercase
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter month (1-12):");
            int month = scanner.nextInt();
            System.out.println("Enter day (1-31):");
            int day = scanner.nextInt();
            System.out.println("Enter year (e.g., 2023):");
            int year = scanner.nextInt();

            System.out.println("The day of the week is: " + findDay(month, day, year));
        }
        
    }
    
}
