package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		// Object is created and the constructors initialized.
		Computer defaultObject = new Computer();

		// Variable initialized.
		Computer pcConfig = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'A');
		Computer myPcConfig = new Computer("Acer", "Aspire 5", "Windows 11", 699, false, 'A');
	}
}
