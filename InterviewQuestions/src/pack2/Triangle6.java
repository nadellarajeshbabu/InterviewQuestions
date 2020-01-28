package pack2;

public class Triangle6 
{
	public static void main(String[] args)
	{
		int star=-1;
		int syn=5;
		int que=5;
		for(int i=1;i<=5;i++)
		{
			syn--;star+=2;que--;
			for(int j=1;j<=syn;j++)
			{
				System.out.print("@");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=que;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
