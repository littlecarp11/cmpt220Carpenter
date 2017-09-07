import java.util.Scanner;

public class DisplayTime {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the use for input
		System.out.print("enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		double minutes = seconds / 60; // find minutes into seconds
		int remainingSeconds = seconds % 60; // seconds remaining
		System.out.println(seconds + " seconds is " + minutes + " minutes and "
				+ remainingSeconds + " seconds");
	}
}
