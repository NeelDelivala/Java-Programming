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

    public void displayDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availabilityStatus ? "Available" : "Not Available"));
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }
    
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", "John Doe", true);
        book1.displayDetails();
        System.out.println("Is the book available? " + book1.isAvailable());
    }
}