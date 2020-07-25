package appMultidimensionalArray;

public class MultiDimensionalArray {
	public static void main(String[] args) {

		int[] values = { 10, 20, 30 };

//		System.out.println(values[2]);

		int[][] grid = { { 10, 20, 30 }, { 15, 25, 35 }, { 2, 3, 4, 5 } };

		System.out.println(grid[2][3]);
		System.out.println(grid[2][0]);

		String[][] texts = new String[2][3];

		texts[0][1] = "Hello there";

		System.out.println(texts[0][1]);

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {

				System.out.print(grid[row][col]+ "\t");
			}
			
			System.out.println();
		}
	}
}
