package largestPalindrome;

public class LargestPalindrome {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 0;
		long product = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 0; j <= 999; j++) {
				product = i * j;
				if (isPalindrome(product) && product >= result) {
					result = product;
				}
			}

		}
		System.out.println("result " + result);

	}

	public static boolean isPalindrome(long x) {
		long reversed = 0, r;
		long temp = x;
		while (x > 0) {
			r = x % 10;
			reversed = (reversed * 10) + r;
			x = x / 10;
		}
		if (reversed == temp)
			return true;
		else
			return false;
	}

}
