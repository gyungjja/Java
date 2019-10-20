package week4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] pets = {
				new Cat("Nabee"), 
				new Dog(), 
				new Cat(), 
				new Dog(), 
				new Dog("Rock") 
		};

		for (Animal ani : pets) {
			System.out.print("\n" + ani + "_" + ani.reaction(ani));
			ani.sound();
		}
		System.out.print("\n\nPet�� �� Dog�� " + Dog.getCountDog() + "����\n");
		
		System.out.print("\n\nPet�� �� Cat�� " + Cat.getCountCat() + "����\n");
	}
}
