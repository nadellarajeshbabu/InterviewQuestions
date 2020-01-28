package string_class_methods;

public class SubStringMethod2Arg 
{
	public static void main(String[] args)
	{
		String s1="developer";
		//subString(int start index, int end index)...
		//start index is inclusive and end index is exclusive....
		
		String s2=s1.substring(1,7);
		System.out.println(s2);
	}

}
