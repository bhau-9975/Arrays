package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Delete_Duplicate {
	public static void main(String[] args) {

		Integer a[] = { 3, 5, 4, 3, 2, 1, 23, 2 };

		// List<Integer> list = List.of(a); // It will not create dynamic array
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		System.out.println("Printing arrays element : \n");
		
		list.add(55);
		
		for (Integer n : list) {
			System.out.println(n);
		}

		// Way1
		System.out.println("\nPrinting unique arrays element :\n ");

		Set<Integer> set = new HashSet<>(Arrays.asList(a));

		for (Integer n : set) {
			System.out.println(n);
		}

		// Way2
				System.out.println("\nWay 2 to Printing arrays element :\n ");
				int arr[] = { 3, 5, 4, 3, 2, 1, 23, 2 };
				int []b =Arrays.stream(arr).distinct().toArray();

				for (Integer n : b) {
					System.out.println(n);
				}
				
				System.out.println("\nWay 2 to Printing arrays element :\n ");
				int arr2[] = { 3, 5, 4, 3, 2, 1, 23, 2 };
				Set<Integer>n1=new HashSet<>();

				for (Integer n : b) {
					System.out.println(n);
				}

		
	}
}
