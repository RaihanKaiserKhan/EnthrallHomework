package hw3Q2JavaVariables;

public class AboutMe {
	// here string is declared as a reference variable.
	public String informationAboutMe;
	// The variables are initialized.
	public String name = "Raihan Khan";
	public String Address = "505 Queens ave\nQueens,NY";
	public byte age = 32;
	public short timeLivedinUsa = 12;
	public long phoneNo = 13476410023l;
	public int zip = 11419;
	public float height = 5.5f;
	public double weight = 150.5;
	public char gender = 'M';
	public boolean allData = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Object aboutMe is instantiating from AboutMe class here.
		System.out.println("Name:" + aboutMe.name + "\nAge(Years):" + aboutMe.age + "\nGender:" + aboutMe.gender);
		System.out.println("Height(ft):" + aboutMe.height + "\nWeight(Ibs):" + aboutMe.weight + "\nAddress: "
				+ aboutMe.Address + "\nZip Code:" + aboutMe.zip + "\nPhone No:" + aboutMe.phoneNo + "\nAll Data:"
				+ aboutMe.allData);
	}
}