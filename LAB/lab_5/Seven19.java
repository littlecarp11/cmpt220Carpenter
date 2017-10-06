import java.util.Scanner;

public class Seven19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int listLength = input.nextInt();
        int[] number = new int[listLength];

      

        if (isSorted(number)) {
            System.out.println("The list is sorted!");
        } else {
            System.out.println("The list is NOT sorted!");
        }

    }

    public static boolean isSorted(int[]  list) {

        for(int i = 0; i < list.length; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

}