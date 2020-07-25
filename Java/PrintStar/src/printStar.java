import java.util.Scanner;

public class printStar {
	
	public static void main(String[] args) {
	
		String pattern = "*";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:");
		int k = input.nextInt();
		
		
		for ( int i = 0; i != k; i++) {
			
			k = i + 1;
			
			System.out.printf("%d\n", k);
			
			
		}
		
		
	}

}
