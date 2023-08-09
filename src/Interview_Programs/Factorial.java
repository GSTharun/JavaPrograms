package Interview_Programs;

public class Factorial {

	public static void main(String[] args) {

		int n = 5, fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;// 1*i=1 2=1*2 6=2*3 24=6*4 120=24*5

			System.out.println(fact);
		}

	}

}
