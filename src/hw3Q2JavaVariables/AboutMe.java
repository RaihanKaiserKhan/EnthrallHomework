package hw3Q2JavaVariables;

public class AboutMe {
	public String informationAboutMe; // here string is declared as a reference variable.
	public String name = "Raihan Khan";// initialize the string as a reference variable.
	public String Address = "  505 Queens ave\n\t\tQueens,NY";
	public byte age = 32; // variable is initialized here because I assign the value of the variable age.
	public short timeLivedinUsa = 12; // variable is initialized.
	public long phoneNo = 13476410023l; // variable is initialized.
	public int zip = 11419;
	public float height = 5.5f;
	public double weight = 150.5;
	public char gender = 'M';
	public boolean allData = true;
    public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Object aboutMe is instantiating from AboutMe class here.
		System.out.println("Name:" + aboutMe.name + "\nAge(Years):" + aboutMe.age + "\nGender:" + aboutMe.gender);
		System.out.println("Height(ft):" + aboutMe.height + "\nWeight(Ibs):" + aboutMe.weight + "\nAddress: "
				+ aboutMe.Address + "\nZip Code:\t" + aboutMe.zip + "\nPhone No:" + aboutMe.phoneNo);

	}
}
