package PassByVaReferDemo;

public class passbyvalDemo {

	static void add(int x) {
		System.out.println(x + x);
	}

	public static void main(String[] args) {

		int y = 10;
		add(y);
	}

}
