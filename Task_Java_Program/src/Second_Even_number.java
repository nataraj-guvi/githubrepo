import java.util.Scanner;

public class Second_Even_number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n;
		System.out.println("Enter the Integer Value");
		n = obj.nextInt();
		if (n % 2 == 0) {
			System.out.println("Given number" + n + " is an Even Number");
		} else {
			System.out.println("Given number" + n + "is not a Even Number");
		}
		obj.close();
	}

}
