package arrayprogram;

import java.util.Scanner;

public class Remove_Duplicates 
{	
	public static void main(String[] args)
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
		//logic to count the elements without repetition.......
		
		int count=0; 
		for (int i = 0; i <= a.length - 1; i++)
		{
			int status=0;
			for (int j = i; j >=0; j--) 
			{
				if (a[i] == a[j]) 
				{
					status++;
				}
			}
			if(status==1)
			{
				count++;
			}
		}
		//System.out.println(count);
		//Create an array to store elements without duplicates.....
		int[] a1 = new int[count];
		int a1Index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			int status=0;
			for(int k=0;k<=a1.length-1;k++)
			{
				System.out.println("i="+a[i]+" "+"k="+a1[k]);
				
				if(a[i]==a1[k])
				{
					status=1;
				}
			}
			if(status==0)
			{
				a1[a1Index]=a[i];
				a1Index++;
			}
		}
		
		System.out.println("Array elements are: ");
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("Array without duplicates: ");
		for(int n:a1)
		{
			System.out.println(n);
		}
		scan.close();
	}
}
