package EncaplusationDemo;

class Demo {
	private int a = 20;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
public class EncapDemo {

	public static void main(String[] args) {

		Demo demo = new Demo();
		int result = demo.getA();
		System.out.println(result);

		demo.setA(200);
		int pp = demo.getA();
		System.out.println(pp);
	}
}
