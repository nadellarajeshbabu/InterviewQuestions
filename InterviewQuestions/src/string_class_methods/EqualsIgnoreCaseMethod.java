package string_class_methods;

public class EqualsIgnoreCaseMethod 
{
	public static void main(String[] args)
	{
		String s1="DeveloPer";
		String s2="Developer";
		String s3="DEVELOPER";
		boolean s=s1.equals(s2);
		boolean status=s1.equalsIgnoreCase(s2);
		boolean status1=s1.equalsIgnoreCase(s3);
		System.out.println(status);
		System.out.println(status1);
		System.out.println(s);
		
	}

}
