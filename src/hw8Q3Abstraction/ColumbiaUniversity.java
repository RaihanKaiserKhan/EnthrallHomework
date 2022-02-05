package hw8Q3Abstraction;

public class ColumbiaUniversity {
	public ColumbiaUniversity() { // Default constructor.

	}
	// public abstract void chemistry();
// Method can only be implemented in regular class,so abstract method is not allowed.
	public void biology() {
		System.out.println("Printing from the implemented/non-abstract  method");
	}
}