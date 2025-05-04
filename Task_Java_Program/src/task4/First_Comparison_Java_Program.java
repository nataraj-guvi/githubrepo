package task4;
import java.util.Scanner;

public class First_Comparison_Java_Program {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a, b, c, d, sum1, sum2;
		System.out.println("Enter Integer Value for A");
		a = obj.nextInt();
		System.out.println("Enter Integer Value for B");
		b = obj.nextInt();
		System.out.println("Enter Integer Value for C");
		c = obj.nextInt();
		System.out.println("Enter Integer Value for D");
		d = obj.nextInt();
		sum1 = a + b;
		sum2 = c + d;
		if (sum1 > sum2) {
			System.out.println("Sum of A and B is Greater than the Sum of C and D");
		} else {
			System.out.println("Sum of C and D is Greater than the Sum of A and B");
		}

		obj.close();
	}

}
