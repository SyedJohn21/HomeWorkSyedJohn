package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		Father father = new Father();

		Father myFather = new Father("Syed Emdad", 65, 'M', false);

		father.father();

		myFather.fatherInfo("Syed Emdad", 65, 'M', false);

		Daughter daughter = new Daughter();

		Daughter daughter1 = new Daughter("September", 30);

		daughter.daughter();

		daughter1.daughterInfo("September", 30);

	}

}
