import java.util.Scanner;

public class Sixth_FactorialNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number, i;
		long factorial = 1;
		number = obj.nextInt();
		if (number < 0) {
			System.out.println("You have entered the values in negative numbers");
		} else {
			for (i = 1; i <= number; i++) {
				factorial = factorial * i;
			}
			System.out.println("The factorial of " + number + " is: " + factorial);
		}
		obj.close();
	}
	
}
