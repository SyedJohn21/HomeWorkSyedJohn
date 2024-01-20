
package hw12Abstraction;

public interface University extends College, Hospital{ 
	public void classSize();

	public void playGround();

	public void teacher();


	public default void gymnasium() {

	}

	public static void library() {

	}
	
	/*'Extends' keyword is used for the inheritance in Interface.
	 *Interface can inherit other interfaces by using extends keyword.
	 * Interface can not inherit regular Class or Abstract class by using extends keyword.
	 * interface can inherit multiple other interfaces by using Extends keyword
	 * Implements keyword can not be used inside the interface class.
	 */


}

