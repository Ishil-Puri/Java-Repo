/**
 * 
 */
package AgeClass;

/**
 * @author Ishil Puri
 *  6/23/15
 */
public class AgeClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//calls the method that gets average of ages of people to my left and right
		average();
	}	
	public static void average() {
		//calculates the average and declares it when called in the main method

		double averageage;
		averageage = (13.75 + 14.5 + 17.25) / 3.0;
		System.out.println("The average age of Rahul, Ishil, and Geoffrey is " + averageage);
		System.out.println("The age modulus 2 is " + averageage % 2);
	}
}