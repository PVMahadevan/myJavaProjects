package addTwoNumbers;

import java.util.Scanner;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class AddTwoNumbers {
	public static void main(String[] args) {
		

		Scanner z = new Scanner(System.in);
		System.out.println("Print the first number: ");
		double zvalue = z.nextDouble();
		Scanner a = new Scanner(System.in);
		System.out.println("Print the second number: ");
		double avalue = a.nextDouble();
		double sum = zvalue + avalue;
		System.out.printf("The sum of two numbers is: %f", sum);
		

	}
}
