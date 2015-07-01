/**
 * 
 */
package Homework;

/**
 * @author Ishil Puri
 *6/27/15
 */
public class Homework3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//#20
		System.out.print("T-minus ");
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + ", ");
		}
		System.out.println("Blastoff!");

		//#15
		for (int i = 1; i <= 6; i++) {
			// your code here
			System.out.println(18 * i - 22);
		}

		for (int i = 1; i <= 3; i++) {
			System.out.println("How many lines");
			System.out.println("are printed?");
		}

		oddStuff();

		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
			total = total - number;
			System.out.println(total + " " + number);
		}

		System.out.println("+---+");
		for (int i = 1; i <= 3; i++) {
			System.out.println("\\ /");
			System.out.println("/ \\");
		}
		System.out.println("+---+");
		
		unknown();

	}

	public static void oddStuff() {
		int number = 4;
		for (int count = 1; count <= number; count++) {
			System.out.println(number);
			number = number / 2;
		}
	}

	
		public static final int MAX = 5;
		
		public static void unknown() {
			int number = 0;

			for (int count = MAX; count >= 1; count--) {
				number += (count * count);
			}

			System.out.println("The result is: " + number);
		}

	}