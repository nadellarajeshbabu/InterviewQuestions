package programmingSession;
import java.util.Scanner;
public class NeonNumber 
{
	public static void main(String[] args)
	{
		int n,sq,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n=s.nextInt();
		
		sq=n*n;
		
		while(sq>0)
		{
			sum=sum+sq%10;
			sq=sq/10;
		}
		if(sum==n)
		{
			System.out.println(n+" is a neon number");
		}
		else 
		{
			System.out.println(n+" is not a neon number");
		}
	}
}
