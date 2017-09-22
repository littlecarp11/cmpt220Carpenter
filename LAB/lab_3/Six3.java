import java.util.Scanner;

public class Six3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
	}

	/** Method isPalindrome returns true if number is a palindrome */
	public static boolean isPalindrome(int number) {
		if (number == reverse(number))
			return true;
		else
			return false;
	}

	public static int reverse(int number) {
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
		return number;
	}
		
}
