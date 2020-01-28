package pack2;

public class Triangle8 
{
	public static void main(String[] args)
	{
		int space=5,star=-1;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				space--;star+=2;
			}
			else
			{
				space++;star-=2;
			}
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
