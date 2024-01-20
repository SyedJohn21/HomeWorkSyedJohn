package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool { 


	public void biology() {
		System.out.println( "Columbia University :"+"A branch of science that deals with living organisms and their vital processes");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("\nEmergency Room belongs to Hospital and overrieded in Columbia University");
		
	}

	@Override
	public void surgeryRoom() {
		System.out.println("\nSurgery room belongs to Hospital and overrieded in Columbia University");
		
	}

	@Override
	public void cafeteria() {
		System.out.println("\nCafeteria belongs to Hospital and overrided in Columbia University");
		
	}

	@Override
	public void lawInfo() {
		System.out.println("\nLawInfo belongs to Law School and overrided in Columbia University");
		
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("\nAeronauticalInfo belongs to RockfellerUniversity and overrided in Columbia University");
		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("\nVocationalInfo belongs to Vocational School and overrided in Columbia University");
		
	}

	@Override
	public void classSize() {
		System.out.println("\nClass size belongs to University and overrided in Columbia University");
		
	}

	@Override
	public void playGround() {
		System.out.println("\nPlay ground belongs to University and overrided in Columbia University");
		
	}

	@Override
	public void teacher() {
		System.out.println("\nTeacher belongs to University and overrided in Columbia University");
		
	}

	@Override
	public void biochemistryLab() {
		System.out.println("\nBiochemistry lab belongs to Medical school and overrided in Columbia University");
		
	}

	@Override
	public void hygiene() {
		System.out.println("\nHygiene belongs to Nursing school and overrided in Columbia University");
		
	}

	@Override
	public void computerLab() {
		System.out.println("\nComputer Lab belongs to Rockfeller University and overrided in Columbia University");
		
	}

	

	
	
	
	
	
}


