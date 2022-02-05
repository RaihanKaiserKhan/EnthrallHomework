package hw8Q2Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo(); // Animal Class is the Parent Class of Mammal, Reptile & Birds Class.
		System.out.println("*****************************************");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Mammal (Reptile & Birds also) is a Child Class of Animal Class.
		System.out.println("*****************************************");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();// Here is an example of single inheritance.
		reptile.animalInfo();// A derived class "Reptile", inherits the properties from a single
								// parent(Animal) class.
		System.out.println("*****************************************");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		// More than one derived class is created from a single parent class.
		// Mammal,Reptile & Birds extends to one base class Animal.
		// Example of Hierarchical Inheritance.
		System.out.println("*****************************************");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("*****************************************");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("*****************************************");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("*****************************************");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("*****************************************");
		Cobra cobra = new Cobra();
		cobra.cobraInfo(); // Cobra extends Snake, Snake extends Reptile, Reptile extends Animal.
		cobra.snakeInfo();// A derived class is created from another derived class.
		cobra.reptileInfo();// This is called Multilevel inheritance.
		cobra.animalInfo();
	}
}