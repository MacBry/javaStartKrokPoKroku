package mac.bry.utils;

import java.util.Scanner;

import mac.bry.data.Book;

public class DataReader {

	private Scanner scanner;

	public DataReader() {
		this.scanner = new Scanner(System.in);
	}
	
	public void close() {
		this.scanner.close();
	}
	
	public Book readAndCreateBook() {
		System.out.println("Tytu³:");
		String tempTitle = scanner.nextLine();
		System.out.println("Autor:");
		String tempAuthor = scanner.nextLine();
		System.out.println("Rok wydania:");
		int tempReleaseDate = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Iloœæ stron:");
		int tempPages = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Wydawca:");
		String tempPublisher = scanner.nextLine();
		System.out.println("ISBN:");
		String tempISBN = scanner.nextLine();
		
		return new Book(tempTitle,tempAuthor,tempReleaseDate,tempPages,tempPublisher, tempISBN);
	}
}
