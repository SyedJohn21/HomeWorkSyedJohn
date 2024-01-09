package hw4JavaVariablesInitialized;

public class AboutMe {

	public String myName = "Syed";
	public byte myAge = 33;
	public short myHouseRent = 1450;
	public int myYearlySalary = 125000;
	public long myPhoneNumber = 2063585753;
	public float myHeight = 5.11f;
	public double myCgpa = 4.75234;
	public char myGender = 'M';
	public boolean usCitizen = false;

	public void aboutMe() { //method implemented
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy House Rent: " + myHouseRent
				+ "\nMy yearly Salary: " + myYearlySalary + "\nMy Phone Number: " + myPhoneNumber + "\nMy Height: "
				+ myHeight + "\nMy CGPa :" + myCgpa + "\nMy Gender: " + myGender + "\nUs Citizen : " + usCitizen);

	}

	public AboutMe() {

	}

}
