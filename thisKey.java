
//This is current class object
public class thisKey {
	  int x;

	  // Constructor with a parameter
	  public thisKey(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
		  thisKey myObj = new thisKey(5);
	    System.out.println("Value of x = " + myObj.x);
	  }
	}
