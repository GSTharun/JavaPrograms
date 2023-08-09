package ExceptionHandlingDemo;

public class CheckedException {

	public static void main(String[] args) {

		try {
			submit();
		} catch (LifeException e) {

			System.out.println(e.getMessage());
		}
	}

	static void submit() throws LifeException {

		int age = 45;
		if (age >= 50) {
			System.out.println("Happy Life");
		} else {

			throw new LifeException("life validity is  done");
		}
	}
}

class LifeException extends Exception {

	String msg;

	LifeException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}
