package hw5Q3Constructor;

public class StudentTest {
	public static void main(String[] args) {
		// Default constructor is initialized.
		Student info = new Student();
		// Parameterized constructor is initialized.
		Student myInfo = new Student("Raihan", 6600, true, 'M', 3.976f);
		info.student("sunny", 33, false, 'm', 2.333f);
	}
}