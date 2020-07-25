package appDoWhile;

import java.util.Scanner;

public class appDoWhile {
	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int value = myInput.nextInt();
		
		do {
			
			System.out.println("Enter the number again: ");
			value = myInput.nextInt();
			}

		while(value != 5); {
			
			System.out.println(" We got 5!");
			
		}
	}
}