package hw5Q3Constructor;

public class Student {
	// Variables are declared.
	public String stName;
	public int stID;
	public boolean isProgrammer;
	public char sex;
	public float grade;

	// Default constructor is declared.
	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}

	// Parameterized constructor is declared.
	public Student(String stName, int stID, boolean isProgrammer, char sex, float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.isProgrammer = isProgrammer;
		this.sex = sex;
		this.grade = grade;
		System.out.println("Student Name:" + stName + ", ID:" + stID + ", Sex:" + sex + ", Grade:" + grade
				+ " and Java Programmer? Ans:" + isProgrammer);
	}

}
