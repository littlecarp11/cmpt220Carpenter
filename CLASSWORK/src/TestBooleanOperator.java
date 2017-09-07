import java.util.Scanner;

public class TestBooleanOperator {

	public static void main(String[] args) {
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// receive the input
		System.out.print("eneter an integer: ");
		int number = input.nextInt();
		
		if (number % 2 == 0 && number % 3 == 0)
			System.out.println(number + " is divisible by 2 and 3.");
		if (number % 2 == 0 || number % 3 == 0)
			System.out.println(number + " is divisible by 2 or 3.");
		if (number % 2 == 0 ^ number % 3 == 0)
			System.out.println(number + " is divisible by 2 or 3, but not both.");



	}

}
