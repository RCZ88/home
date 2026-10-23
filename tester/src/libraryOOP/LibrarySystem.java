package libraryOOP;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryCatalog lc = new LibraryCatalog();
		
		Book book1 = new Book("The Silent Patient", "Alex Michaelides", 1001);
		Book book2 = new Book("Educated", "Tara Westover", 1002);
		Book book3 = new Book("Where the Crawdads Sing", "Delia Owens", 1003);
		Book book4 = new Book("Becoming", "Michelle Obama", 1004);
		Book book5 = new Book("The Nightingale", "Kristin Hannah", 1005);
		
		lc.addBook(book1);
		lc.addBook(book2);
		lc.addBook(book3);
		lc.addBook(book4);
		lc.addBook(book5);
		
		lc.displayAvailableBooks();
		
		lc.removeBook(1005);
		lc.removeBook(1002);
		
		lc.displayAvailableBooks();
		
		System.out.println(lc.checkAvailable(1003));
		System.out.println(lc.checkAvailable(1005)); 
		
		LibraryMember member1 = new LibraryMember("Emily Johnson", 567890);
		LibraryMember member2 = new LibraryMember("Ryan Thompson", 123456);
		LibraryMember member3 = new LibraryMember("Jordan Lee", 987654);
		
		member1.setLibraryCatalog(lc);
        member2.setLibraryCatalog(lc);
        member3.setLibraryCatalog(lc);
		
		member1.checkOutBooks("Educated");
		member1.checkOutBooks("Becoming");
		member2.checkOutBooks("The Silent Patient");
		member3.checkOutBooks("The Nightingale");
		
		lc.displayAvailableBooks();
		
		member1.checkedOutBooks();
		member2.checkedOutBooks();
		member3.checkedOutBooks();
	}

}
