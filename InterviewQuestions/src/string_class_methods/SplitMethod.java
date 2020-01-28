package string_class_methods;

public class SplitMethod 
{
	public static void main(String[] args)
	{
		String s1 = "peri erili cious";
		String[] s2 = s1.split(" ");
		for(String a:s2)
		{
			System.out.println(a);
		}
	}
}

