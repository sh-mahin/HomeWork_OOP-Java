// Library Management System

// Books Class
class Books {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String yearOfPub;
    private float price;
    private String status;

    // Constructor
    public Books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    // Methods
    public void addNewBooks() {
        System.out.println("New book added: " + bookName);
    }

    public void deleteBooks() {
        System.out.println("Book deleted: " + bookName);
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + bookName + ", Author: " + bookAuthor +
                ", Year: " + yearOfPub + ", Price: $" + price + ", Status: " + status);
    }

    public void inquiryBook() {
        System.out.println("Inquiry about: " + bookName);
    }
}

// Librarian Class
class Librarian {
    private int id;
    private String name;

    // Constructor
    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Methods
    public void searchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    public boolean verifyMember(int id) {
        System.out.println("Verifying member with ID: " + id);
        return true; // Assume verification is successful
    }

    public void orderBooks() {
        System.out.println("Ordering books...");
    }

    public void sellBooks() {
        System.out.println("Selling books...");
    }
}

// Publisher Class
class Publisher {
    private int id;
    private String name;
    private String address;
    private int phoneNo;

    // Constructor
    public Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    // Methods
    public void addPub() {
        System.out.println("Publisher added: " + name);
    }

    public void modifyPub() {
        System.out.println("Modifying publisher details for: " + name);
    }

    public void deletePub() {
        System.out.println("Publisher deleted: " + name);
    }

    public void orderStatus() {
        System.out.println("Checking order status for publisher: " + name);
    }
}

// User Class
class User {
    private int userID;
    private String userName;
    private String userAddress;
    private int phoneNo;

    // Constructor
    public User(int userID, String userName, String userAddress, int phoneNo) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    // Methods
    public void returnBooks() {
        System.out.println(userName + " returned a book.");
    }

    public void payFine(int amount) {
        System.out.println(userName + " paid a fine of $" + amount);
    }

    public void addNewUser() {
        System.out.println("New user added: " + userName);
    }

    public void deleteUser() {
        System.out.println("User deleted: " + userName);
    }

    public void updateDetails() {
        System.out.println("Updating details for user: " + userName);
    }

    public void bookPurchase() {
        System.out.println(userName + " purchased a book.");
    }
}

// Main Class
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating Book Object
        Books book1 = new Books(101, "The Alchemist", "Paulo Coelho", "1988", 15.99f, "Available");
        book1.displayBookDetails();
        book1.addNewBooks();

        // Creating Librarian Object
        Librarian librarian = new Librarian(1, "John Doe");
        librarian.searchBook("The Alchemist");
        librarian.orderBooks();

        // Creating Publisher Object
        Publisher publisher = new Publisher(201, "Penguin Books", "New York", 123456789);
        publisher.addPub();
        publisher.orderStatus();

        // Creating User Object
        User user1 = new User(301, "Alice", "123 Street, City", 987654321);
        user1.bookPurchase();
        user1.returnBooks();
    }
}
