package appUserIntInput;

import java.util.Scanner;

public class appIntInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int value = input.nextInt();
		System.out.println("You entered: " + value);
	}
}
