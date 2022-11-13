package LanguageOrder;

public class LanguageOrder {

	public static void main(String[] args) {

		System.out.println("Enter Your Languages you know:");
		String S = "1)C , 2)C++ , 3)Java , 4)Python , 5)SQL";

		String[] arr = S.split(" , ");
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

	}
}
