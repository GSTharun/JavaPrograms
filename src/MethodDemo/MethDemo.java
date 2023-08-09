package MethodDemo;
//basic method
public class MethDemo {
	
	static int value=10;
	
	static void add()
	{
		int a =10;
		int b =20;
		
		int result = a+b;
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------------------");
		
		add();
		MethDemo.add();
		System.out.println(MethDemo.value);
		
		System.out.println("------------------------------------");
	}
}
