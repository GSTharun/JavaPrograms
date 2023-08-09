package PassByVaReferDemo;

public class PassByRefDemo {

	int a = 90;

	static void disp(PassByRefDemo p1) {
		System.out.println(p1.a);
	}

	public static void main(String[] args) {

		PassByRefDemo demo = new PassByRefDemo();

		System.out.println(demo.a);
		disp(demo);

	}

}
