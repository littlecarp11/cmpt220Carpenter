
public class Question14 {

	public static void main(String[] args) {
		// Make a table 
		// Calling the method
		prac(3);		
	}
	
	public static void prac(int a){ // JA: If you put everything inside a method, you have to call it
		System.out.printf("%5s" , "a^2"); 

		System.out.printf("%5s" , "a^2"); 

		System.out.printf("%5s" , "a^3"); 

		System.out.println();
		for(int i = 1; i <= a; i++){

			System.out.printf("%5d", i); 

			System.out.printf("%5d",i*i);

			System.out.printf("%5d",i*i*i);

			System.out.println();
		}
	}
		

}