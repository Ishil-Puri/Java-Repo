/**
 * 
 */
package Labs;

/**
 * @author Ishil Puri
 *6/30/15
 */
public class NestedLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// making a 4X5 rectangle
		for (int rows=1; rows<=4; rows++) {
			for (int cols=1; cols<=5; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//making a triangle out of carrots
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("^");
			}
			System.out.println();
		}
		//creating a triangle w/numbers
		for (int i=1; i<=7; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//using nested for loops to print
		//1, 2, 3, 4, 5 on separate lines
		for (int i=1; i<=5; i++) {
			System.out.println();
			for (int j=4; j>=i; j--) {
			}
			System.out.print(i);
		}
		//adding line spaces to make output more readable
		System.out.println();
		System.out.println();
		//printing 3, 4, 5, 6, 7 using nested loops in a triangle
		for (int i=3; i<=7; i++) {
			System.out.println();
			for (int j=0; j<=i-3; j++) {
				System.out.print(i);
			}
		}
	}
}