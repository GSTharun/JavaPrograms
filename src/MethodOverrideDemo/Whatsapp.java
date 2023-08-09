package MethodOverrideDemo;

class WhatsappV1 {

	void status() {
		System.out.println("status was in txt");

	}
}

class WhatsappV2 extends WhatsappV1 {
	void status() {
		System.out.println("status was in form of image,vedios");

	}
}

public class Whatsapp {

	public static void main(String[] args) {

		WhatsappV2 v2 = new WhatsappV2();
		v2.status();

	}

}
