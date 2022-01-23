package hw5Q2Constructor;

public class Computer {
	// Variables are declared.
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUsa;
	public char grade;

	// Default constructor is declared.
	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
	}

	// Parameterized constructor is declared.
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa, char grade) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		this.grade = grade;
		System.out.println("My brand:" + brand + ", Model:" + model + ", Operating System:" + operatingSystem
				+ ", Price:" + price + " $" + ", Grade:" + grade + " and Made in USA? Ans:" + madeInUsa);
	}
}