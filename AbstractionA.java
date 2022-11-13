
abstract class AbstractionA {
	abstract void draw();
}

class Rectangle extends AbstractionA {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends AbstractionA {
	void draw() {
		System.out.println("drawing circle");
	}
}

class TestAbstraction1 {
	public static void main(String args[]) {
		AbstractionA s = new Circle1();
		s.draw();
	}
}