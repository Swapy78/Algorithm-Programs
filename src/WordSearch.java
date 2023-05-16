//Java program to read in a list of words from file

package demo;

import java.util.Arrays;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
    	// Path to the file containing the word list
        String filePath = "abc.txt"; 

        String[] wordList = readWordListFromFile(filePath);

        if (wordList != null && wordList.length > 0) {
        	// Sorting the word list in alphabetical order
            Arrays.sort(wordList); 

            String searchWord = getUserInput("Enter a word to search: ");

            boolean wordFound = binarySearch(wordList, searchWord);

            if (wordFound) {
                System.out.println("The word is found in the list.");
            } else {
                System.out.println("The word is not found in the list.");
            }
        } else {
            System.out.println("The word list is empty or the file was not found.");
        }
    }

    public static String[] readWordListFromFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(WordSearch.class.getResourceAsStream(filePath))) {
            while (scanner.hasNextLine()) {
                contentBuilder.append(scanner.nextLine());
            }
        }

        String content = contentBuilder.toString();

        if (!content.isEmpty()) {
            return content.split(",");
        }
     // Returning an empty array if the file is empty or cannot be read
        return new String[0]; 
    }

    public static boolean binarySearch(String[] wordList, String searchWord) {
        int left = 0;
        int right = wordList.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (wordList[mid].equals(searchWord)) {
                return true; // Found the word
            } else if (wordList[mid].compareTo(searchWord) < 0) {
                left = mid + 1; // Searching in the right half
            } else {
                right = mid - 1; // Searching in the left half
            }
        }

        return false; // Word not found
    }

    public static String getUserInput(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
