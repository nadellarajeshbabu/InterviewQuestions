package LogicalQuestions;

public class LargestAmongst_n_digit {
	public static void main(String[] args) {
		largest();
	}

	public static void largest() {

		System.out.println("Enter a integer value to factorial of that number...");

		int[] n = { 12, 13, 45, 67, 8, 9, 4, 23, 2 };
		int temp = 0;
		//Executable program
		// Below is the logic for (n-1)cycles....
		for (int c = 1; c <= n.length - 1; c++) {
			// Below is the logic for one cycle....
			for (int i = 0; i <= n.length - 2; i++) {
				if (n[i] > n[i + 1]) {
					// this is the logic for swapping of two numbers......
					temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i <= n.length - 1; i++) {
			System.out.println(n[i]);
		}
		int k = n.length - 1;
		System.out.println("Largest Number among n digits: " + n[k]);
	}

}
