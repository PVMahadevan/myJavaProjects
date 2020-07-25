package appStarPrint;

import java.util.Scanner;

public class appStarPrint {
	public static void main(String[] args) {

		String symbol = "*";

		Scanner star = new Scanner(System.in);
		System.out.printf("Please enter the number of Stars: ", star);
		int num = star.nextInt();
		System.out.println("The entered number is: "+ num);
		
		int i = 1;
		
		for(i = 0; i<= num; i++) {
			
			System.out.print(symbol);
			
		}

		}

	}

