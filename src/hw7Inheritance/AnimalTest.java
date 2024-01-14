package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		Mammal mammal = new Mammal(); 
		mammal.mammalInfo(); //Single inheritance
		mammal.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		Reptile reptile = new Reptile(); 
		reptile.reptileInfo(); 
		reptile.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		Birds birds = new Birds(); 
		birds.birdsInfo(); 
		birds.animalInfo(); // Hierarchical inheritance. Birds extends Animal

		System.out.println("\n--------------------------------------------------\n");
		Dog dog = new Dog(); 
		dog.dogInfo(); 
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo(); 
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo(); //Multilevel inheritance. Bull dog extends Dog -> Dog extends Mammal -> Mammal extends Animal
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n--------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo(); 
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
