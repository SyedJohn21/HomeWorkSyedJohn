package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {

	public static void main(String[] args) {
		System.out.println("<-- Please Write about your Java level -->");

		Scanner scanner = new Scanner(System.in);
		String myLevel = scanner.next();

		switch (myLevel) {

		case "Beginner":
			System.out.println("I am at the beginner level");

		case "Intermediate":
			System.out.println("I am at the Intermediate level");

		case "Expert":
			System.out.println("I am at expert level");

		case "Excellent":
			System.out.println("I have a Java Certification from Oracle");

		case "default":
			System.out.println("I am a drop out");

			scanner.close();
		}

	}

}
