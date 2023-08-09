package InheriDemo;

class Dinga {
	float c = 55.8f; // Super class
}

class Dingi extends Dinga {
	void ride() {
		System.out.println("Hello Dinga can we go for a Ride Wonder la"); // Sub class for sub of Dinga Single Level
																			// Inter
	}
	
	
}

class Penga extends Dingi {
	int a = 55; // sub class of dingi multi level
}
class Pengi extends Dinga {
	void cook() {
		System.out.println("Im cooking ");
	}
}
public class HybridDemo {

	public static void main(String[] args) {

		System.out.println("Single Level");

		Dingi di = new Dingi();
		System.out.println(di.c);
		di.ride();

		System.out.println("-------------------");

		System.out.println("Multi Level");

		Penga penga = new Penga();
		System.out.println(penga.a);
		penga.ride();
		System.out.println(penga.c);

		System.out.println("-------------------------");

		System.out.println("Hiercrechal ");

		Pengi pengi = new Pengi();

		System.out.println(pengi.c);
		pengi.cook();

		System.out.println(di.c);
		di.ride();
		
		

	}
}
