import java.util.Scanner;

public class appMultiply {
	public static void main(String[] args) {

		Scanner myInt = new Scanner(System.in);

		System.out.println("Enter the number for the multiplication table: ");

		int value = myInt.nextInt();

		System.out.println("The entered number is: " + value);

		int i = value;
		int x = 10;
		
		for (i = 1; i <= x; i++) {

			int y = x*i;
			System.out.printf("%d * %d = %d \n", x, i , y);

		}
		

	}
}
