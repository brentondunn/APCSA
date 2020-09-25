/*
name: Brenton Dunn and Aman Kumar
ID #: 218005 and 218059
date of completion: 24/08/2020
*/

public class Main {
    public static void main(String[] args) {

        // instantiate patron
        Patron p = new Patron("John");
        
        // patron borrows books
        p.borrowBook("Title1");
        p.borrowBook("Title2");
        p.borrowBook("Title3");
        p.borrowBook("Title4");

        // asks whether it has borrowed a book
        System.out.println("Is Title2 borrowed? " + p.isBorrowed("Title2"));
        System.out.println("Is Title4 borrowed? " + p.isBorrowed("Title4") + " (becuase it was over three books)");
        
        // patron returns a book
        p.returnBook("Title2");

        // checks to see if book has been returned
        System.out.println("Title2 has been returned. (double check) Is Title2 still checked out? " + p.isBorrowed("Title Hello"));

        //instantiates a new book
        Book b = new Book("Green Book", "Dan");

        // examines a book's title
        System.out.println("The title of the book is " + b.getTitle() + ".");

        // examines a book's author
        System.out.println("The author of the book is " + b.getAuthor() + ".");
    }
}
