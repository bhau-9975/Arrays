package Arrays;

public class BubbleSort_Method {
	public static void main(String[] args) {
		int a[] = { 9, 69, 5, 3, 8, 56, 2, 23 };

		int temp;
		
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}

			}
			if (flag == 0) {
				break;
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("2nd Largest : " + a[a.length-2]);
		
		System.out.println("\nDesc : \n");
		
		for (int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("2nd Largest : " + a[1]);
	}
}
