package appStudentInterst;

import java.util.Scanner;

public class StudentInterst {
	public static void main(String[] args) {
		
		//Take name, roll number and field of interest from user and print in the format below :
		//Sample output: Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
		
		Scanner n= new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = n.nextLine();
		
		Scanner rn = new Scanner(System.in);
		System.out.print("Please enter you roll number: ");
		double RollNumber = rn.nextDouble();
//		if(RollNumber !=(int) rn {
//			System.out.println("Podi Patti");
		
		
		Scanner i = new Scanner(System.in);
		System.out.print("Please enter your area of interest: ");
		String Interest = n.nextLine();
		
		System.out.printf("Hey, I'm %s and my roll number is %f. My field of interest is %s.", name, RollNumber,Interest);
		
		
		
	}

}
