package string_class_methods;

public class IndexOFMethod 
{
	public static void main(String[] args)
	{
		String s1="Developer";
		int c=s1.indexOf('e');
		int c1=s1.indexOf('e',2);
		int c2=s1.indexOf('e',3);
		int c3 = s1.indexOf('a');
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);		
	}
}
