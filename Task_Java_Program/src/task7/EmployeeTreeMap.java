package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeTreeMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<Integer, String> employeeMap = new TreeMap<>();
		System.out.print("Enter the number of employees: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter employee ID for Employee" + i + ":");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter employee name Employee" + i + ":");
			String name = scanner.nextLine();
			employeeMap.put(id, name);
		}
		ArrayList<String> names = new ArrayList<>(employeeMap.values());
		Collections.sort(names);
		System.out.println();
		System.out.println("Employee names in alphabetical order:");
		for (String name : names) {

			System.out.println(name);
		}
		scanner.close();
	}
}
