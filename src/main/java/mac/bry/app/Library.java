package mac.bry.app;

import mac.bry.data.Book;
import mac.bry.utils.DataReader;

public class Library {

	public static void main(String[] args) {
		final String appName="Biblioteka 0.6v";
		
		Book[] books = new Book[1000];
		DataReader dataReader = new DataReader();
		
		System.out.println(appName);
		System.out.println("Wprowadz nowa ksi¹¿kê");
		books[0] = dataReader.readAndCreateBook();
		
	}

}
