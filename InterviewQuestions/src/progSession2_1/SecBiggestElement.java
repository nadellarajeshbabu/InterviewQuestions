package progSession2_1;

public class SecBiggestElement 
{
	public static void main(String[] args)
	{
		int flar=0;
		int seclar=0;
		int[] a= {99,175,1455,362,141,180};
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]>flar)
				{
					seclar=flar;
					flar=a[j];
				}
			}
		
		System.out.println("Firstlargest: "+flar);
		//System.out.println("Second largest: "+temp);
		}

}
