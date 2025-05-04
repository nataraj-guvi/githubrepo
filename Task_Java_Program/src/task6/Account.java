package task6;

import java.util.Scanner;

public class Account {
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public Account() {
		this.accountNumber = "";
		this.accountHolderName = "";
		this.balance = 0.0;
	}

	public Account(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit successful. New balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (balance >= amount) {
				balance = balance - amount;
				System.out.println("Withdrawal successful. New balance: " + balance);
			} else {
				System.out.println("Insufficient balance.");
			}
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	public double checkBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number: ");
		String accNumber = scanner.nextLine();
		System.out.println("Enter account holder name: ");
		String accHolder = scanner.nextLine();
		Account account = new Account(accNumber, accHolder);
		int choice;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println("Current balance: " + account.checkBalance());
				break;
			case 4:
				System.out.println("Thank you for banking with us!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);

		scanner.close();
	}
}