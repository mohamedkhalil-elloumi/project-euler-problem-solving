package specialPythagoreanTriplet;

public class SpecialPythagorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		for (a = 0; a < 1000; a++) {
			for (b = 0; b < 1000; b++) {
				for (c = 0; c < 1000; c++) {
					if (a < b && b < c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000) {
						System.out.println("a" + " " + a);
						System.out.println("b" + " " + b);
						System.out.println("c" + " " + c);
						System.out.println(a * b * c);
					}
				}
			}

		}
	}

}
