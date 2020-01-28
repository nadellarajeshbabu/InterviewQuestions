package pack2;

public class AlphaPattern 
{
	public static void main(String[] args)
	{
		int space=5;int alpha=-1;
		for(int i=1;i<=7;i++)
		{	
			if(i<=4)
			{
				space--;alpha+=2;
			}
			else 
			{
				space++;alpha-=2;
			}
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=alpha;j++)
			{
				System.out.print((char)(i+64)); 
			}
			System.out.println();
		}
	}
}