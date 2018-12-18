package mac.bry.app;

import mac.bry.data.Book;
import mac.bry.data.Library;
import mac.bry.data.Magazine;
import mac.bry.utils.DataReader;

public class LibraryController {
	
	public static final int EXIT = 0;
	public static final int ADD_BOOK = 1;
	public static final int SHOW_BOOKS = 2;
	public static final int ADD_MAGAZINE = 3;
	public static final int SHOW_MAGAZINE = 4;
	
	private DataReader dataReader;
	private Library library;
	
	public LibraryController() {
		this.dataReader =  new DataReader();
		this.library = new Library();
	}
	
	public void controlLoop () {
		int option = -1;
		showOptions();
		while ((option = dataReader.getInt()) != EXIT) {
			switch (option) {
			case ADD_BOOK:
				addBook();
				break;
			case SHOW_BOOKS:
				showBooks();
				break;
			case ADD_MAGAZINE:
				addMagazine();
				break;
			case SHOW_MAGAZINE:
				showMagazines();
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
		System.out.println("1. Dodaj Ksi¹¿kê");
		System.out.println("2. Poka¿ Ksi¹¿ki");
		System.out.println("3. Dodaj Magazyn");
		System.out.println("4. Poka¿ Magazyny");
		System.out.println("0. Wyjœcie");
	}
	
	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}
	private void showBooks() {
		library.printBooks();
	}
	
	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazines(magazine);
	}
	
	private void showMagazines() {
		library.printMagazines();
	}
}
