package hw9Q3Abstraction.copy;

public abstract class EngineeringSchool {
	
	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("Printing from the implemented/non-abstract  method");
	}
}