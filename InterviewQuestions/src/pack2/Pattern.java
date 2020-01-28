package pack2;

public class Pattern 
{
	public static void main(String[] args)
	{
		int space=4;
		for(int i=1;i<=7;i++)
		{
			if((i<=4))
			{
				space--;
			}
			else 
			{
				space++;
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			if((i==1)||(i==7))
			{
				System.out.print("*");
			}
			else if(i==2)
			{
				for(char ch='A';ch<='Z';ch++)
				{
					if((ch=='A')||(ch=='B'))
					{
					System.out.print(ch);
					System.out.print(" ");
					}
				}
			}
			else if(i==6)
			{
				for(char ch='A';ch<='Z';ch++)
				{
					if((ch=='G')||(ch=='H'))
					{
					System.out.print(ch);
					System.out.print(" ");
					}
				}
			}
			else if((i==3)||(i==5))
			{
				for(int j=1;j<=3;j++)
				{
					System.out.print("*");
					System.out.print(" ");
				}
			}
			else if(i==4)
			{
				for(char ch='A';ch<='Z';ch++)
				{
					if((ch=='C')||(ch=='D')||(ch=='E')||(ch=='F'))
					{
					System.out.print(ch);
					System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
