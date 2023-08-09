package DemoOnVariable;

public interface LocalVarDemo {

	static final double area = 0.5;
	static int base = 5;
	static int heigth = 10;

	static double result = area * base * heigth;

	public static void main(String[] args) {

		System.out.println(result);

	}

}
