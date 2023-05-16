//Java program to find your number

package demo;

import java.util.Scanner;

public class FindYourNumber {

    public static void main(String[] args) {
        // Creating a scanner object to read user input from console
        Scanner sc = new Scanner(System.in);
        
        // Telling the user to enter a value of N
        System.out.print("Enter the value of N: ");
        
        // Reading the value of N entered by the user
        int n = sc.nextInt();
        
        // Initializing the values of low, high and mid for binary search
        int low = 0;
        int high = n - 1;
        int mid;
        
        // Initializing a count variable to keep track of number of tries
        int count = 0;

        // Telling the user to think of a number between 0 and N-1
        System.out.println("Think of a number between 0 and " + (n - 1));

        // Binary Search to guess the number
        while (low <= high) {
            // Calculating the midpoint of the range [low, high]
            mid = (low + high) / 2;
            
            // Incrementing the count of tries
            count++;
            
            // Telling the user to indicate whether the number is between low and mid
            System.out.println("Is your number between " + low + " and " + mid + "? (y/n)");
            
            // Reading the user's response
            String response = sc.next();

            // Updating the value of high or low based on the user's response
            if (response.equalsIgnoreCase("y")) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Printing the guessed number and the number of tries taken to guess it
        System.out.println("Your number is " + low);
        System.out.println("Guessed in " + count + " tries");
    }
}
