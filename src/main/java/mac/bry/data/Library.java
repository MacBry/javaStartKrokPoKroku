package mac.bry.data;

public class Library {

	public static final int MAX_BOOKS = 1000;
	public static final int MAX_MAGAZINES = 1000;
	
	private Book [] books;
	private Magazine [] magazines;
	private int booksNumber;
	private int magazinesNumber;
	
	
	
	public Library() {
		this.books = new Book[MAX_BOOKS];
		this.magazines = new Magazine[MAX_MAGAZINES];
	}

	public Book[] getBooks() {
		return books;
	}

	public int getBooksNumber() {
		return booksNumber;
	}
	
	public void addBook (Book book) {
		if(booksNumber < MAX_BOOKS) {
			books[booksNumber] = book;
			booksNumber++;
		}else System.out.println("maksymalna liczba ksi¹zek");
	}
	
	public void printBooks() {
		if(booksNumber == 0) {
			System.out.println("Brak ksi¹¿ek w bibliotece");
		}
		else {
			for(int i = 0 ; i < booksNumber; i ++) {
				System.out.println(books[i].toString());
			}
		}
	}
	
	public Magazine[] getMagazines() {
		return magazines;
	}

	public int getMagazinesNumber() {
		return magazinesNumber;
	}
	
	public void addMagazines(Magazine magazine) {
		if(magazinesNumber < MAX_MAGAZINES) {
			magazines[magazinesNumber] = magazine;
			magazinesNumber++;
		}
		else {
			System.out.println("maksymalna liczba magazynow");
		}
	}
	
	public void printMagazines() {
		if(magazinesNumber == 0) {
			System.out.println("Brak magazynow");
		}
		else {
			for(int i = 0; i<magazinesNumber; i++) {
				System.out.println(magazines[i].toString());
			}
		}
	}

}
