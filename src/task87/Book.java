/*
Consider a library system where books have attributes like title and author. We can create
a book with title or both.
How can we do that with constructor overloading and setting only the instance variable
passed while object creation



 */

package task87;


public class Book {

    // Attributes
    private String title;
    private String author;

    // Constructor to initialize only the title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";  // Default value for author when not provided
    }

    // Constructor to initialize both title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        // Create a book with only the title
        Book book1 = new Book("The Great Gatsby");

        // Create a book with both title and author
        Book book2 = new Book("1984", "George Orwell");

        // Display details of both books
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
}
