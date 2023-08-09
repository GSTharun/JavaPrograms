package TypeCastingDemo;

public class WideningDemo {

	public static void main(String[] args) {

		double x = 30;
		System.out.println(x);

		float y = 40;
		System.out.println(y);
		// Implicity
		double z = 37.5f;
		System.out.println(z);
		System.out.println("***************************************");
		double a = (double) 30;
		System.out.println(a);

		float b = (float) 40;
		System.out.println(b);

		double c = (double) 37.7f;
		System.out.println(c);
	}

}

