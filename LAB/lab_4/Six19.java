import java.util.Scanner;

public class Six19 {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter 3 sides of a triangle: ");
    double s1 = input.nextDouble();
    double s2 = input.nextDouble();
    double s3 = input.nextDouble();

    if (MyTriangle.isValid(s1, s2, s3)) {
        System.out.println("This is a triangle! area = " + MyTriangle.area(s1, s2, s3));
    } else {
        System.out.println("Sorry, you entered an invalid triangle...");
    }
}


}