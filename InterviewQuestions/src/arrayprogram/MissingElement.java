package arrayprogram;

import java.util.Scanner;

public class MissingElement
{
	static int k;
	public static void main(String[] args) 
	{
		missingElement();
	}

	public static void missingElement()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i <= a.length - 1; i++)
		{
			System.out.println("Enter the element: ");
			a[i] = scan.nextInt();
		}
		//logic to find missing elements.....
		System.out.println("Missing elements from 1 t0 100 : ");
		for(int i = 1;i <= 20;i++)
		{
			k=0;
			for (int j = 0; j <= a.length - 1; j++)
			{
				if (i == a[j]) 
				{
					k = 1;
				}
			}
			if (k == 0) 
			{
				System.out.println(i);
			}
			
		}
		scan.close();
	}
}
//write a program to print missing numbers from 1 to 100.... 

//write a program to create 2arrays and copy elements from 1array and 2 array to 3array...
//write a program to remove duplicates from the array?
