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