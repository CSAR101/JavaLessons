class Machine {
	private String name;
	private int code;
	
	public Machine() { 
		// calling a constructor within a constructor
		// here we are calling the third constructor
		this("Arnie", 0);
		
		System.out.println("Constructor running!");
		
		name = "Arnie";
	}
	
	public Machine(String name) {
		// calling a constructor within a constructor
		// here we are calling the third constructor
		this(name, 0);
		
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
}
public class Application {

	public static void main(String[] args) {
		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Bertie");
		
		Machine machine3 = new Machine("Chalky", 7);
	}

}
