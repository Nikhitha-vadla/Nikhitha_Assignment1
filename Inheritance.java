
public class Inheritance {

	// field and method of the parent class
	String name;

	public void cat() {
		System.out.println("I am cat");
	}
}

// inherit from Animal
class Inheritance2 extends Inheritance {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}

	public static void main(String[] args) {

		// create an object of the subclass
		Inheritance2 In = new Inheritance2();

		// access field of superclass
		In.name = "Rohu";
		In.display();

		// call method of superclass
		// using object of subclass
		In.cat();

	}

}
