package task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the full path of the file to read: ");
		String fileName = scanner.nextLine().trim();

		try {
			readFileContents(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Error: The file '" + fileName + "' was not found.");
			System.out.println("Please check: ");
			System.out.println("1. Entered file Name/path is correct");
			System.out.println("2. The file exists at that location");
			System.out.println("3. You have proper permissions to access it");
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	public static void readFileContents(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		try (Scanner fileScanner = new Scanner(file)) {
			System.out.println("\nFile contents of '" + fileName + "':");
			System.out.println("----------------------------------");
			while (fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
		}

	}

}
