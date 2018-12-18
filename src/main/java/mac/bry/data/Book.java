package mac.bry.data;

public class Book extends Publication {
	
	//private String title;
	private String author;
	//private int releaseDate;
	private int pages;
	//private String publisher;
	private String isbn;
	
	
	
	public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
		//super();
		this.setTitle(title);
		this.author = author;
		this.setYear(releaseDate);  
		this.pages = pages;
		this.setPublisher(publisher);
		this.isbn = isbn;
	}
	
	
	public Book() {
		//super();
	}
	


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", pages=" + pages + ", isbn=" + isbn + ", getYear()=" + getYear()
				+ ", getTitle()=" + getTitle() + ", getPublisher()=" + getPublisher() + "]";
	}


	
	   
}
