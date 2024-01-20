package hw13Polymorphism;

/*OverLoading is a concept of Java in which we can create multiple methods of the same name in the same class, and all methods work in different ways.
*Multiple methods can have the same name as long as the number and/or type of parameters are different.
*When more than one method of the same name is created in a Class, this type of method is called the Overloaded Method
*/

public class Sister {

	public void sister() { // This is a void type method
		System.out.println("This is a void type method from Sister Class");
	}

	public void sister(int age1, int age2, int age3) { // This is a parameterized method
		System.out.println("This is a parameterized method from Sister Class");
	}

	public int sister(int age4, String age5, int age6) { // This is a return type parameterized method
		int total = age4 + Integer.parseInt(age5) + age6;
		System.out.println("This is a return type parameterized method from Sister Class");
		return (total);

	}

	public static void sister(int age1, int age3, int age5, int age6) { // This is static type parameterize method
		System.out.println("This is static type parameterize method from Sister Class");
	}

	public final void sister(int age1, int age2, int age3, int age5, int age6) { // This is final type parameterized method.																			
		System.out.println("This is final type parameterized method from Sister Class");

	}
}
