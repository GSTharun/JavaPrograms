package InheriDemo;

class Sample{
	
	int x=20;
}
class Demo extends Sample{
	void cost() {
		System.out.println("25000");
	}
}
class Tester extends Demo{
	int y=30;
}
public class MultileDemi {
	
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		System.out.println(tester.x);
		tester.cost();
		System.out.println(tester.y);
	}
}
