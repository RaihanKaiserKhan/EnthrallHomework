package hw8Q3Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("I am Non abstruct method implemented after the abstruct method.");
	}
}