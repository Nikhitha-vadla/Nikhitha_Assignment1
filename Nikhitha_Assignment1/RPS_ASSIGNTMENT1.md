# Nikhitha_Assignment1

1) import java.util.Scanner;

public class UniqCharCount1 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String:");
		String a = SC.next();

		System.out.println(a.length());
	}

}

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

3) import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrdOfTreeSet3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("NIKHITHA");
		set.add("ANU");
		set.add("AARTHI");
		set.add("ARAVIND");
		set.add("SHARATH");

		System.out.println("Order of tree set:" + set);

		Iterator It = set.descendingIterator();
	    System.out.println("reverse order of tree set:" );

		while (It.hasNext()) {
			System.out.println(It.next());
		}

	}

}

4)import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashToLstArray4 {

	public static void main(String[] args) {
		HashSet<String> HSet = new HashSet<String>();
		HSet.add("Big Empty");
		HSet.add("Few Empty");
		HSet.add("Learner");
		HSet.add("Intelligent");
		HSet.add("Winner");
		HSet.add("Expert");

		System.out.println("Hash liat" +HSet);

		List<String> list = new ArrayList<String>(HSet);
		System.out.println("ArrayList contains: " + list);

	}

}

5)  import java.util.*;

public class SameLat {
	public static void main(String[] args) {

		HashSet<String> h_set1 = new HashSet<String>();

		h_set1.add("nikhitha");
		h_set1.add("rani");
		h_set1.add("sowkya");
		h_set1.add("ammu");

		System.out.println("Frist HashSet list: " + h_set1);
		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("ammu");
		h_set2.add("nikhitha");
		h_set2.add("aravind");
		h_set2.add("rani");

		System.out.println("Second HashSet list: " + h_set2);
		h_set1.retainAll(h_set2);
		System.out.println("HashSet content:");
		System.out.println(h_set1);
	}
}