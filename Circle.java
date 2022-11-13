import java.util.Scanner;

class Circle {

	public static void main(String[] args) {
		Scanner C = new Scanner(System.in);
		System.out.println("Enter Base:");
		int Length = C.nextInt();

		System.out.println("Enter Base:");
		int Width = C.nextInt();

		int AreaOfRectangle = (int) (Length * Width);
		System.out.println("Area of Circle:" + AreaOfRectangle);

		int CircumferenceOfRectangle = 2 * (Length + Width);
		System.out.println("Circumference Of Width:" + CircumferenceOfRectangle);
	}

}
