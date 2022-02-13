package hw10Q3Abstraction;
/*
 * In JAVA only one keyword "extends"  is used  to inherit an abstract class. An abstract class can be inherited
 *  by both regular class and abstract class . Interface can't inherit regular class or abstract class by the 
 *  keyword 'extends". One abstract class can extends to only one regular class or abstract class. Although 
 *  from Java 1.8 an abstract class can inherit one or more interface by using the implements keyword.
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() { // Default constructor inside an abstract class.
	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Printing from the implemented/non-abstract  method.");
	}
}