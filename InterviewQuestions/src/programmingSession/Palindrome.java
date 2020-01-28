package programmingSession;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		int n;
		int rem=0;
		int rev=0;
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println(temp+" is a Palindrome.");
		}
		else 
		{
			System.out.println(temp+" is not a Palindrome.");
		}
	}

}
