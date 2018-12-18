package mac.bry.utils;

import java.util.Scanner;

import mac.bry.data.Book;
import mac.bry.data.Magazine;

public class DataReader {

	private Scanner scanner;

	public DataReader() {
		this.scanner = new Scanner(System.in);
	}
	
	public void close() {
		this.scanner.close();
	}
	
	public int getInt() {
		int number = scanner.nextInt();
		scanner.nextLine();
		return number;
	}
	
	public Book readAndCreateBook() {
		System.out.println("Tytu�:");
		String tempTitle = scanner.nextLine();
		System.out.println("Autor:");
		String tempAuthor = scanner.nextLine();
		System.out.println("Rok wydania:");
		int tempReleaseDate = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ilo�� stron:");
		int tempPages = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Wydawca:");
		String tempPublisher = scanner.nextLine();
		System.out.println("ISBN:");
		String tempISBN = scanner.nextLine();
		
		return new Book(tempTitle,tempAuthor,tempReleaseDate,tempPages,tempPublisher, tempISBN);
	}
	
	public Magazine readAndCreateMagazine() {
		System.out.println("Tytu�:");
		String tempTitle = scanner.nextLine();
		System.out.println("Wydawnictwo");
		String tempPublisher = scanner.nextLine();
		System.out.println("Rok wydania:");
		int tempReleaseDate = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Miesi�c wydania:");
		int tempMonth = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Dzie� wydania:");
		int tempDay = scanner.nextInt();
		scanner.nextLine();
		System.out.println("J�zyk:");
		String tempLanguage = scanner.nextLine();

		return new Magazine(tempReleaseDate,tempTitle, tempPublisher,tempMonth,tempDay,tempLanguage);
	}
}
