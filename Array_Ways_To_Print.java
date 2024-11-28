package Arrays;

public class Array_Ways_To_Print {

	public static void main(String[] args) {

		int arr[] = { 13, 56, 43, 78, 23 };

		// 1-D Array
		System.out.println("\nPrinting 1-D Array : \n");
		
		System.out.println("Using For Each loop : \n");
		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("\nNormal for loop : \n");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 2-D Array

		System.out.println("\nPrinting 2-D Array : \n");
		int arr1[][] = { { 13, 56 }, { 10, 20 } };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(" " + arr1[i][j]);
			}
			System.out.println();
		}

		// 3-D Array

		System.out.println("\nPrinting 3-D Array : \n");
		int arr2[][][] = { { { 10, 20 }, { 30, 40, 50 } }, { { 60, 70, 80 }, { 90, 100 } } };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {
				for (int k = 0; k < arr2[i][j].length; k++) {
					System.out.print(" " + arr2[i][j][k]);
				}

				System.out.println();
			}
			System.out.println();
		}

	}

}
