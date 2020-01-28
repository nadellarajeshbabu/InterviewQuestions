package programmingSession;

public class StrongNumber
{
	public static void main(String[] args)
	{
		int n=145;
		int rem=0;
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a Strong Number");
		}
		else 
		{
			System.out.println(temp+" is not a Strong Number ");
		}
		
	}

}
