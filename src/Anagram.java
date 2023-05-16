//Java program to check if two strings are anagram or not

package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        // Taking two strings as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        // Converting both strings to lowercase and remove spaces
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        // Sorting the characters in both strings
        char[] str1_sorted = str1.toCharArray();
        char[] str2_sorted = str2.toCharArray();
        Arrays.sort(str1_sorted);
        Arrays.sort(str2_sorted);

        // Comparing the sorted strings to see if they are equal
        if (Arrays.equals(str1_sorted, str2_sorted)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }
}
