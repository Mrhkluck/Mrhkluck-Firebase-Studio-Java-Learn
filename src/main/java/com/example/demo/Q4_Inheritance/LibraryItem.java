package com.example.demo.Q4_Inheritance;

public class LibraryItem {
    // In general take variable as private and methods as public
    String itemID;
    String title; // default Package private 
    String author;
    boolean isCheckedOut;

    public LibraryItem(String itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public void checkout() {
        if (!isCheckedOut) { // !false
            isCheckedOut = true;
            System.out.println("Item checked out");
        } else {
            System.out.println("Item is already checked out");
        }

    }

    public void returnItem() {
        if (isCheckedOut) { // true mean book going to be return
            isCheckedOut = false;
            System.out.println("Item returned");
        } else {
            System.out.println("Item is already returned");
        }
    }

    public void displayDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Is checked out: " + isCheckedOut);
    }
}
