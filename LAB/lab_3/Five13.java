
public class Five13 {

	public static void main(String[] args) {
		int n = 0;

        while (Math.pow(n, 3) < 12000) {
            n++;
        }
        n--;
        System.out.println(n + " is the largest integer n, such that n^3 is less than 12,000");
        System.out.println("Proof: " + (n - 1) + "^3 = " + Math.pow(n - 1, 3));
        System.out.println("Proof: " + n + "^3 = " + Math.pow(n, 3));
        System.out.println("Proof: " + (n + 1) + "^3 = " + Math.pow(n + 1, 3));


    }
}
