/**
 * 
 */
package review_lab;

/**
 * @author Ishil Puri
 *7/15/15
 */
public class ReviewLabClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//main
		ReviewLab one = new ReviewLab();
		ReviewLab two = new ReviewLab("L.A.");
		System.out.println(one);
		System.out.println(two);
		one.addToRoster("Bob");
		System.out.println(one);
		one.setCity("New York");
		System.out.println(one);
		one.updateBattingAverage(0.780);
		two.updateBattingAverage(0.01);
		System.out.println(one);
		System.out.println(two);
		if (two.isAverageGood() == true){
			two.updateBattingAverage(1.001);
		}
		System.out.println(two);
		if (one.equals(two)){
			System.out.println("They are equal!");
		}
	}
	/*public String toString () {
		String name = ""; 
		
		for (int i = 0; i < roster.size(); i++) {
			name += " " + roster.get(i);
		}
		
		name = "City: " + city + "\n\n" + teamBattingAverage + "\n\n" + name;
		
		return name;
	}*/
}
