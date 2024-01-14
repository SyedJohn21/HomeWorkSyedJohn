package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool { //'extend'[only one] keyword is used for the inheritance in Abstract.

	public void anatomyLab() { // non abstract method or implemented method
		System.out.println("specially designed to learn human anatomy");

	}

	public abstract void biochemistryLab(); // abstract method or declared method

}

/* Abstract class can inherit other abstract class by using 'extend' keyword
 * Abstract class can inherit a regular class by using 'extend' keyword
 * Abstract class can not inherit interface by using 'extend' keyword
 * Only one inheritance is possible in an abstract class by using 'extend' keyword
 */
