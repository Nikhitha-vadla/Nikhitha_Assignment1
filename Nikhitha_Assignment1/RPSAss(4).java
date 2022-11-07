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
