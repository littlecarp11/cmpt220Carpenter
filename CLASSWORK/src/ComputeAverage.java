import java.util.Scanner;

public class ComputeAverage {

	public static void main (String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt for 3 number
		System.out.print("enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// add the numbers and divide by 3
		double average = (number1 + number2 + number3) / 3;
		
		// output the result
		System.out.println("the average of " + number1 + " " + number2
				+ " " + number3 + " is " + average);
	}
}
