package programmingSession;

public class OwelCount 
{   
	static char c;
	public static void main(String[] args)
	{
		String s1="javaweb";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
			{
			count++;
			}
		}
		System.out.println("Number of Ovels in a String: "+count);
	}

}
