package progSession2_1;

public class Prog24 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s="developer";
		String s2="";
		char c1=s.charAt(0);
		char c2=s.charAt(s.length()-1);
		
		for(int i=s.length()-2;i>=1;i--)
		{
			char c3=s.charAt(i);
			s2=s2+c3;
		}
		System.out.println(c1+s2+c2);
	}

}
