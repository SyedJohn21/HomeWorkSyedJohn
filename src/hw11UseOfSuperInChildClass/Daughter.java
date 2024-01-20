package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {// Default Constructor
		super();
		super.father();
		super.fatherInfo("Syed Emdad", 65, 'M', false);
//		super.name = "Syed Emdad";
//		super.age = 65;
//		super.sex = 'M';
//		super.usCitizen = false;
		super.familyName = "Syed";
//		System.out.println("Name: " + name + ", Age: " + age + ", Sex :" + sex + ", USCitizen: " + usCitizen);

		System.out.println("-----This is a default constructor from child class Daughter-----");

	
	}

	public Daughter(String birthMonth, int age) { // Parameterized Constructor
		super("Syed Emdad", 65, 'M', false);
//		super.father();
//		super.fatherInfo("Syed Emdad", 65, 'M', false);
//		super.name = "Syed Emdad";
//		super.age = 65;
//		super.sex = 'M';
//		super.usCitizen = false;

	//	System.out.println("Name: " + name + ", Age: " + age + ", Sex :" + sex + ", USCitizen: " + usCitizen);

//		this.birthMonth = birthMonth;
//		this.age = age;

	//	System.out.println("Birth Month: " + birthMonth + ", Age: " + age);
		
		System.out.println("Parameterized constructor fromDather class");
	}

	public void daughter() { // Void type method
//		super.father();
//		super.father();
//		super.name = "Syed Emdad";
//		super.age = 65;
//		super.sex = 'M';
//		super.usCitizen = false;
		super.familyName = "Syed";
	//	System.out.println("Name: " + name + ", Age: " + age + ", Sex :" + sex + ", USCitizen: " + usCitizen);
		System.out.println("\n-----This is a void type method from child class Daughter-----");

	}

	public void daughterInfo(String birthMonth, int age) { // Parameterized method
//		super.father();
//		super.father();
//		super.name = "Syed Emdad";
//		super.age = 65;
//		super.sex = 'M';
//		super.usCitizen = false;
//
//		System.out.println("Name: " + name + ", Age: " + age + ", Sex :" + sex + ", USCitizen: " + usCitizen);
//
//		System.out.println("Birth Month: " + birthMonth + ", Age: " + age);

		System.out.println("Daugher class daughter info method");
	}

}
