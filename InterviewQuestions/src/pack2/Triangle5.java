package pack2;

public class Triangle5 
{
	public static void main(String[] args)
	{
		int star=6;
		int space=-1;
		for(int i=1;i<=5;i++)
		{
			star--;space++;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
