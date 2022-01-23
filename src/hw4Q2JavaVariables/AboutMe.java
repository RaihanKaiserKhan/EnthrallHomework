package hw4Q2JavaVariables;

public class AboutMe {
	// All the variables are declared.
	public String name;
	public String Address;
	public byte age;
	public short timeLivedinUsa;
	public long phoneNo;
	public int zip;
	public float height;
	public double weight;
	public char sex;
	public boolean allData;

	// constructor AboutMe is declared.
	public AboutMe() {
		System.out.println("This is all about me:");
	}

	// method aboutMe is implemented.
	public void aboutMe() {
		System.out.println("Name:" + name + "\nAge(Years):" + age + "\nGender:" + sex + "\nHeight(ft):" + height
				+ "\nWeight(Ibs):" + weight + "\nAddress:" + Address + "\nZip Code:\t" + zip + "\nPhone No:" + phoneNo
				+ "\nStaying in the USA(Years):" + timeLivedinUsa + "\nAll Data:" + allData);
	}
}