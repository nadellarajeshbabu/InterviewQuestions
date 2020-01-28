package LogicalQuestions;

public class Strong_Number {

	public static void main(String[] args) {
		int n = 145;
		int sum = 0;
		int ld = 0;
		int fact = 1;
		int temp = n;

		while (n != 0) 
		{
			ld = n % 10;
			for (int i = 1; i <= ld; i++) 
			{
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
			fact = 1;
		}
		n = temp;
		if (temp == sum)
		{
			System.out.println(n + " is a Strong number....");
		}
		else
		{
			System.out.println(n + " is not a Strong number....");
		}
	}

}

//Strong number is nothing but the sum of factorials of a digits of number.
