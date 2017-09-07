import java.util.Scanner;

public class FairenheitToCelsius {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// get temp from user
		System.out.print("enter a temp in Fairenheit: ");
		double farenheit = input.nextDouble();
		
		// convert to celsius
		double celsius = (5.0 / 9) * (farenheit - 32);
		System.out.println("farenheit " + farenheit + " is " + celsius + " in clesius");
	}
}
