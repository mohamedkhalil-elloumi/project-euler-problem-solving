package fibonnaci;

public class EvenFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u0 = 0;
		int u1 = 1;
		int limit = 4_000_000;
		int even_sum = 0;
		boolean exceed = false;

		while (!exceed) {
			int u2 = u0 + u1;
			u0 = u1;
			u1 = u2;
			if (u2 > limit) {
				exceed = true;
				break;
			}
			if (u2 % 2 == 0) {
				even_sum += u2;
			}

		}
		System.out.println(even_sum);

	}

}
