package appArray;

public class appArray {
	public static void main(String[] args) {

		//int value = 7;

		int[] values;
		values = new int[3];

		values[0] = 5;
		values[1] = 9;
		values[2] = 10;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);

		}
		int[] numbers = { 1, 2, 3 };

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
