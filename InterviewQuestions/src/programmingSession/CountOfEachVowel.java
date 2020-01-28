package programmingSession;
import java.util.Scanner;
public class CountOfEachVowel 
{
	static char c;
	public static void main(String[] args)
	{
		String s1="developer";
		int counta=0;int counte=0;int counti=0;
		int counto=0;
		int countu=0;
		System.out.println("Count of each vowel in a given String: ");
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(c=='a')
			{
				counta++;
			}
			else if(c=='e')
			{
				counte++;
			}
			else if(c=='i')
			{
				counti++;
			}
			else if(c=='o')
			{
				counto++;
			}
			else if(c=='e')
			{
				countu++;
			}
		}
		System.out.println("a:"+counta+" times");
		System.out.println("e:"+counte+" times");
		System.out.println("i:"+counti+" times");
		System.out.println("o:"+counto+" times");
		System.out.println("u:"+countu+" times");
	}

}
