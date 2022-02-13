package hw10Q3Abstraction;
/*
 * In JAVA only one keyword "extends"  is used  to inherit a regular class. A regular class can be inherited 
 * by both a regular class or abstract class .Interface can't inherit regular class or abstract class by the 
 * keyword 'extends" . One  regular class can extends to only one regular class or abstract class. Although
 * from Java 1.8 a regular class can inherit one or more interfaces by using the implements keyword.
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

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
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void laboratoryRoom() {
		// TODO Auto-generated method stub
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub	
	}
}