/**
 * 
 */
package Labs;

/**
 * @author Ishil Puri
 *6/30/15
 */
public class StringLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// putting methods in the main
		name_len();
		first();
		middle();
		beginningmid();
		upper();
	}
	//length of my name
	public static void name_len() {
		String name = "Ishil Puri";
		int len = name.length();
		System.out.println("The length of my name is " +len+" characters.");
	}
	//first character of my name
	public static void first() {
		String name = "Ishil Puri";
		char first = name.charAt(0);
		System.out.println(first);
	}
	//the middle character of my name is a space
	public static void middle() {
		String name = "Ishil Puri";
		char middle = name.charAt(5);
		System.out.println(middle);
		
	}
	//when I put name.substring it gave me an error, 
	//so I assigned it to a string and printed that
	public static void beginningmid() {
		String name = "Ishil Puri";
		String mid = name.substring(0, 6);
		System.out.println(mid);
	}
	//converting all letters in my name to uppercase
	public static void upper() {
		String n = "Ishil Puri";
		n = n.toUpperCase();
		System.out.println(n);
	}
}