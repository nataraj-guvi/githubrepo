package task4;
import java.util.Scanner;

public class Nine_Senior_Citizen_Program {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = obj.nextInt();
		if (age >= 60) {
			System.out.println("You are a senior citizen.");
		} else {
			System.out.println("You are not a senior citizen.");
		}

		obj.close();
	}

}
