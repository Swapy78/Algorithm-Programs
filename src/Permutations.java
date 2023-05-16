//Java program to return all permutations of a String using iterative method and Recursion method.

package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        // Input string
        String str = "abc";
        
        // Generating permutations using iterative method
        String[] permutationsIterative = generatePermutationsIterative(str);
        System.out.println("Permutations using iterative method: ");
        System.out.println(Arrays.toString(permutationsIterative));
        
        // Generating permutations using recursive method
        List<String> permutationsRecursive = generatePermutationsRecursive(str);
        System.out.println("Permutations using recursive method: ");
        System.out.println(permutationsRecursive);
        
        // Checking if the arrays returned by the two methods are equal
        boolean arraysEqual = compareArrays(permutationsIterative, permutationsRecursive.toArray(new String[0]));
        System.out.println("Are the arrays equal? " + arraysEqual);
    }
    
    public static String[] generatePermutationsIterative(String str) {
        // List to store permutations
        List<String> permutations = new ArrayList<>();
        // Adding an empty string as the initial permutation
        permutations.add("");
        
        // Iterating through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Getting the current character
            char currentChar = str.charAt(i);
            // Creating a new list to store updated permutations
            List<String> newPermutations = new ArrayList<>();
            
            // Iterating through each existing permutation
            for (String permutation : permutations) {
// Inserting the current character at every possible position in the permutation
                for (int j = 0; j <= permutation.length(); j++) {
// Creating a new permutation by inserting the current character
                    String newPermutation = permutation.substring(0, j) + currentChar + permutation.substring(j);
// Adding the new permutation to the updated list
                    newPermutations.add(newPermutation);
                }
            }
            
            // Updating the permutations list with the new permutations
            permutations = newPermutations;
        }
        
        // Converting the list of permutations to an array and return
        return permutations.toArray(new String[0]);
    }
    
    public static List<String> generatePermutationsRecursive(String str) {
        // List to store permutations
        List<String> permutations = new ArrayList<>();
        // Calling the recursive helper function to generate permutations
        generatePermutationsRecursiveHelper(str, "", permutations);
        // Returning the list of permutations
        return permutations;
    }
    
    private static void generatePermutationsRecursiveHelper(String str, String prefix, List<String> permutations) {
// Base case: If the string is empty, adding the current prefix as a permutation
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            // Iterating through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Getting the current character
                char currentChar = str.charAt(i);
                // Creating a new string with the current character removed
                String remaining = str.substring(0, i) + str.substring(i + 1);
                // Recursively generating permutations with the updated string and updated prefix
                generatePermutationsRecursiveHelper(remaining, prefix + currentChar, permutations);
            }
        }
    }
    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        // Comparing the two arrays for equality using Arrays.equals
        return Arrays.equals(arr1, arr2);
    }
}
