package task7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.println("Enter the number of elements: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			String name = scanner.nextLine();
			names.add(name);
		}
		System.out.println();
		System.out.println("Original ArrayList: " + names);
		System.out.println();
		names.clear();
		System.out.println("ArrayList after removing all elements: " + names);
		scanner.close();
	}
}
