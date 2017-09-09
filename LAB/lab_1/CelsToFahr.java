import java.util.Scanner;

public class CelsToFahr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get temp from user
		System.out.print("enter a temp in Celsius: ");
		double celsius = input.nextDouble();
		
		// convert to celsius
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println("celsius " + celsius + " is " + fahrenheit + " in fahrenheit");
	}
}
