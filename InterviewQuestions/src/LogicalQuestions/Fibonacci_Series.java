package LogicalQuestions;

/*
 * Fibonacci series
 */
import java.util.Scanner;

public class Fibonacci_Series
{
	public static void main(String[] args)
	{
		fibonacciSeries();
	}

	public static void fibonacciSeries() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer value to factorial of that number...");
		int n = scan.nextInt();
		int fno = 0;
		int sno = 1;
		int res = 0;
		System.out.println(fno);
		System.out.println(sno);

		// This is the logic for fibonacci series....
		for (int i = 1; i <= n - 2; i++) 
		{
			res = fno + sno;
			fno = sno;
			sno = res;
			System.out.println(res);
		}
		scan.close();
	}

}
