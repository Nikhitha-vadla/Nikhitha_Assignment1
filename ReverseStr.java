
public class ReverseStr {

	public static void main(String[] args) {
		String reqStr = " ";
		System.out.println("Enter Your Languages you know:");
		String S = "i am nikhitha";

		String[] arr = S.split(" ");

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(0);
			String c1 = String.valueOf(c).toUpperCase();
			String sub = arr[i].substring(1);
			reqStr = reqStr + c1 + sub + " ";

		}
		System.out.print(reqStr.trim());
	}

}
