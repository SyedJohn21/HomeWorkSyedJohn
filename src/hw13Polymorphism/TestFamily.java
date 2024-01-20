package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		Sister sister = new Sister();
		sister.sister();
		sister.sister(22, 23, 24);
		sister.sister(32, "33", 34);
		sister.sister(22, 23, 24, 33, 34);
		Sister.sister(22, 24, 33, 34);

		Niece niece = new Niece();
		niece.sister();
		niece.sister(22, 23, 24);
		niece.sister(32, "33", 34);

	}

}
