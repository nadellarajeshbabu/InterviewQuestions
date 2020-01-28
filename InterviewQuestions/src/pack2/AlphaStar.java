package pack2;

public class AlphaStar 
{
	public static void main(String[] args)
	{
		int space=4;
		for(int i=1;i<=7;i++)
		{
			if(i<=4)
			{
				space--;
			}
			else
			{
				space++;
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			if((i==1)||(i==7))
			{
				System.out.print("*");
			}
			if((i==3)||(i==5))
			{
				for(int j=1;j<=3;j++)
				{
					System.out.print("*");
					System.out.print(" ");
				}
			}
			if((i==2))
			{
				for(int j=1;j<=2;j++)
				{
					System.out.print((char)(j+64));
					System.out.print(" ");
				}
			}
			if((i==6))
			{
				for(int j=1;j<=2;j++)
				{
					System.out.print((char)(j+70));
					System.out.print(" ");
				}
			}
			if((i==4))
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print((char)(j+66));
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
