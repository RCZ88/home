package libraryOOP;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
	private LibraryCatalog libraryCatalog;  // Instance variable to hold the LibraryCatalog instance
    private String name;
    private int memberId;
    private List<Book> checkedOutBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Setter for the LibraryCatalog instance
    public void setLibraryCatalog(LibraryCatalog catalog) {
        this.libraryCatalog = catalog;
    }

    public void checkOutBooks(String bookTitle) {
        boolean bookFound = false;
        for (Book book : libraryCatalog.getBooks()) {
            if (book.getTitle().trim().equalsIgnoreCase(bookTitle.trim()) && book.isAvailable()) {
                book.setAvailable(false);
                checkedOutBooks.add(book);
                System.out.println(bookTitle + " has been checked out by " + name);
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("The book " + bookTitle + " is not available for checkout.");
        }
    }
	public void returnBooks(String name) {
		boolean bookFound = false;
		for(Book book : libraryCatalog.getBooks()) {
			if(book.getTitle().equals(name)) {
				bookFound = true;
				checkedOutBooks.remove(book);
				libraryCatalog.books.add(book);
				break;
			}
		}
		if(!bookFound) {
			System.out.println("Book not found!");
		}
	}
	
	public void checkedOutBooks() {
		int index = 0;
		System.out.println(name+"'s Checked Out books: ");
		for(Book book: checkedOutBooks) {
			System.out.println(index+ ". ");
			System.out.println(book);
		}
	}
}
