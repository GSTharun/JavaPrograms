package InheriDemo;

class Sample1 {

	String a = "Hello mava";
}

class Demo1 extends Sample1 {
	void test() {
		System.out.println("Test is done");
	}
}

class Tester1 extends Sample1 {
	void story() {
		System.out.println("Case is done in police station for dinga nd dingi");
	}
}

public class HierachialDemo {

	public static void main(String[] args) {

		Tester1 tester1 = new Tester1();
		Demo1 demo1 = new Demo1();

		System.out.println(tester1.a);
		tester1.story();

		System.out.println("-----------------------------------");

		System.out.println(demo1.a);
		demo1.test();

	}

}
