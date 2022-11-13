
public class EncapsulationCs {
	// private data member
	private String name;
	private int Id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public static void main(String[] args) {
		EncapsulationCs Enc = new EncapsulationCs();
		Enc.setName("vijay");
		System.out.println(Enc.getName());

		Enc.setId(67);
		System.out.println(Enc.getId());
	}
}
