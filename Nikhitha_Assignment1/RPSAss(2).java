2) import java.util.Scanner;

public class SumOf3DigitNum2 {

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter a First Number:");
		int a = num1.nextInt();

		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter a Second Number:");
		int b = num2.nextInt();

		Scanner num3 = new Scanner(System.in);
		System.out.println("Enter Second Number:");
		int c = num3.nextInt();

		int N = a + b + c;
		System.out.println("Sum of 3 digits number: " + N);
	}

}
