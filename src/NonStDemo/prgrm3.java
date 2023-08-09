package NonStDemo;

public class prgrm3 {

	void areaofTri() {
		double a = 0.5;
		int b = 10;
		int h = 5;

		double result = a * b * h;

		System.out.println(result);
	}

	void areaofSq() {
		int s = 10;

		int result = s * s;

		System.out.println(result);
	}

	public static void main(String[] args) {

		prgrm3 maths = new prgrm3();

		maths.areaofSq();
		maths.areaofTri();

	}

}
