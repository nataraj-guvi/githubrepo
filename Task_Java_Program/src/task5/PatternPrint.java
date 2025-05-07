package task5;

import java.util.Scanner;

public class PatternPrint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scan.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= rows; j++) {
				if ((i == 0 && (j == 0 || j == rows - 1)) || (i == 1 && (j == 1 || j == rows - 2))
						|| (i == 2 && j == rows / 2) || (i == 3 && (j == 1 || j == rows - 2))
						|| (i == 4 && (j == 1 || j == rows - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			scan.close();
		}
	}
}
