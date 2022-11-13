import java.util.Scanner;

public class PstNgtInput {
	public static void main(String args[]) {

		int countNeg = 0;
		int countEvnpos = 0;
		int countEvnneg = 0;
		int i;
		int[] arr = new int[5];

		Scanner SC = new Scanner(System.in);
		System.out.println("Enter numbers:");

		for (i = 0; i < 5; i++)
			arr[i] = SC.nextInt();
		{

			for (i = 0; i < 5; i++) {
				if (arr[i] < 0)
					countNeg++;
				else if (arr[i] % 2 !=0)
					countEvnpos++;
				System.out.println("Number of even postvive numbers:");
			}   else if
			      (arr[i] % 2 == 0) {
				countEvnneg++;
			System.out.println("Number of odd postive numbers:");
			}
		}
	}
}
