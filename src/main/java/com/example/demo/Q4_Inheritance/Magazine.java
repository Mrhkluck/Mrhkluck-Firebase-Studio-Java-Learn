package com.example.demo.Q4_Inheritance;

public class Magazine extends LibraryItem {
    int issueNumber;

    public Magazine(String itemID, String title, String author, int issueNumber){
        super(itemID, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

