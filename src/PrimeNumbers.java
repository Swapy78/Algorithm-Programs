//Java program to find the Prime numbers in the range 0 to 1000

package demo;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Defining range of numbers
		int rangeStart = 0;
		int rangeEnd = 1000;

		// Looping through all numbers in range and checking if they are prime
		for (int i = rangeStart; i <= rangeEnd; i++) {
			boolean isPrime = true;
			// Checking if current number is divisible by any number other than 1 and itself
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// If the number is prime, printing it
			if (isPrime && i > 1) {
				System.out.println(i);
			}
		}
	}
}



