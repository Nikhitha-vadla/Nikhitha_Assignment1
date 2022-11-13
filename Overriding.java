
public class Overriding {

	public void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	public void sub(int a, int b) {
		System.out.println("long arg method invoked");
	}

	public void mul(int a, int b) {
		System.out.println("double arg method invoked");
	}

	public static void main(String args[]) {

		Overriding obj = new Overriding();

		obj.sub(20, 20);
	}
}
