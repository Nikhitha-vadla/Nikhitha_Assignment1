import com.pack;

public class UpperCaseFor {
	public static void main(String[] args) {
		// String ReqStr = " ";
		String S = " i am nikhitha";

		String[] arr = S.split(" ");

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(0);
			String N = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(i);

			// ReqStr = ReqStr + N + sub + " ";
			System.out.println(N + sub + " ");
		}
	}
}
