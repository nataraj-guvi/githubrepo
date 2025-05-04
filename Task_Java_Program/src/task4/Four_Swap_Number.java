package task4;
import java.util.Scanner;

public class Four_Swap_Number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter Value1");
		a = obj.nextInt();
		System.out.println("Enter Value2");
		b = obj.nextInt();
		System.out.println("First Value Before swapping: " + a);
		System.out.println("Second Value Before swapping:" + b);
		c = a;
		a = b;
		b = c;
		System.out.println("First Value After swapping: " + a);
		System.out.println("Second ValueAfter swapping:" + b);
		obj.close();
	}

}
