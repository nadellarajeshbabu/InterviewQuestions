package pack2;

public class Triangle7 
{
	public static void main(String[] args)
	{
		int space=-1;
		int syn=5;
		int que=5;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
			syn--;space+=2;que--;
			}
			else 
			{
				syn++;space-=2;que++;
			}
			for(int j=1;j<=syn;j++)
			{
				System.out.print("@");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=que;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}


}
