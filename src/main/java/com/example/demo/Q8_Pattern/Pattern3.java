package com.example.demo.Q8_Pattern;

//import java.util.Scanner;

// ***
// **
// *
// ***
// **
// *
// ***
// **
// *
public class Pattern3 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your choice");
        // String s = sc.nextLine();
        

        int i,j,n=14;
        for(i=1;i<=n/3;i++){
            for(j=1;j<=3;j++){
                for(int k=0;k<3-j+1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(j=1;j<=n%3;j++){
            for(int k=0;k<3-j+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // sc.close();
    }
}
