package hw13Polymorphism;

/* Method overloading in Java is a feature that allows a class to have more than one method having the same name
 * When more than one method of the same name is created in a Class, this type of method is called the Overloaded Method
 */

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This is a void type method from Sister Class");

	}

	@Override
	public void sister(int age1, int age2, int age3) {
		System.out.println("This is a parameterized method from Sister Class");
	}

	@Override
	public int sister(int age4, String age5, int age6) {
		int total = age4 + 1 + Integer.parseInt(age5) - 4 + age6 + 2;
		System.out.println("This is a return type parameterized method from Sister Class");
		return (total);

	}

	/*
	 * Static methods in Java cannot be overridden Method overriding relies on
	 * dynamic binding at runtime, but static methods are bonded at compile time with static binding
	 */
//	@Override
//	public static void sister(int age1, int age3, int age5, int age6) {
//		System.out.println("This is static type parameterize method from Sister Class");
	

	
	 /* We can not override final method. It's a rule. 
	 * If we are declaring any method with the final keyword, that means we're providing some special attention and make sure no one can override it.
	 */
//	@Override
//	public final void sister(int age1, int age2, int age3, int age5, int age6) { // This is final type parameterized method.																			
//		System.out.println("This is final type parameterized method from Sister Class");
//	}

}
