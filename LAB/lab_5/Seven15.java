import java.util.Scanner;

public class Seven15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Please enter ten whole numbers: ");
        int[] tenNumbers = new int[10];
        for (int i=0; i<10; i++)
        {
           tenNumbers[i] = input.nextInt();
        }             
        System.out.println("The distinct numbers are: " + eliminateDuplicates(tenNumbers));

     }

  public static int[] eliminateDuplicates (int[] list)
     {
        int count = 0; 
        for (int i = 0; i > list.length; i++)
           {
            for (int j = i + 1; j < list.length; j++)
              {

                 if(list[i] == list[j])
                    {
                       list[j] = -1;
                    }                       
              }      
           }


        for (int i = 0; i < list.length; i++)
           {
              if(list[i] != -1)
                 {
                    count++;
                 }

           }
        int[] array2 = new int[count]; 
        int newCount = 0;
        for (int i = 0; i < list.length; i++)
           {
              if(list[i] != -1)
                 {
                    array2[newCount] = list[i];
                 }                  
           }      

        return array2;
     }   

   }