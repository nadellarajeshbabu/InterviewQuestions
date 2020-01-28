package progSession2_1;

public class Prog25 
{
	static int n;
	public static void main(String[] args)
	{
		String s1="html9sql8java7";
		String s2="";
		String s="";
		
			for(int j=0;j<=s1.length()-1;j++)
			{
				char c1=s1.charAt(j);
				boolean sta1=Character.isAlphabetic(c1);
				boolean sta2=Character.isDigit(c1);
				if(sta1==true )
				{
				
					s2=s2+c1;
					
				}
				else if(sta2==true)
				{
					String a="";
					for(int k=s2.length()-1;k>=0;k--)
					{
						char ch=s2.charAt(k);
						a=a+ch;
					}
					a=a+c1;
					s+=a;
					s2="";
				}
			}
			System.out.print(s);
	}
}
