package AbstractDemo;

abstract class Tester {

	abstract void disp();

	abstract void cool();

}

class Demo extends Tester {

	void disp() {
		System.out.println("hello");
	}

	void cool() {
		System.out.println("TATA");
	}
}

public class AbDemo {

	public static void main(String[] args) {
		Demo d2 = new Demo();
		d2.disp();
		d2.cool();
	}

}
