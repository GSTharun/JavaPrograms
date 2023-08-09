package ExceptionHandlingDemo;

public class ExceHDemo {
	
	public static void main(String[] args) {
		
		System.out.println("***********Main Starts***********");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e ){
		System.out.println("Handled");
		}
		
		System.out.println("******Main Ends******************");
	}

}
