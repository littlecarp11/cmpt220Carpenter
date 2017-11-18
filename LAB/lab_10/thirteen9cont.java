
public class thirteen9cont implements Comparable<thirteen9cont> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    private String color = "white";
	    private boolean filled;
	    private java.util.Date dateCreated;
	    private double area;
	    private double perimeter;
	    

	    /** Construct a default geometric object */
	    protected thirteen9cont() {
	        dateCreated = new java.util.Date();
	    }

	    /** Construct a geometric object with color and filled value */
	    protected thirteen9cont(String color, boolean filled) {
	        dateCreated = new java.util.Date();
	        this.color = color;
	        this.filled = filled;
	    }

	    /** Return color */
	    public String getColor() {
	        return color;
	    }

	    /** Set a new color */
	    public void setColor(String color) {
	        this.color = color;
	    }

	    /** Return filled. Since filled is boolean,
	     *  the get method is named isFilled */
	    public boolean isFilled() {
	        return filled;
	    }

	    /** Set a new filled */
	    public void setFilled(boolean filled) {
	        this.filled = filled;
	    }

	    /** Get dateCreated */
	    public java.util.Date getDateCreated() {
	        return dateCreated;
	    }

	    /** Return a string representation of this object */
	    @Override
	    public String toString() {
	        return "created on " + dateCreated + "\ncolor: " + color +
	                " and filled: " + filled;
	    }

	    @Override
	    public int compareTo(thirteen9cont o) {
	        if (getArea() > o.getArea())
	            return 1;
	        else if (getArea() < o.getArea())
	            return -1;
	        else
	            return 0;
	    }

	    public static thirteen9cont max(thirteen9cont o1, thirteen9cont o2) {
	        return (o1.compareTo(o2) >= 0) ? o1 : o2;
	    }

	    public static double sumArea(thirteen9cont[] a) {
	        double sum = 0;
	        for (thirteen9cont o : a) {
	            sum += o.getArea();
	        }
	        return sum;
	    }
	    /** Abstract method getArea */
	    public double getArea() {
	    	return area;
	    	
	    }

	    /** Abstract method getPerimeter */
	    public double getPerimeter() {
	    	return perimeter;
	}

}
