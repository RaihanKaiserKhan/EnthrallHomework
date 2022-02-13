package hw10Q2UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;
	public Father() {
		System.out.println("Printing Default constructor of parents class");
	}
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nName: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUSA Citizen? " + usCitizen);
	}
	public void father() {
		System.out.println("Printing from void type method of parents class");
	}
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nName: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUSA Citizen? " + usCitizen);
	}
}