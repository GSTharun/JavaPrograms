package MethodOverloadDemo;

class WhatsappVersion {

	void send(int number) {
		System.out.println("Sending nos " + number);
	}

	void send(String txtmsge) {

		System.out.println("Sending text " + txtmsge);
		
	}

	void send(int number, String txtmsge) {
		System.out.println("Sending both txt nd number " + number + txtmsge);
	}

	void send(String txtmsge, int number) {
		System.out.println("Sending both txt nd number " + txtmsge + number);
	}

}

public class Whatsapp {
	public static void main(String[] args) {

		WhatsappVersion version = new WhatsappVersion();
		version.send(123);
		version.send("Hello");
		version.send(1212, "Hello");
		version.send("Hello", 123);

	}
}
