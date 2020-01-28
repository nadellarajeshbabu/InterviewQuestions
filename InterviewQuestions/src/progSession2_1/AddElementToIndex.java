package progSession2_1;

public class AddElementToIndex {

	public static void main(String[] args)
	{
		int pos=3;
		int[] a= {1,2,4,5};
		int[] b=new int[a.length+1];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(i<2)
			{
				b[i]=a[i];
			}
			else if(i==(pos-1))
			{
				b[i]=pos;
				b[i+1]=a[i];
			}
			else
			{
				b[i+1]=a[i];
			}
		}
		for(int j=0;j<=b.length-1;j++)
		{
			System.out.println(b[j]);
		}

	}

}
