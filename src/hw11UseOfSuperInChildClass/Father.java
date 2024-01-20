package hw11UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() { // This is a default Constructor
		System.out.println("-----This is a default constructor from parent class Father-----");

	}

	public Father(String name, int age, char sex, boolean usCitizen) { // Parameterized Constructor
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age: " + age + ", Sex :" + sex + ", USCitizen: " + usCitizen);
	}

	public void father() { // Void type method
		System.out.println("\n-----This is a void type method from parent class Father-----");

	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) { // Parameterized method
	
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		
		System.out.println("Name: " + name + ", Age: " + age + ", Sex :" + sex + ", USCitizen: " + usCitizen);

	}

}
