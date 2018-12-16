package mac.bry.data;

public class Library {

	public final int  maxBooks = 1000;
	
	private Book [] books;
	private int booksNumber;
	
	
	
	public Library() {
		this.books = new Book[maxBooks];
	}

	public Book[] getBooks() {
		return books;
	}

	public int getBooksNumber() {
		return booksNumber;
	}
	
	public void addBook (Book book) {
		if(booksNumber < maxBooks) {
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
}
