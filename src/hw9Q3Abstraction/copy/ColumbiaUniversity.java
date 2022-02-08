package hw9Q3Abstraction.copy;
/*
 * In JAVA only one keyword "extends"  is used  to inherit a regular class. A regular class can be
 * inherited by both a regular class or abstract class . Interface can't inherit regular class or
 * abstract class by the keyword 'extends" . One  regular class can extends to only one regular class or abstract class.
 */
public class ColumbiaUniversity extends MedicalSchool {

	public ColumbiaUniversity() { // Default constructor.

	}
	// public abstract void chemistry();
// Method can only be implemented in regular class,so abstract method is not allowed.
	public void biology() {
		System.out.println("Printing from the implemented/non-abstract  method");
	}
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
	}
}