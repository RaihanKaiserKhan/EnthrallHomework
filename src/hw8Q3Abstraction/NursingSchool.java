package hw8Q3Abstraction;

public abstract class NursingSchool {
	public NursingSchool() {
	}
	public abstract void hygiene();
	public void caring() {
		System.out.println("Printing from the implemented/non-abstract  method");
	}
}