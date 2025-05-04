import java.util.Scanner;

public class Eight_Print_String {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String value;
		System.out.println("Enter the String to Print");
		value = obj.nextLine();

		for (int i = 0; i < 10; i++) {
			System.out.println(value);

		}
		obj.close();
	}
}
