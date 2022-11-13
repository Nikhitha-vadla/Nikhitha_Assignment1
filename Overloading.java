class Overloading {
	public void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	public void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public void sum(double a, double b) {
		System.out.println("double arg method invoked");
	}

	public static void main(String args[]) {

		Overloading obj = new Overloading();

		obj.sum(20, 20);
	}
}
