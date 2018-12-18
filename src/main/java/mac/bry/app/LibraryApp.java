package mac.bry.app;

public class LibraryApp {

	public static final String APP_NAME="Bilbioteczka 0.8v";
	
	public static void main(String[] args) {
		System.out.println(APP_NAME);
		LibraryController controller = new LibraryController();
		controller.controlLoop();
	}

}
