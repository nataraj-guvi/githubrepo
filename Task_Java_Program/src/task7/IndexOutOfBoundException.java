package task7;

import java.util.Scanner;

public class IndexOutOfBoundException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter size of the array: ");
			int size = scanner.nextInt();
			int[] array = new int[size];
			System.out.println("Enter the " + size + " elements of the array");
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.print("Enter an index to access in the array: ");
			int arrayIndex = scanner.nextInt();
			System.out.println("Value at index " + arrayIndex + ": " + array[arrayIndex]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		}
		scanner.nextLine();
		System.out.println();
		try {
			System.out.println("Enter a string: ");
			String str = scanner.nextLine();
			System.out.println("Enter an index to access in the string: ");
			int strIndex = scanner.nextInt();
			System.out.println("Character at index " + strIndex + ": " + str.charAt(strIndex));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
		}
		scanner.close();
	}
}
