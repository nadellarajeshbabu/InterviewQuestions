package progSession2_1;

public class OddEleOfArray
{
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6,7};
	
		for(int i=0;i<=a.length-1;i=i+2)
		{
			System.out.println(a[i]);
		}
	}

}
