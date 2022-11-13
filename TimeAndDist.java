import java.util.Scanner;

public class TimeAndDist {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Speed:");
		int Speed = S.nextInt();

		System.out.println("Enter Time:");
		int Time = S.nextInt();

		int Distance = Speed * Time;
		System.out.println("Total Distance:" + Distance);

		int ToTime = Distance / Speed;
		System.out.println("Total Distance:" + ToTime);
	}

}
