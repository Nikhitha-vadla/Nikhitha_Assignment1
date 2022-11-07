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
