package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;
	public Daughter() {
		super("Raihan Khan", 35, 'M', true);
		super.fatherInfo("Rezwan Khan", 45, 'M', true);
		super.familyName = "Khan";
		System.out.println("The family name of the parent: " + familyName);
		System.out.println("Printing Default constructor of child class");
	}
	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month of the daughter is " + birthMonth + " and the age is " + age);
	}
	public void daughter() {
		System.out.println("Printing from void type method of child class");
	}
	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth month of the daughter is " + birthMonth + " and the age is " + age);
	}
}