package arrayprogram;

import java.util.Scanner;

public class MultipleOccuranceOfNumber 
{
	public static void main(String[] args)
	{
		repetitive();
	}

	public static void repetitive() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the element: ");
			a[i] = scan.nextInt();
		}
		// logic
		int count = 0;
		System.out.println("Enter the element to count multiple occurance: ");
		int n = scan.nextInt();
		for (int i = 0; i <= a.length - 1; i++)
		{
			if (a[i] == n) 
			{
				count++;
			}
		}
		System.out.println("Element " + n + " is repeated " + count + " times");
		scan.close();
	}

}
