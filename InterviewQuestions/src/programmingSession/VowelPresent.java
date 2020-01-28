package programmingSession;

public class VowelPresent 
{
	static char c;
	public static void main(String[] args) 
	{
		String s1="rajesh";
		int count =0;
		System.out.println("Vowels present in a Srring: ");
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
			{
			count++;
			System.out.println((char)(c));
			}
		}
		
	}

}
