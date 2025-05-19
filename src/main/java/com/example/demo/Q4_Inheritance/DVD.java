package com.example.demo.Q4_Inheritance;

public class DVD extends LibraryItem {
    int duration;

    public DVD(String itemID, String title, String author, int duration){
        super(itemID, title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration);
    }
}

