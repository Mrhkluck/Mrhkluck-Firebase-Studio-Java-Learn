package Q4_Inheritance;

public class Book extends LibraryItem {
    String ISBN;

    public Book(String itemID, String title, String author, String ISBN){
        //non paramaterized constructor then we need to invoke super explicitly
        super(itemID, title, author);
        this.ISBN = ISBN;
    }

//inheritance nhi hota toh to display details ko object class bna k call karnna parta
//super agar nhi lagana chahe toh 
//         System.out.println("Item ID: " + itemID);
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Is checked out: " + isCheckedOut);
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ISBN: " + ISBN);
    }
}
