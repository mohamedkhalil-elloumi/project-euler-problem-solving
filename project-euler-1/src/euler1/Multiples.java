package euler1;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		for (int i = 1; i<1000; i++) {
			if(i%5 ==0 || i%3 ==0 || i%15 ==0) {
				res += i;
			}
			System.out.println(res);	
		}
		System.out.println(res);
		

	}

}
