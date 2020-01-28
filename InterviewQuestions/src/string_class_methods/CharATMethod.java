package string_class_methods;

public class CharATMethod {

	public static void main(String[] args)
	{
		String s1="Developer";
		char c=s1.charAt(4);
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			System.out.println(ch);
		}
		System.out.println(c);

	}
}
