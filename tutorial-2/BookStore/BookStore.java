import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean availabilityStatus; 
    
    public Book(int bookID, String title, String author, boolean availabilityStatus) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }
    
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availabilityStatus ? "Available" : "Not Available"));
    }

    public boolean checkAvailability() {
        return availabilityStatus;
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        int bookID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.println("Enter Book Author: ");
        String author = scanner.nextLine();

        System.out.println("Is the book available? (true/false): ");
        boolean availabilityStatus = scanner.nextBoolean();
        
        Book book = new Book(bookID, title, author, availabilityStatus);

        System.out.println("\nBook Details:");
        book.displayBookDetails();

        if (book.checkAvailability()) {
            System.out.println("\nThe book is available.");
        } else {
            System.out.println("\nThe book is not available.");
        }

        scanner.close();
    }
}
