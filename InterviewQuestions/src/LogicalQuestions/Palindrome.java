package LogicalQuestions;

public class Palindrome
{
	public static void main(String[] args)
	{
		int n=124;
		int temp=n;
		int rev=0;
		int rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(rev==temp)
		{
			System.out.println(rev+" is a Palindrome......");
		}
		else 
		{
			System.out.println(rev+" is not a Palindrome......");
		}
		
	}

}
