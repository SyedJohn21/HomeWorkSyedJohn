package hw12Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public void anatomyLab() { // non abstract method or implemented method
		System.out.println("specially designed to learn human anatomy");

	}

	public abstract void biochemistryLab(); // abstract method or declared method

}

//Extends' and 'Implements' can be used to inherit interface inside abstract class.

// Extends Keyword :
/*Abstract class can inherit other abstract class [only one] by using 'extend' keyword
 * Abstract class can inherit a regular class by using 'extend' keyword
 *  Abstract class can not inherit interface by using 'extend' keyword
 */


//Implements Keyword :
/* Abstract class can not inherit abstract class by using implements keyword.
 * Abstract class can not inherit regular class by using implements keyword.
 * Abstract class can inherit other interface more than one by using implements keyword
 */



