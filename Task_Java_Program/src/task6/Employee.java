package task6;

import java.util.Scanner;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(double percent) {
		salary = (int) (salary + salary * percent / 100);
		return salary;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int id = scan.nextInt();
		System.out.print("Enter First Name" + " ");
		String firstName = scan.nextLine();
		System.out.print("and Last Name:");
		String lastName = scan.nextLine();
		System.out.println("Enter Salary:");
		int salary = scan.nextInt();
		Employee emp = new Employee(id, firstName, lastName, salary);
		System.out.println(emp + "\n ");
		System.out.println("Annual Salary: " + emp.getAnnualSalary() + " \n");
		System.out.println("Enter raise Percentage:");
		double percent = scan.nextDouble();
		double newsalary = emp.raiseSalary(percent);
		System.out.println(" \n" + "Employee Details " + emp + " \n");
		System.out.println("New Salary After raised:" + " " + newsalary);
		scan.close();
	}

}
