import java.util.Scanner;

public class AreaNdCircumferenceTrngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base:");
		int base = sc.nextInt();

		System.out.println("enter hight:");
		int height = sc.nextInt();

		System.out.println("Enter Hypotenuse:");
		int hypotenuse = sc.nextInt();

		int TriangleArea = (int) (0.5 * base * height);
		System.out.println(" Area of Trianle:" + TriangleArea);

		int TriangleCircumference = (int) (base + height + hypotenuse);
		System.out.println("Circumference of Trianle:" + TriangleCircumference);

	}

}
