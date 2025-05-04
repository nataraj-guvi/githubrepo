import java.util.Scanner;

public class Seven_String_Length {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = obj.nextLine();
		int length = string.length();
		System.out.println("The length of the string is: " + length);
		obj.close();
	}

}
