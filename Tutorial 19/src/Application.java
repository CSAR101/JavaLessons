
public class Application {

	public static void main(String[] args) {
		
		// Inefficient
		String info ="";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);

		// More efficient.
		StringBuilder sb = new StringBuilder ("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		// ========== FORMATING ============
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
		System.out.println(" More text.");
		
		// %-10d basically means that there is 10 spaces for the value of d
		// By having the - in there, you are left justifying the value.
		System.out.printf("Total cost %-10d; quantity is %d", 5, 120);
		
		
		// Formatting integers
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: some text here\n", i);
		}
		
		for(int i=0; i<12; i++) {
			System.out.printf("%2d: %s\n", i, "additional text");
		}
		
		// Formatting floating point value
		System.out.printf("Total value: %.2f\n", 5.6874);
		System.out.printf("Total value: %5.1f\n", 343.23423);
		
	}

}
