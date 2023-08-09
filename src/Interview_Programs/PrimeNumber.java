package Interview_Programs;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int j = 2; j < 100; j++) {
			boolean flag = true;

			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					flag = false;
					break;
				}

			}

			if (flag == true) {
				System.out.println("Its a prime no " + j);
			} else {
				System.out.println("Not a prime a no " + j);
			}

		}
	}
}
