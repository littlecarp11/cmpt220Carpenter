import java.util.Scanner;

public class Eighteen11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		long n = input.nextLong();

		// Display the sum
		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}

	/* Method sums the digits in an integer */
	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	/* Helper overloaded method */
	private static int sumDigits(long n, int sum) {
		if (n == 0) // Base case
			return sum;
		else // Recursive call
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}
