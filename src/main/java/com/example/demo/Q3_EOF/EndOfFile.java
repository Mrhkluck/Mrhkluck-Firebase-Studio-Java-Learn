package com.example.demo.Q3_EOF;

import java.util.Scanner;

// The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
// Hint: Java's Scanner.hasNext() method is helpful for this problem.
// Input Format
// Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
// Output Format
// For each line, print the line number, followed by a single space, and then the line content received as input.
// Sample Input
// Hello world
// I am a file
// Read me until end-of-file.

// Sample Output
// 1 Hello world
// 2 I am a file
// 3 Read me until end-of-file.

public class EndOfFile {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    for (int i = 1; sc.hasNext(); i++) {
        System.out.println(i + " " + sc.nextLine());
    }
    sc.close();
}



}
