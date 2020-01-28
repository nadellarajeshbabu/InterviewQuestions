package tecnicalAptitude;

import java.util.Scanner;

public class PrimeNumbersInBetweenGivenNumber
{
	static int count;
	public static void main(String[] args)
	{
		primeNumber();
	}
	public static void primeNumber()
	{
		int n=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number");
		int initial = scan.nextInt();
		System.out.println("enter the second number");
		int endnumber = scan.nextInt();
		for(int j=initial;j<=endnumber;j++)
		{
			count=0;
			for(int i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(j);
			}
			else
			{
				//System.out.println();
			}
		}
	}
}
