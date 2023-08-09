package InheriDemo;

class A {

	int x = 10;
}

class B extends A {
	void text() {
		System.out.println("Hello Java");
	}
}

public class SingleLvlDemo {

	public static void main(String[] args) {

		B b = new B();
		b.text();
		System.out.println(b.x);

	}

}
