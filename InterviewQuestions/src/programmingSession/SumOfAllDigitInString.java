package programmingSession;

public class SumOfAllDigitInString 
{
	static char c;

	public static void main(String[] args) 
	{
		int sum=0;
		String s1="html8java7sql2";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);		{
			boolean c1=Character.isDigit(c);
				if(c1==true)
				{
					int d=c-48;
					sum=sum+d;
				}
			}
		}
		System.out.println("Number of Digits in a given string "+s1+" is:"+sum);
		

	}

}
