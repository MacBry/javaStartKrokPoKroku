package mac.bry.app;

import mac.bry.data.Book;
import mac.bry.data.Library;
import mac.bry.utils.DataReader;

public class LibraryController {
	
	public final int exit = 0;
	public final int addBook = 1;
	public final int showBooks = 2;
	
	private DataReader dataReader;
	private Library library;
	
	public LibraryController() {
		this.dataReader =  new DataReader();
		this.library = new Library();
	}
	
	public void controlLoop () {
		int option = -1;
		showOptions();
		while ((option = dataReader.getInt()) != exit) {
			switch (option) {
			case addBook:
				addBook();
				break;
			case showBooks:
				showBooks();
				break;

			default:
				System.out.println("Brak opcji");
				break;
			}
			showOptions();
		}
	}
	
	private void showOptions () {
		System.out.println("Wybierz opcje");
		System.out.println("1. Doda Ksi¹¿kê");
		System.out.println("2. Poka¿ Ksi¹¿ki");
		System.out.println("0. Wyjœcie");
	}
	
	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}
	private void showBooks() {
		library.printBooks();
	}
}
