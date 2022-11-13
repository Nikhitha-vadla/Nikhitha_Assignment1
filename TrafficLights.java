import java.util.Scanner;

public class TrafficLights {
	public static void main(String[] args) {
		String S1 = "Red";
		String S2 = "Yellow";
		String S3 = "Green";

		System.out.println("Traffic Lights");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a color");
		System.out.println(S1 + "  " + S2 + "  " + S3);
		String val1 = sc.next();

		if (val1.contentEquals(S1)) {
			System.out.println("you are selected red colour");
			System.out.println("STOP");
		} else if (val1.contentEquals(S2)) {

			System.out.println("you are selected yellow color");
			System.out.println("READY");

		} else if (val1.contentEquals(S3)) {
			System.out.println("you are selected green colour");
			System.out.println("GO");
		} else {
			System.out.println("invalid color");
		}
	}
}