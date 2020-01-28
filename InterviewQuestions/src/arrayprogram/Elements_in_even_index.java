package arrayprogram;

import java.util.Scanner;

public class Elements_in_even_index {
	public static void main(String[] args) {
		evenIndex();
	}

	public static void evenIndex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println("Enter the element: ");
			a[i] = scan.nextInt();
		}
		System.out.println("=========================");
		System.out.println("Entered array elements are: ");
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("=========================");
		System.out.println("Even index numbers are: ");
		for (int i = 0; i <= a.length - 1; i++) 
		{
			if (i % 2 == 0)
			{
				System.out.println(a[i]);
			}
		}
		scan.close();
	}

}
