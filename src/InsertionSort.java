//Java program to print the sorted list of words using insertion sort

package demo;

import java.util.Scanner;

public class InsertionSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading in list of strings
        System.out.print("Enter list of words (space separated): ");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        
        // Sorting the array using Insertion Sort
        int n = words.length;
        for (int i = 1; i < n; i++) {
            String key = words[i];
            int j = i - 1;
            while (j >= 0 && words[j].compareTo(key) > 0) {
                words[j+1] = words[j];
                j--;
            }
            words[j+1] = key;
        }
        
        // Printing the sorted array
        System.out.print("Sorted list of words: ");
        for (int i = 0; i < n; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
