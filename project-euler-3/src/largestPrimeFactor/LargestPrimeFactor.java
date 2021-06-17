package largestPrimeFactor;

import java.lang.Math;
import java.util.*;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long input = 600851475143L;
		List<Long> primeFactors = new ArrayList<Long>();
		for (long i = 2; i < Math.sqrt(input); i++) {
			if (input % i == 0) {
				if (isPrime(i)) {
					primeFactors.add(i);
				}
			}
		}
		System.out.println(primeFactors);

	}

	public static boolean isPrime(long number) {
		for (long i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}
