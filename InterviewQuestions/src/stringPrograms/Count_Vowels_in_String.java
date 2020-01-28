
package stringPrograms;

/*
 * Counting the total no of vowels in a string.....
 */
import java.util.Scanner;

public class Count_Vowels_in_String {

	public static void main(String[] args) {
		vowelsCount();
	}

	public static void vowelsCount() {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string....");
		String s1 = scan.next();
		System.out.println("Vowels in a String is : ");
		for (int i = 0; i <= s1.length() - 1; i++)
		{
			char ch = s1.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U')
			{
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("Given String: " + s1);
		System.out.println("NO of Vowels in a above String is : " + count);
		scan.close();
	}

}
