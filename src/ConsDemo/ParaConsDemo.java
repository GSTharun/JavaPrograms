package ConsDemo;

class ParaDemo {
	int sid;
	String sname;
	double sfees;

	private ParaDemo(int a, String b, double c) {
		sid = a;
		sname = b;
		sfees = c;
	}

	public static ParaDemo getA() {
		ParaDemo demo = new ParaDemo(123, "Tharun", 80000);
		return demo;
	}

	public void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sfees);
	}
}

public class ParaConsDemo {
	public static void main(String[] args) {

		ParaDemo paraDemo = ParaDemo.getA();

		paraDemo.display();

	}

}