package appArea;

import java.util.Scanner;

public class appArea {
	
//	Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
	
	public static void main(String[] args) {
		
		Scanner area = new Scanner(System.in);
		
		System.out.print("Please enter the length of the rectangle: ");
		double length = area.nextDouble();
		System.out.print("Please enter the breadth of the rectangle: ");
		double breadth = area.nextDouble();
		
		double areaofrectangle = length*breadth;
		
		System.out.println("The area of the rectangle is " + (int)areaofrectangle);
		
		
		
	}

}
