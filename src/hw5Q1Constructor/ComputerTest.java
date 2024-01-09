package hw5Q1Constructor;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer(); //default constructor is initialized here
		Computer apple = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A',false); // parameterized constructor is initialized here
		Computer windows = new Computer("Lenovo", "Yoga360", "Windows 11", 850, 'A',true);
	}

}
