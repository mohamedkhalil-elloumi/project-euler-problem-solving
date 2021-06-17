package sumSquareDifference;

public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;

		/*
		 * The sum of squares formula is as follows: (n * (n + 1) * (2 * n + 1)) / 6 you
		 * may find the demonstration here
		 * https://www.geeksforgeeks.org/java-program-for-sum-of-squares-of-first-n-natural-numbers/
		 */
		// Therefore
		int sumSquare = 0;
		int result = 0;
		sumSquare = (n * (n + 1) * (2 * n + 1)) / 6;

		/*
		 * we know that in an Arithmetic Progression whose first term = 1, last term = n
		 * //and number of terms = n. The sum is (n * (n + 1)) / 2
		 */
		// Therefore
		int sum = (n * (n + 1)) / 2;
		// then we make it power 2
		int squareSum = (int) Math.pow(sum, 2);

		result = squareSum - sumSquare;
		System.out.println(result);
	}

}
