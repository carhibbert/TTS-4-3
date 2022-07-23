import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class loopExercise {
    
    public static void main(String[] args){

        //Create a scanner object
        Scanner nums = new Scanner(System.in);

        //Create an empty array 
        ArrayList<Integer> fiveNumbers=new ArrayList<Integer>();

        System.out.println("Please enter 5 numbers:");
        int sumArray = 0;
        int productArray = 1;
        int largestNum = 0;
        int smallestNum = 0;
        //Populate array with user-inputted numbers (5)
        for (int i = 0; i<5; i++) {
            // Convert input to an integer from string
                fiveNumbers.add(i);
                int num = Integer.parseInt(nums.nextLine());
                fiveNumbers.set(i,num);
            // get the sum and product of the array values
                sumArray += num;
                productArray *= num;
            }

        Collections.sort(fiveNumbers);
        largestNum = fiveNumbers.get(4);
        smallestNum = fiveNumbers.get(0);

        System.out.println(fiveNumbers);
        System.out.println("Array sum: " + sumArray);
        System.out.println("Array product: " + productArray);
        System.out.println("The largest number entered is " + largestNum);
        System.out.println("The smallest number entered is " + smallestNum);
        
        
    }
}
