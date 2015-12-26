// =====================================
// ************ PROBLEM 1 **************
// =====================================

// Calculate the sum of all multiples of 3 or 5 below 1000

/*public class Application {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum is " + sum);
	}
}*/

// =====================================
// ************ PROBLEM 2 **************
// =====================================

// Even Fibonacci numbers 
// Find the sum of the even-valued terms

public class Application {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int fibCount = 32;
		int[] fib = new int[fibCount];
		fib[0] = 1;
		fib[1] = 2;
		for(int i=2; i < fibCount; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		for(int i=0; i< fibCount; i++) {
			//System.out.println(fib[i] + " " );
			if(fib[i]%2==0) {
				sum = sum + fib[i];
				System.out.println(fib[i]);
			}
		}
		System.out.println("The sum is " + sum);
	}
}

//=====================================
//************ PROBLEM 3 **************
//=====================================
