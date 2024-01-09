package hw4JavaVariablesDeclared;

public class AboutMe {
	

	public String myName;
	public byte myAge;
	public short myHouseRent;
	public int myYearlySalary;
	public long myPhoneNumber;
	public float myHeight;
	public double myCgpa;
	public char myGender;
	public boolean usCitizen;
	
	public AboutMe() { //constructor declared
		System.out.println("This is all about us: ");
	}
	
	public void aboutMe() { //method declared
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy House Rent: " + myHouseRent
				+ "\nMy yearly Salary: " + myYearlySalary + "\nMy Phone Number: " + myPhoneNumber + "\nMy Height: "
				+ myHeight + "\nMy CGPa :" + myCgpa + "\nMy Gender: " + myGender + "\nUs Citizen : " + usCitizen + "\n");
	}

}
