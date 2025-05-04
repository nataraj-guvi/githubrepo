package task5;

import java.util.Scanner;

public class HotelRoomTariff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Month in number:");
		int month = scanner.nextInt();
		System.out.println("Enter the Room Rent:");
		double roomRent = scanner.nextDouble();
		System.out.println("Enter the Number of days stayed in the room in number");
		int daysStayed = scanner.nextInt();
		double totalTariff;
		boolean isPeakSeason = false;
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			isPeakSeason = true;
			break;
		default:
			isPeakSeason = false;
		}
		if (isPeakSeason) {
			totalTariff = roomRent * daysStayed * 1.20;
		} else {
			totalTariff = roomRent * daysStayed;
		}
		System.out.printf("The Total Amount for the Room Rent is:" + String.format("%.2f", totalTariff));
		scanner.close();
	}
}
