package hw14Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public void anatomyLab() {
		System.out.println("\nMedical School : " + "Specially designed to learn human anatomy");

	}

	public abstract void biochemistryLab(); // abstract method or declared method

}




