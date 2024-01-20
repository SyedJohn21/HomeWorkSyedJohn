package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool { 

	//public abstract void chemistry(); - we can not make abstract method inside a regular class

	public void biology() {
		System.out.println("A branch of science that deals with living organisms and their vital processes");

	}

	public ColumbiaUniversity() {
		
	}

	@Override
	public void biochemistryLab() {
		
	}

	@Override
	public void hygiene() {
		
	}

	/* extends keyword is used to inherit an abstract class
	 * A regular class can inherit an another abstract class by using extends keyword.
	 * A regular class can inherit another class by using extends keyword.
	 * A regular class can not inherit an interface using extends keyword.
	 */
	
	
	
}

