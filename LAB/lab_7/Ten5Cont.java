import java.util.Scanner;

public class Ten5Cont {

	public static void main(String[] args) {
		 System.out.print("Enter a positive integer: ");
	        int num = new Scanner(System.in).nextInt();

	        Ten5 stack = new Ten5(20);

	        int factor = 2;
	        while (factor <= num) {
	            if (num % factor == 0) {
	                stack.push(factor);
	                num /= factor;
	            } else {
	                factor++;
	            }
	        }
	        while (!stack.empty()) {
	            System.out.print(stack.pop() + " ");
	        }


	    }
	}