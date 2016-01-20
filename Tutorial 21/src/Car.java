
public class Car extends Machine {
	
	// Overriding from the main class
	// So instead of saying Machine started, it will now say
	// Car started.
	@Override
	public void start() {
		System.out.println("Car started.");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
