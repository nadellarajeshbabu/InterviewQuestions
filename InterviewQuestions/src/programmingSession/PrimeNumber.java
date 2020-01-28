package programmingSession;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int n;
		int factor=0;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter a number");
		n=d.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				factor++;
			}
			
		}
		if(factor==2)
		{
			System.out.println(n+" is a Prime number.");
		}
		else
		{
			System.out.println(n+" is not Prime number.");
		}
	}

}
