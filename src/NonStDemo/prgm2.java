package NonStDemo;

public class prgm2 {
	
	String b="Hello Nikhil";
	
	int display(int a,int b)
	{
		int c=a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(new prgm2().b);
//		
//		int result=new prgm2().display(10,100);
//		
//		System.out.println(result);
		
		prgm2 pg = new prgm2();
		System.out.println(pg.display(50, 50));
		System.out.println(pg.b);
		
	}

}
