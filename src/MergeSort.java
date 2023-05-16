//Java program to do Merge Sort of list of Strings

package demo;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        // Creating an unsorted array of strings
        String[] arr = {"banana", "apple", "orange", "grape", "pineapple"};

        // Calling the mergeSort method to sort the array
        mergeSort(arr, 0, arr.length-1);

        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Recursive function to perform merge sort on the input array
    public static void mergeSort(String[] arr, int lo, int hi) {
        // Base case: if the subarray has less than 2 elements, it is already sorted
        if (lo < hi) {
            // Computing the midpoint of the subarray
            int mid = lo + (hi - lo) / 2;

            // Recursively sorting the left half of the subarray
            mergeSort(arr, lo, mid);

            // Recursively sorting the right half of the subarray
            mergeSort(arr, mid+1, hi);

            // Merging the two sorted halves of the subarray
            merge(arr, lo, mid, hi);
        }
    }

    // Merge function to combine two sorted subarrays into a single sorted subarray
    public static void merge(String[] arr, int lo, int mid, int hi) {
        // Creating a temporary array to hold the values of the subarray being merged
        String[] tempArr = new String[arr.length];

        // Copying the values of the subarray being merged into the temporary array
        for (int i = lo; i <= hi; i++) {
            tempArr[i] = arr[i];
        }

        // Initializing variables to track the current indices of the left and right halves of the subarray
        int i = lo;
        int j = mid+1;

        // Initializing a variable to track the current index of the output array
        int k = lo;

        // Iterating through the left and right halves of the subarray, comparing the elements and placing them in the output array in sorted order
        while (i <= mid && j <= hi) {
            if (tempArr[i].compareTo(tempArr[j]) <= 0) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }

        // Copying any remaining elements in the left half of the subarray into the output array
        while (i <= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }

        // Copying any remaining elements in the right half of the subarray into the output array
        while (j <= hi) {
            arr[k] = tempArr[j];
            j++;
            k++;
        }
    }
}
