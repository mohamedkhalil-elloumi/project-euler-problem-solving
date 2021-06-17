package smalletmultiple;

public class SmallestMultiple {

	public static void main(String[] args) {
		// To solve this problem it's very simple
		// we need to calculate the LCM for the numbers between 1 and 20
		long a = 1;
		long b = 2;
		while (b <= 20) {
			a = lcm(a, b);
			b++;
		}
		System.out.println("a " + a);
	}

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return ((a * b) / gcd(a, b));
	}

}
