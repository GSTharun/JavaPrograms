package MethodDemo;
//method with return type
public class MetreturnDemo {
	
	static int add() {
		int a=6;
		int b=10;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		int result=add();
		
		
		System.out.println(result);
	}
}
