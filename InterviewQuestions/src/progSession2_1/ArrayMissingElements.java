package progSession2_1;

public class ArrayMissingElements 
{

	public static void main(String[] args) 
	{
		
		int[] a= {1,24,5,67,83,98};
		for(int i=1;i<=100;i++)
		{
			int flag=1;
			for(int j=0;j<=a.length-1;j++)
			{
				
				if(a[j]==i)
				{
					 flag=0;
				}
			}
			if(flag==1)
			{
			
				System.out.println(i);
			}
		}
			
	}

}
