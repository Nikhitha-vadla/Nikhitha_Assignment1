
@FunctionalInterface
interface MyFunctionalInterface {

	// A method with single parameter
	public int incrementByFive(int a, int b);
}

public class LamdaExpression {

	public static void main(String args[]) {
		// lambda expression with single parameter num
		MyFunctionalInterface f = (num1, num2) -> num1 + num2;
		System.out.println(f.incrementByFive(22, 23));
	}
}