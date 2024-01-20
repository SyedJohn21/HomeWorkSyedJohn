package hw14Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	public abstract void computerLab();

	public void mechanicalLab() {
		System.out.println("\nEngineering School :"+"Mechanical labs require setups for thermodynamics and fluid mechanics experiments");

	}
}