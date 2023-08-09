package PassByVaReferDemo;

class Amazon {
	void product() {
		System.out.println("Some product");
	}
}

class Customer1 {
	static void needpro(Amazon a1) {
		a1.product();
	}
}

class Customer2 {
	static void needpro(Amazon a2) {
		a2.product();
	}
}

public class Ekart {

	public static void main(String[] args) {

		Amazon amazon = new Amazon();
		Customer1.needpro(amazon);
		Customer2.needpro(amazon);
	}
}
