package LogicalQuestions;

public class Neon_Number {
	public static void main(String[] args) {
		int n = 9;
		int sum = 0;
		int temp = n;
		int ld = 0;
		int sq = n * n;
		while (sq != 0) {
			ld = sq % 10;
			sum = sum + ld;
			sq = sq / 10;
		}
		if (sum == temp) {
			System.out.println(n + " is a Neon number....");
		} else {
			System.out.println(n + " is not a Neon number......");
		}

	}

}
//Neon number is the number which is sum of the digits of number after squared
//is equal to the original/given number before squared...  
