package libraryOOP;

import java.util.ArrayList;

public class LibraryCatalog {
	
	ArrayList <Book> books = new ArrayList<Book>();
	
	public ArrayList<Book> getBooks() {
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
		book.setAvailable(true);
	}
	
	public void removeBook(int id) {
		boolean bookFound = false;
		for(Book book: books) {
			if(book.getId() == id) {
				books.remove(book);
				book.setAvailable(false);
				bookFound = true;
				break;
			}
		}
		if(!bookFound) {
			System.out.println("No books found!");
		}
	}
	public void displayAvailableBooks () {
		int order = 0;
		for(Book book: books) {
			order++;
			System.out.println(order+". ");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ID: " + book.getId());
            System.out.println("Availability: " + (book.isAvailable() ? "Available" : "Not Available" ));
            System.out.println("");
		}
	}
	
	public boolean checkAvailable(int id) {
		for(Book book: books) {
			if(book.getId() == id) {
				if(book.isAvailable()) {
					return true;
				}
			}
		}
		return false;
	}
}
