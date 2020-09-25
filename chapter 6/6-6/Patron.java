/*
name: Brenton Dunn and Aman Kumar
ID #: 218005 and 218059
date of completion: 24/08/2020
*/

public class Patron {
    
    // instance variables
    private String name;
    private String book1;
    private String book2;
    private String book3;

    // constructor method
    public Patron(String patronName) {
        name = patronName;
        book1 = null;
        book2 = null;
        book3 = null;
    }

    // method that assigns a title to a book spot. if all spots are filled, it returns false
    public boolean borrowBook(String title) {
        if (book1 == null) {
            book1 = title;
            return true;
        } else if (book2 == null) {
            book2 = title;
            return true;
        } else if (book3 == null) {
            book3 = title;
            return true;
        } else {
            return false;
        }
    } 

    // method that checks the given title with the titles that are borrowed
    public boolean isBorrowed(String title) {
        if (title.equals(book1) || title.equals(book2) || title.equals(book3)) {
            return true;
        } else { 
            return false;
        }
    }

    // method that returns a specified title
    public void returnBook(String title) {
        if (title.equals(book1)) {
            book1 = null;
        } else if (title.equals(book2)) {
            book2 = null;
        } else if (title.equals(book3)){
            book3 = null;
        } else {
            System.out.println("Title is not borrowed.");
        }
    }
}
