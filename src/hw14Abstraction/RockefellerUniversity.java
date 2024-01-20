package hw14Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	public void math() {
		System.out.println("\nRockefeller University :"+"The study of numbers and how they are related to each other and to the real world");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("AeronauticalInfo belongs to Aeronautical School and overrided in Rockfeller University");
		
	}

	@Override
	public void computerLab() {
		System.out.println("Computer lab belongs to Engineering School and overrided in Rockfeller University");
		
	}



}
