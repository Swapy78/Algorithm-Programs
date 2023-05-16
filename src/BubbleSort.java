//Java program to print sorted list of integers using Bubble Sort

package demo;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // asking user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        // creating an integer array of length n
        int[] arr = new int[n];

        // asking user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // performing bubble sort on the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // printing the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
