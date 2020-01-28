package programmingSession;
import java.util.Scanner;
public class Armstrong 
{
		public static void main(String[] args)
		{
			int n;
			int count=0;
			int ld=0;
			int rem=1;
			int res=0;
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number to check whether it is Armstrong or not :");
			n=s.nextInt();
			int num=n;
			while(n!=0)
			{
				n=n/10;
				count++;
			}
			n=num;
			
			while(n!=0)
			{
				ld=n%10;
				
				for(int i=1;i<=count;i++)
				{
					rem*=ld;
				}
					res=res+rem;
					rem=1;
					n=n/10;
			}
			if(res==num)
			{
				System.out.println(num+" is an Armstrong Number");
			}
			else 
			{
				System.out.println(num+" is not a Armstrong number");
			}
			
		}

	}

