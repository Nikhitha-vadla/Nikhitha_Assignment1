class Student1 {
	int Id;
	String name;
	static String company = "MassMtual";

	Student1(int r, String n) {
		Id = r;
		name = n;
	}

	void display() {
		System.out.println(Id + " " + name + " " + company);
	}
}

public class StaticDe {
	public static void main(String args[]) {
		Student1 s1 = new Student1(111, "Nikhitha");
		Student1 s2 = new Student1(222, "ANU");

		s1.display();
		s2.display();
	}
}