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

    public boolean isBorrowed(String title) {
        if (title.equals(book1) || title.equals(book2) || title.equals(book3)) {
            return true;
        } else { 
            return false;
        }
    }

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
