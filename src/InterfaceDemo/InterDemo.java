package InterfaceDemo;

 interface Tester {

	 abstract void disp();
	 abstract void test();
}

interface Sample extends Tester {

	public default void disp() 
	{
		System.out.println("Hello");
	}

	public void test();
}
class Demo implements Sample
{
	public void test()
	{
		System.out.println("TATA");
	}
}

class InterDemo {

	public static void main(String[] args) {
		Demo s1 = new Demo();
		s1.disp();
		s1.test();
	}
}