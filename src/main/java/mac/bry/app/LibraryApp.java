package mac.bry.app;

public class LibraryApp {

	public static void main(String[] args) {
		final String appName="Bilbioteczka 0.7v";
		System.out.println(appName);
		LibraryController controller = new LibraryController();
		controller.controlLoop();
	}

}
