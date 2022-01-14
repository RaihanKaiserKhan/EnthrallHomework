package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) { 
		
		// Object aboutMe is instantiated from AboutMe class here.
		// Constructor is also initialized when an object is created. 
		AboutMe aboutMe = new AboutMe(); 

		// variables are  initialized here.
		aboutMe.name = "Raihan Khan";
		aboutMe.Address = "505 Queens ave\nQueens,NY"; 
		aboutMe.age = 32; 
		aboutMe.timeLivedinUsa = 12;
		aboutMe.phoneNo = 13476410023l;
		aboutMe.zip = 11419;
		aboutMe.height = 5.5f;
		aboutMe.weight = 150.5;
		aboutMe.gender = 'M';
		aboutMe.allData = true;
		aboutMe.aboutMe();

		System.out.println("\n*****************************\n");
		AboutMe aboutAlex = new AboutMe(); // Object aboutMe is instantiating from AboutMe class here.

		// The variables are initialized here.
		aboutAlex.name = "Alex";
		aboutAlex.Address = "1000 Queens ave\nQueens,NY";
		aboutAlex.age = 30; 
		aboutAlex.timeLivedinUsa = 30; 
		aboutAlex.phoneNo = 16466410023l; 
		aboutAlex.zip = 11420;
		aboutAlex.height = 6.5f;
		aboutAlex.weight = 170.5;
		aboutAlex.gender = 'M';
		aboutAlex.allData = true;
		aboutAlex.aboutMe();
		//test code
	}
}