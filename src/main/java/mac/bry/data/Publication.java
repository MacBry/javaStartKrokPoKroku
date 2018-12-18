package mac.bry.data;

public class Publication {
	private int year;
	private String title;
	private String publisher;
	
	public Publication(int year, String title, String publisher) {
		super();
		this.year = year;
		this.title = title;
		this.publisher = publisher;
	}
	
	public Publication() {
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Publication [year=" + year + ", title=" + title + ", publisher=" + publisher + "]";
	}
	
	
}
