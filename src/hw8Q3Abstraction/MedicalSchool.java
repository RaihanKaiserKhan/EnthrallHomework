package hw8Q3Abstraction;

public abstract class MedicalSchool {

	public MedicalSchool() { // Default constructor inside an abstract class.
	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Printing from the implemented/non-abstract  method.");
	}
}