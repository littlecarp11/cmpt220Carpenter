
public class thirteen11 {

	public thirteen11(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		thirteen11 thirteen111 = new thirteen11(5);

		
		System.out.println("\nthirteen11:\nArea: " + thirteen111.getArea() + 
			"\nPerimeter: " + thirteen111.getPerimeter());

		
		System.out.println("Cloning thirteen11...");
		thirteen11 thirteen112 = (thirteen11)thirteen111.clone();

		
		int result = (thirteen111.compareTo(thirteen112));
		if (result == 1)
			System.out.println("thirteen11 is greather than its clone.");
		else if (result == -1)
			System.out.println("thirteen11 is less than its clone."); 
		else
			System.out.println("thirteen11 is equal to its clone.");
	}

	private String getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getPerimeter() {
		// TODO Auto-generated method stub
		return null;
	}

	private int compareTo(thirteen11 thirteen112) {
		// TODO Auto-generated method stub
		return 0;
	}
}


