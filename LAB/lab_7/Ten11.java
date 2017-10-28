
public class Ten11 {

	public static void main(String[] args) {
		// Create a Circle2D object
		Ten11 c1 = new Ten11(2, 2, 5.5);

				// Display results
				System.out.println("Circle1 area: " + c1.getArea()); 
				System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
				System.out.println(
					"Does circle1 contain the point (3, 3)? " + c1.contains(3, 3)); 
				System.out.println(
					"Does circle1 contain the circle centered at (4, 5) and radius 10.5? " 
					+ c1.contains(new Ten11(4, 5, 10.5)));
				System.out.println(
					"Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " 
					+ c1.overlaps(new Ten11(3, 5, 2.3)));
			}

	private String contains(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getPerimeter() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getArea() {
		// TODO Auto-generated method stub
		return null;
	}
		}
