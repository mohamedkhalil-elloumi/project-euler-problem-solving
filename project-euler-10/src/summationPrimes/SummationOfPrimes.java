package summationPrimes;

import java.util.ArrayList;

public class SummationOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing the max value
		int MAX_SIZE = 2_000_000;
		long count = 0;
		// To store all prime numbers
		ArrayList<Integer> primes = new ArrayList<Integer>();

		boolean isPrime[] = new boolean[MAX_SIZE];

		/*
		 * Create a boolean array "IsPrime[0..MAX_SIZE]" and initialize all entries it
		 * as true. A value in IsPrime[i] will finally be false if i is Not a IsPrime,
		 * else true.
		 */
		for (int i = 0; i < MAX_SIZE; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i < MAX_SIZE; i++) {
			/*
			 * If IsPrime[p] is not changed, then it is a prime
			 */
			if (isPrime[i] == true) {
				/*
				 * Update all multiples of p greater than or equal to the square of it numbers
				 * which are multiple of p and are less than p^2 are already been marked.
				 */
				for (int j = i * i; j < MAX_SIZE; j += i) {
					isPrime[j] = false;
				}
			}
		}
		// Store all prime numbers
		for (int i = 2; i < MAX_SIZE; i++) {
			if (isPrime[i] == true) {
				primes.add(i);
			}
		}
		//loop through the primes and count them to find the sum
		for (int i = 0; i < primes.size(); i++) {
			count += primes.get(i);
		}
		System.out.println(count);
	}

}
