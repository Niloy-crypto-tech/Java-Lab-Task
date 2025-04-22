class Book {

    String title;
    String author;
    boolean status;
    String type;

    public Book(String title, String author, boolean status, String type) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.type = type;
    }

    boolean isAvailable() {
        return status;
    }
}

abstract class User {

    int maxBook;
    int currentCount = 0; // tracks how many books currently borrowed

    public User(int maxBook) {
        this.maxBook = maxBook;
    }

    abstract void borrowBook(Book b);

    abstract void returnBook(Book b, int days);
}

class Student extends User {

    public Student() {
        super(2);
    }

    @Override
    void borrowBook(Book b) {
        if (b.isAvailable() && currentCount < maxBook) {
            b.status = false; // mark book as borrowed. book is unavailable once borrowed
            currentCount++;

            System.out.println("Student borrowed: " + b.title);
        } else {
            System.out.println("Cannot borrow the book.");
        }
    }

    @Override
    void returnBook(Book b, int days) {
        b.status = true; // mark book as returned. book is availabe once returned
        currentCount--;

        if (b.type.equals("Printed") && days > 0) {
            int fine = (5 * days) / 2; // Students get 50% discount, so divided by 2.
            System.out.println("Fine for student: " + fine + " Tk");
        } else {
            System.out.println("No fine.");
        }
    }
}

class Teacher extends User {

    public Teacher() {
        super(3);
    }

    @Override
    void borrowBook(Book b) {
        if (b.isAvailable() && currentCount < maxBook) {
            b.status = false;
            currentCount++;

            System.out.println("Teacher borrowed: " + b.title);
        } else {
            System.out.println("Cannot borrow the book.");
        }
    }

    @Override
    void returnBook(Book b, int days) {
        b.status = true;
        currentCount--;

        System.out.println("No fine for teacher.");
    }
}

class Library {

    Book[] books = new Book[10];

    public void addBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            books[i] = b;
        }
    }

    public void searchBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Title: " + books[i].title);
                System.out.println("Author: " + books[i].author);
                System.out.println("Available: " + (books[i].status ? "Yes" : "No"));
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

public class LibraryManagement {

    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Letter to Milenna", "Franz", true, "Printed");
        Book b2 = new Book("100 ways to die", "wilson", false, "E-book");
        lib.addBook(b1);
        lib.addBook(b2);

        User s = new Student();
        s.borrowBook(b1);
        s.returnBook(b1, 3);

        lib.searchBook("Dc");
    }
}