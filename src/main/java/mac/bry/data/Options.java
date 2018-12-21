package mac.bry.data;

public enum Options {

	EXIT(0, "Wyjœcie"),
	ADD_BOOK(1, "Dodaj Ksi¹¿kê"),
	SHOW_BOOKS(2, "Poka¿ Ksi¹¿ki"),
	ADD_MAGAZINE(3, "Dodaj Czasopismo"),
	SHOW_MAGAZINE(4, "Poka¿ Czasipisma");
	
	private int value;
	private String description;
	
	Options(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}
	
	public Options createFromInt(int number) {
		return Options.values()[number];
	}
	
}
