class Book {
    String title;
    String author;

    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        System.out.println("0-argument constructor invoked.");
    }

    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ZeroArgConstructorDemo {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.display();
    }
}