package AbstractionDemo;

interface Animal {
	void noise();
}

class Dog implements Animal {
	public void noise() {
		System.out.println("Bow Bow");
	}
}

class Cat implements Animal {
	public void noise() {
		System.out.println("Meow Meow");
	}
}

class Snake implements Animal {
	public void noise() {
		System.out.println("Hiss Kiss");
	}
}

class Support {
	static void ansim(Animal a) {
		a.noise();
	}
}

public class AbstractionDemoprg {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();
		Support.ansim(d1);
		Support.ansim(c1);
		Support.ansim(s1);

	}

}
