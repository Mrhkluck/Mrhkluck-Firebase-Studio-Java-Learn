package com.example.demo.Q8_Pattern;
// 1
// 12
// 234
// 4567
// 78910
public class Pattern2 {

    public static void main(String[] args) {
        int i,j,k=1;
        for(i=1;i<=5;i++){ 
            for(j=1;j<=i;j++){
                System.out.print(k++);
            }
            k--;
            System.out.println();
            }
        }
}