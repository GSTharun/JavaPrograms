package MethodOverloadDemo;

class Zomato {
	static void order(int qty) {
		System.out.println("Order by qty " + qty);
	}

	static void order(String foodtype) {
		System.out.println("Order by foodtype " + foodtype);
	}

	static void order(double price) {
		System.out.println("Order by price " + price);
	}

	static void order(String foodtype, int qty, double price) {
		System.out.println("Order by foodtype " + foodtype + qty + price);
	}
}

public class Whatsapp1 {
	
	public static void main(String[] args) {
		
		Zomato.order(5);
		Zomato.order("Pizza");
		Zomato.order(99.99);
		Zomato.order("Pizza", 6, 99.99);
		
	}

}
