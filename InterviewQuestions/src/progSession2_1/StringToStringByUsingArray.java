package progSession2_1;

public class StringToStringByUsingArray 
{
	public static void main(String[] args)
	{
		String s1="developer";
		String s2="";
		char[] c1=s1.toCharArray();
		for(int i=c1.length-1;i>=0;i--)
		{	
			char ch=c1[i];
			s2=s2+ch;
			
		}
		System.out.print(s2);
	}

}
