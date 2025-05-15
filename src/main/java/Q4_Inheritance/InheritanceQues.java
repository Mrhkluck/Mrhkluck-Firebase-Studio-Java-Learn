package Q4_Inheritance;

// Start by creating a base class LibraryItem that contains common attributes and methods shared by all library items. Then, create subclasses Book, Magazine, and DVD that inherit from LibraryItem and include their own unique attributes and behaviors.

// 🔹 Requirements:
// 1. Base Class – LibraryItem:
// Attributes:
// itemID (String): Unique identifier for the library item
// title (String): Title of the item
// author (String): Name of the author or creator
// isCheckedOut (boolean): Indicates whether the item is checked out

// Methods:
// checkout(): Marks the item as checked out
// returnItem(): Marks the item as returned
// displayDetails(): Displays all item details

// 2. Subclass – Book:
// Additional Attribute:
// ISBN (String): International Standard Book Number
// Override displayDetails() to include ISBN

// 3. Subclass – Magazine:
// Additional Attribute:
// issueNumber (int): Edition number of the magazine
// Override displayDetails() to include issueNumber

// 4. Subclass – DVD:
// Additional Attribute:
// duration (int): Duration in minutes
// Override displayDetails() to include duration

public class InheritanceQues {
    public static void main(String[] args) {

        LibraryItem b = new Book("12345", "Song of the Ice and Fire", "rashid", "mrhk12345");
        b.displayDetails();
        b.returnItem();
        System.out.println("\n");
        b.displayDetails();
        System.out.println();
        b.title = "Harry Potter"; // yahan default same package k andar hai nhi toh getter setter lena hota
        b.displayDetails();
        System.out.println("\n");
      

        LibraryItem m = new Magazine("383", "Mastram", "Taufique", 420);
        m.displayDetails();
        System.out.println("\n");

        LibraryItem d = new DVD("383", "Mastram", "Taufique", 420);
        d.displayDetails();
        
    }

}
