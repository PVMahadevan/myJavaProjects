package practiceQuestion;

import java.util.Scanner;

public class AddandMultiply {
	
	public static void main(String[] args) {
		
		//Write a program to take two integer inputs from user and print sum and product of them.
		
		Scanner firstNumber = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int x = firstNumber.nextInt();
		//System.out.println("The first number is: "+ x);
		
		
		Scanner secondNumber = new Scanner(System.in);
		System.out.print("Please enter the second number: ");
		int y = secondNumber.nextInt();
		//System.out.println("The second number is: "+ y);
		
		int z = (x+y);
		System.out.println("The sum of two numbers:" + z);
		
		int a = (x*y);
		System.out.println("The product of two numbers: " + a);
				
				
	}

}
////import java.util.Scanner;
////class Ans{
////  public static void main(String[] args){
////    Scanner s = new Scanner(System.in);
////    int x = s.nextInt();
////    int y = s.nextInt();
////    System.out.println(x+y);
//  }
//}