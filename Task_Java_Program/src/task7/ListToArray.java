package task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("Enter the number Integer of elements:");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			list.add(input);
		}
		String[] array = list.toArray(new String[0]);
		System.out.println("Converted Array:");
		for (String element : array) {
			System.out.println(element);
		}

		scanner.close();
	}
}
