package pack2;

public class Triangle4 
{
	public static void main(String[] args)
	{
		int star=11;
		int space=-1;
		for(int i=1;i<=5;i++)
		{
			star-=2;space++;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
