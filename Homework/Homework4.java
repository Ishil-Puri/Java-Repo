/**
 * 
 */
package Homework;

/**
 * @author Ishil Puri
 *
 */
public class Homework4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//#1
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 7; j++) { 
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}

		//#2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) { 
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
		}
		//A Space to make things clearer
		System.out.println();
		//#3
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 5; k++) {
					System.out.print("*");
				}
				System.out.print("!");
			}
			System.out.println();
		}
		//Same as line 34 & 35
		//#4
		System.out.println();

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 5; k++) {
					System.out.print("*");
				}
			}

			System.out.print("!");
			System.out.println();
		}

		//Same as line 34 & 35
		System.out.println();
		//#5
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 5; k++) { 			
					System.out.print("*");
					System.out.print("!");
				}

				System.out.println();
			}
		}
		//Same as line 34 & 35
		System.out.println();
		printDesign();
		//#6
	}
	public static void printDesign() {
		for (int rows = 1; rows <= 5; rows++) {
			for (int cols=1; cols<=6-rows; cols++){
				System.out.print("-");
			}
			for (int oddnum=1; oddnum<=rows*2-1; oddnum++) {
				System.out.print(rows*2-1);
			}
			for (int cols=1; cols<=6-rows; cols++){
				System.out.print("-");
			}
		}
	}
}