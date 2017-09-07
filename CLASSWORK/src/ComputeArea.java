
public class ComputeArea {

	public static void main (String[] args) {
	
	Double radius; // Declare radius
	Double area; // Declare area
	Scanner input; // input variable

	System.out.print(“enter a double value for the radius: “);
	Input = new Scanner(System.in);
	Radius = input.nextDouble();

	// Assing a radius
	Radius = 20; // New value

	// Compute Area
	Area = 3.14159 * radius * radius;

	System.out.println(“The area for the circle of radius “ +
	Radius + “ is “ + area);
			
	}
}
