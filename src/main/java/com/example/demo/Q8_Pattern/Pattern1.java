package com.example.demo.Q8_Pattern;
// 1
// 12
// 123
// 1234
// 12345
public class Pattern1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
