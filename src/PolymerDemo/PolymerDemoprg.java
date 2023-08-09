package PolymerDemo;

//run time polymerphism 
class Animal {
	void noise() {
		System.out.println("Some noise");
	}
}

class Dog extends Animal {
	public void noise() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	public void noise() {
		System.out.println("Meow Meow");
	}
}

class Snake extends Animal {
	public void noise() {
		System.out.println("Hiss Kiss");
	}
}

class Support {
	static void ansim(Animal a) {
		a.noise();
	}
}

public class PolymerDemoprg {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Snake s1 = new Snake();
		Support.ansim(d1);
		Support.ansim(c1);
		Support.ansim(s1);

	}

}
