package mac.bry.data;

public class Magazine extends Publication {
	
	private int month;
	private int day;
	private String language;
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Magazine(int year, String title, String publisher) {
		super(year, title, publisher);
	}

	public Magazine(int year, String title, String publisher, int month, int day, String language) {
		super(year, title, publisher);
		this.month = month;
		this.day = day;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Magazine [month=" + month + ", day=" + day + ", language=" + language + ", getYear()=" + getYear()
				+ ", getTitle()=" + getTitle() + ", getPublisher()=" + getPublisher() + "]";
	}

	
}
