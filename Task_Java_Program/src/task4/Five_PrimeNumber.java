package task4;
import java.util.Scanner;

public class Five_PrimeNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number");
		int number = obj.nextInt();
		boolean prime = true;
		if (number <= 1) {
			prime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					prime = false;
					break;
				}
			}
		}
		if (prime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

		obj.close();
	}

}
