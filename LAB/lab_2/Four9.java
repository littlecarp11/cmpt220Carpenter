import java.util.Scanner;

public class Four9 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char character = input.next().charAt(0);
	        input.close();

	        System.out.println("The Unicode for the character " + character + " is " + (int) character);
	    }
	}
