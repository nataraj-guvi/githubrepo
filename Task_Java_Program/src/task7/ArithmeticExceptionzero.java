package task7;

import java.util.Scanner;

public class ArithmeticExceptionzero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the first integer: ");
			int num1 = scanner.nextInt();
			System.out.print("Enter the second integer: ");
			int num2 = scanner.nextInt();
			int output = num1 / num2;
			System.out.println("Output: " + output);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not allowed.");
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter integers.");
		} finally {
			scanner.close();
		}
	}
}
