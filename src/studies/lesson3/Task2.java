package studies.lesson3;

import java.util.Scanner;

public class Task2 {

	private static double accountBalance = 2500;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		while (true) {
			
			System.out.println("Enter operation (Deposit, Withdraw, View balance, Exit):");	
			String operation = scanner.nextLine();
			
			switch (operation) {
				case "Deposit": {
					System.out.println("Enter the value:");	
					int value = Integer.parseInt(scanner.nextLine());
					accountBalance += value;
					System.out.println("Operation completed!");
					break;
				}
				case "Withdraw": {
					System.out.println("Enter the value:");	
					int value = Integer.parseInt(scanner.nextLine());
					if ((accountBalance - value) >= 0) {
						accountBalance -= value;
						System.out.println("Operation completed!");
					}
					else {
						System.out.println("Insufficient balance");	
					}
					break;
				}
				case "View balance": {
					System.out.println("Current balance: " + accountBalance);
					break;
				}
				case "Exit": {
					System.out.println("Thank you for using our service!");
					System.exit(0);
				}
				default: {
					System.out.println("Unrecognized operation name. Please try again");
					break;
				}
			}
		}
	} 
}