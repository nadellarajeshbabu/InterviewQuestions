package progSession2_1;

public class Prog26
{
	public static void main(String[] args)
	{
		int[] a= {10,11,12,13};
		int[] c= {14,15,16,17,18,19};
		int[] b=new int[10];
		System.out.println("Array elements of B:");
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
		for(int j=0;j<=a.length+c.length-1;j++)
		{
			b[j]=c[j];
			System.out.println(b[j]);
		}
	}

}
