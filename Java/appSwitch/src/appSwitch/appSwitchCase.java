package appSwitch;

import java.util.Scanner;

public class appSwitchCase {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an command: ");
		String text = input.nextLine();
		
		switch(text) {
		case "start":
			System.out.println("The machine has started");
			break;
			
		case"stop":
			System.out.println("The machine has stopped");
			break;
			
			default:
				System.out.println("Command not recognized");
		
		}
	}

}
