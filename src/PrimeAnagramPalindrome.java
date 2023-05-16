//Java program to find the prime numbers that are Anagram and Palindrome

package demo;

import java.util.Arrays;

public class PrimeAnagramPalindrome {
    
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Function to check if two numbers are anagrams
    public static boolean isAnagram(int num1, int num2) {
        char[] charArray1 = Integer.toString(num1).toCharArray();
        char[] charArray2 = Integer.toString(num2).toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        // Defining range of numbers
        int rangeStart = 0;
        int rangeEnd = 1000;
        
        // Looping through all numbers in range and check if they are prime, anagram, and/or palindrome
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                for (int j = i + 1; j <= rangeEnd; j++) {
                    if (isPrime(j) && isAnagram(i, j)) {
                        System.out.print(j + " ");
                    }
                }
                if (isPalindrome(i)) {
                    System.out.print("(palindrome)");
                }
                System.out.println();
            }
        }
    }
}
