
package arrayprogram;

import java.util.Scanner;

public class Join_1arrayand2array_with_3rdArray {
	public static void main(String[] args) {
		arrayJoining();
	}

	public static void arrayJoining()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the first array:");
		int asize = scan.nextInt();
		int[] a = new int[asize];
		for (int i = 0; i <= a.length - 1; i++) 
		{			
			System.out.println("Enter the element: ");
			a[i] = scan.nextInt();
		}
		System.out.println("===================================");
		System.out.println("Enter the size of the second array:");
		int bsize = scan.nextInt();
		int[] b = new int[bsize];
		for (int i = 0; i <= b.length - 1; i++) 
		{
			System.out.println("Enter the element: ");
			b[i] = scan.nextInt();
		}
		System.out.println("===================================");
		int[] c = new int[asize + bsize];
		// logic starts

		for (int i = 0; i <= a.length-1; i++) 
		{
			c[i]=a[i];
		}
		int k=a.length;
		for (int i = k; i <= b.length-1; i++) 
		{
			c[i]=b[i];
			k++;
		}
		System.out.println("Printing the elements of third array:");
		for (int i = 0; i <= c.length - 1; i++)
		{
			System.out.println(c[i]);
		}
		scan.close();
	}
}
