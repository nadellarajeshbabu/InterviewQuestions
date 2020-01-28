package pack2;

public class LeftArrow 
{
	public static void main(String[] args)
	{
		int space=4,star=0;
		for(int i=1;i<=7;i++)
		{
			if(i<=4)
			{
				star++;space--;
			}
			else
			{
				star--;space++;
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if((i==3)||(i==4)||(i==5))
			{
				for(int j=1;j<=8;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
