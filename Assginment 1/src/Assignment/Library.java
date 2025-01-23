package Assignment;

public class Library {
    private Set<Book> books;

    public Library() {
        this.books = new HashSet<>();
    }

    // Adds a book to the library if it is unique
    public boolean addBook(Book book) {
        return books.add(book); // returns true if the book was added, false if it was already present
    }

    // Removes a book from the library by title
    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equals(title)); // returns true if a book was removed
    }

    // Searches for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book; // returns the found book
            }
        }
        return null; // returns null if no book is found
    }
}
