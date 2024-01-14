package hw10Abstraction;

public interface University extends College, Hospital { // 'Extend' keyword is used for the inheritance in Interface.
	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {} - Interfaces cannot have constructors

	public default void gymnasium() {

	}

	public static void library() {

	}
	/*Interface can inherit other interfaces.
	 * Interface can not inherit regular Class or Abstract class
	 * interface can inherit multiple other interfaces using Extends keyword
	 */


}

