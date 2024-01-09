package hw5Q1Constructor;

public class Computer {

	public String brand; // Variables are declared
	public String model;
	public String operatingStytem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() { // default constructor declared here
		System.out.println("This is from the default constructor of computer class");
	}

	public Computer(String brand, String model, String operatingStytem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingStytem = operatingStytem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperationg System: " + operatingStytem
				+ "\nPrice: $" + price + "\nGrade: " + grade + "\nMade in the USA? Ans: " + madeInUSA + "\n");
	}

}
