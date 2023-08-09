package ConsDemo;

public class thisConsDemo {

	int eid;
	String ename;
	double esalary;

	thisConsDemo(int eid, String ename, double esalary) {

		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public static void main(String[] args) {

		thisConsDemo consDemo = new thisConsDemo(101, "Dinga", 50000);
		System.out.println(consDemo.eid);
		System.out.println(consDemo.ename);
		System.out.println(consDemo.esalary);
	}

}
