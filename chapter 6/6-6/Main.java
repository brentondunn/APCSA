public class Main {
    public static void main(String[] args) {
        Patron p = new Patron("John");
        p.borrowBook("Title Hello");
        p.borrowBook("Title Hello2");
        p.borrowBook("Title Hello3");
        p.borrowBook("Title Hello4");

        boolean x = p.isBorrowed("Title Hello4");
        System.out.println("is borroed: " + x);
        p.returnBook("Title Hello");
        boolean y = p.isBorrowed("Title Hello");
        System.out.println("is borrowed part 2: " + y);

    }
}
