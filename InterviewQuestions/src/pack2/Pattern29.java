package pack2;

public class Pattern29 
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
