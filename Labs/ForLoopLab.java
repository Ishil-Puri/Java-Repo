/**
 * 
 */
package Labs;

/**
 * @author Ishil Puri
 *6/26/15
 */
public class ForLoopLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// part a

		nameLoop();
		boxLoop ();
		numbersLoop ();
		numbersBackwardsLoop ();

		// part b

		nameForLoop ();
		forLoopMethod ();
		FibForLoopMethod ();
		printPatternMethod ();
	}

	public static void nameLoop () {

		// change the following statements into a for loop
		for (int i = 0; i<=5; i++) {
			System.out.println ("james");
		}
	}

	public static void boxLoop () {

		// change the following statements into a for loop
		for (int i = 0; i<3; i++) {
			System.out.println ("+---------------+");
			System.out.println ("|               |");
			System.out.println ("|               |");
			System.out.println ("+---------------+");
		}
	}

	public static void numbersLoop () {

		// Write a for loop to print 4 through 10 to the console
		// 4 5 6 7 8 9 10
		for (int i = 4; i<=10; i++){
			System.out.println(i);
		}

	}

	public static void numbersBackwardsLoop () {

		// write a for loop to print 10 through 0 to the console
		// 10 9 8 7 6 5 4 3 2 1 0
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	static void nameForLoop () {

		// print your name to the console  and iterator 50 times using a for loop
		for (int i = 0; i<50; i++) {
			System.out.println("Ishil Puri " + i);
		}
	}

	static void forLoopMethod () {

		// Exercise #2, pg 12
		// Write a for loop that produces the following output:
		// 1 4 9 16 25 36 49 64 81 100
		for (int i = 1; i <= 10; i++){
			int output = i * i;
			System.out.println(output);

		}
	}

	static void FibForLoopMethod () {

		// Exercise #3, pg 125
		// Write a for loop to produce the Fibonacci sequence:
		// 1 1 2 3 5 8 13 21 34 55 89 144

		int prev;
		int next;
		int sum;
		int n;
		prev = next = 1;

		for (n=1; n<=12; n++) {
			//fibonacci sequence calculation
			System.out.println(prev);
			sum = prev + next;
			prev = next;
			next = sum;
		}

	}

	static void printPatternMethod () {

		// write a for loop that keeps the total count of adding 
		// every odd number.  When the loop is done and before
		// the method is finished, print the total.  This method
		// should only print one line
		int total = 0;
		for (int i=1; i<=15; i+=2) {
			//pattern
			total = total + i;
		}
		System.out.println("The total is " + total);
	}
}
