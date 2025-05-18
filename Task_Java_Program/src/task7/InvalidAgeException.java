package task7;

import java.util.Scanner;
public class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}

	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("InvalidAgeException: " + age + " is lesser than than Age 18 not Eligible for Vote");
		} else {
			System.out.println(age + " is a valid age you are Eligible for Vote" );
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		try {
			int age = scanner.nextInt();
			checkAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter a valid number.");
		} finally {
			scanner.close();
		}
	}
}
