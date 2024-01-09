package hw6Methods;

public class FullName {	

public String fullName(String fName, String lName) {
	System.out.println("Family Member: " + fName +" "+ lName);
	return null;
			
	}

public static void main(String[] args) {
	FullName object = new FullName();
	
	object.fullName("Sabiha", "Sabrin");
	object.fullName("Sania", "Sabrin");

}

	}
