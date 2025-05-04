package task6;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Person Name:");
		String name = scan.nextLine();
		System.out.println("Enter the Age:");
		int age = scan.nextInt();
		Person obj = new Person(name, age);
		System.out.println("Name:" + obj.getName());
		System.out.println("Age:" + obj.getAge());
		scan.close();
	}
}
