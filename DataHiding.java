class DataHiding {

	private String name = "nik";
	private int rolnum = 9;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRolnum() {
		return rolnum;
	}

	public void setRolnum(int rolnum) {
		this.rolnum = rolnum;
	}

	public static void main(String[] args) {

		DataHiding obj = new DataHiding();
		obj.setName("Data hiding in java");
		System.out.println(obj.getName());
	}

}