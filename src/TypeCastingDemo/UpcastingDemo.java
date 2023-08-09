package TypeCastingDemo;

class Demo
{
	int a = 25;
}
class Sample extends Demo
{
	void disp()
	{
		System.out.println("Hello");
	}
}
public class UpcastingDemo {
	
	public static void main(String[] args) {
		
	Demo d1 = new Sample();//upcasting
	System.out.println(d1.a);
	
	Sample s1 = (Sample) d1;//downcasting
	s1.disp();
	System.out.println(s1.a);
	
	}

}
