package hw10Q2UseOfSuperInChildClass;

public class TestFamily {
	
	public static void main(String[] args) {
		System.out.println("**** Default constructor initialized for parent class****");
		Father father = new Father();

		System.out.println("\n**Parameterized constructor initialized for parent class**");
		Father father1 = new Father("Rashid Khan", 55, 'M', true);

		System.out.println("\n**Void type method initialized for parent class**");
		father1.father();

		System.out.println("\n**Parameterized method initialized for parent class**");
		father1.fatherInfo("Rashid Khan", 45, 'M', true);

		System.out.println("\n**default constructor initialized for child class**");
		Daughter daughter = new Daughter();

		System.out.println("\n** parameterized constructor initialized for child class**");
		Daughter daughter1 = new Daughter("April", 22);

		System.out.println("\n** void type method initialized for child class**");
		daughter1.daughter();

		System.out.println("\n** parameterized method initialized for child class**");
		daughter1.daughterInfo("April", 22);
	}
}