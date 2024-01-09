package hw4JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe syed = new AboutMe(); // constructor initialized
		syed.myName = "Syed John";
		syed.myAge = 33;
		syed.myHouseRent = 2000;
		syed.myYearlySalary = 999999999;
		syed.myPhoneNumber = 1234567890l;
		syed.myHeight = 6.5f;
		syed.myCgpa = 4.555;
		syed.myGender = 'M';
		syed.usCitizen = false;
		syed.aboutMe(); //method initialized

		AboutMe alex = new AboutMe(); // constructor initialized
		alex.myName = "Alex Sharkar";
		alex.myAge = 65;
		alex.myHouseRent = 2100;
		alex.myYearlySalary = 999999669;
		alex.myPhoneNumber = 15364567890l;
		alex.myHeight = 5.5f;
		alex.myCgpa = 3.555;
		alex.myGender = 'F';
		alex.usCitizen = true;
		alex.aboutMe(); //method initialized

	}

}
