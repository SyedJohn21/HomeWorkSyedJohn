package hw5Q2Constructor;

public class Student {
	
	public String stName; // Variables are initialized here
	public long stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;
	public Student() { // Default constructor declared
		System.out.println(":------This is from the default Constructor of the Student class------:");

}
	public Student(String stName, long stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		
		System.out.println("Student Name: " + stName + "\nID: " + stID + "\nGender: " + sex
				+ " \nJava Programmer? Ans: " + isProgrammer + " \nGrade: " + grade);
	}

		
	}
