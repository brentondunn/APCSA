public class Patron {
    private String name;
    private String book1;
    private String book2;
    private String book3;

    public Patron(String patronName) {
        name = patronName;
        book1 = null;
        book2 = null;
        book3 = null;
    }
/*
    public boolean borrowBook(String title, String book) {
        if (book1 == null) {
            book1 = book;
        } else if (book2 == null) {
            book2 = book;
        } else if (book3 = null) {
            book3 = book;
        } else {
            return false;
        }
    } */

    public boolean isBorrowed(String title) {
        if (title.equals(book1) || title.equals(book2) || title.equals(book3)) {
            return true;
        } else { 
            return false;
        }
    }

    // logic error: if title does not match any of the three then book3 is erased
    public void returnBook(String title) {
        if (title.equals(book1)) {
            book1 = null;
        } else if (title.equals(book2)) {
            book2 = null;
        } else {
            book3 = null;
        }
    }

    

}
