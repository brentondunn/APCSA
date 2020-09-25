public class Book {
    
    // instance variables
    private String title;
    private String author;

    // constructor method
    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
    }

    // accessor method
    public String getTitle() {
        return title;
    }

    // accessor method   
    public String getAuthor() {
        return author;
    }
}
