
public class thirteen9 {

	 public static void main(String[] args) {

	        Circle c1 = new Circle(10);
	        Circle c2 = new Circle(10);
	        MyRectangle2D r1 = new MyRectangle2D(0, 0, 5, 5);

	        System.out.println("c1 equals c2? " + c1.equals(c2));
	        System.out.println("c1 equals r1? " + c1.equals(r1));
	    }
	}

	class Circle extends GeometricObject {
	    private double radius;

	    public Circle() {
	    }

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public Circle(double radius,
	                  String color, boolean filled) {
	        this.radius = radius;
	        setColor(color);
	        setFilled(filled);
	    }

	    /** Return radius */
	    public double getRadius() {
	        return radius;
	    }

	    /** Set a new radius */
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    /** Return area */
	    public double getArea() {
	        return radius * radius * Math.PI;
	    }

	    /** Return diameter */
	    public double getDiameter() {
	        return 2 * radius;
	    }

	    /** Return perimeter */
	    public double getPerimeter() {
	        return 2 * radius * Math.PI;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        return obj instanceof Circle && radius == ((Circle) obj).radius;
	    }

	    /* Print the circle info */
	    public void printCircle() {
	        System.out.println("The circle is created " + getDateCreated() +
	                " and the radius is " + radius);
	    }
	}