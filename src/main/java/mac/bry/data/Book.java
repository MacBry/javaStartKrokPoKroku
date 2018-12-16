package mac.bry.data;

public class Book {
	
	private String title;
	private String author;
	private int releaseDate;
	private int pages;
	private String publisher;
	private String isbn;
	
	
	
	public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
		this.pages = pages;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	
	
	public Book() {
		super();
	}
	
	public Book(Book book) {
		this(book.title, book.author, book.releaseDate, book.pages, book.publisher, book.isbn);
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", Author=" + author + ", releaseDate=" + releaseDate + ", pages=" + pages
				+ ", publisher=" + publisher + ", isbn=" + isbn + "]";
	}
	
	   
}