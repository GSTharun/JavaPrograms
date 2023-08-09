package MethodOverloadDemo;

class prg {

	int x=10;
	void m()
	{
		System.out.println("ttx");
	}
	
	void n()
	{
		System.out.println("msge");
		this.m();
	}
}

public class prg3{
	public static void main(String[] args) {
		
		prg prg = new prg();
		prg.n();
	}
}

