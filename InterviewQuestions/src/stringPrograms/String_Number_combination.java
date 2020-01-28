package stringPrograms;

/*reverse the string in desired pattern....
 *  input html9sql7java8
 *  output lmth9lqs7avaj8
 */
import java.util.Scanner;

public class String_Number_combination {
	public static void main(String[] args) {
		likePattern();
	}

	public static void likePattern() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String..");
		String s1 = scan.next();

		String s2 = "";
		String finalstring = "";
		for (int i = 0; i <= s1.length() - 1; i++) {
			char ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) 
			{
				s2 = s2 + ch;
			} 
			else
			{
				finalstring = finalstring + reverse(s2);
				finalstring = finalstring + ch;
				s2 = "";
			}
		}
		System.out.println("Given String : " + s1);
		System.out.println("Final String is: " + finalstring);
		scan.close();
	}
	public static String reverse(String givenstring) {
		String rev = "";
		for (int i = givenstring.length() - 1; i >= 0; i--) {
			char ch = givenstring.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
}

