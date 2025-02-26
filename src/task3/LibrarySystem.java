
/*
* Static(Exercise)
Imagine a library system where you need to track the total number of books issued, irrespective of the users.
*/

package task3;

class Library {
    static int totalBooksIssued = 0;

    public void issueBook() {
        totalBooksIssued++;
        System.out.println("Book issued.");
    }

    public static void displayTotalBooksIssued() {
        System.out.println("Total books issued: " + totalBooksIssued);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library user1 = new Library();
        Library user2 = new Library();

        user1.issueBook();
        user2.issueBook();
        user1.issueBook();

        Library.displayTotalBooksIssued();
    }
}
