
package hw14Abstraction;

public interface University extends Hospital{ 
	public void classSize();

	public void playGround();

	public void teacher();


	public default void gymnasium() {

	}

	public static void library() {

	}
	

}

