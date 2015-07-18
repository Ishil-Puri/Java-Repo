/**
 * 
 */
package HomeWorkSix;

/**
 * @author Ishil Puri
 *7/4/15
 */
import java.util.*;
public class HomeWorkSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//HW#6
		repl("Hi. ", 3);
		Scanner console = new Scanner (System.in);
		evenSumMax(console);
		console.close();
	}
	//#1 returns the word num times
	public static String repl(String word, int num) {
		String str = "";
		for (int i = 1; i<=num; i++){
			str = str + word;
		}
		System.out.println(str);
		return word;
	}
	//#2
	public static int evenSumMax(Scanner console) {
		int numtimes;
		int max = 0;
		int total = 0;
		System.out.println("How many integers?");
		numtimes =  console.nextInt();
		for (int i = 0; i<=numtimes; i++) {
			System.out.println("Next Integer?");
			int nextint = console.nextInt();
			System.out.println(nextint);
			if (nextint%2==0){
				total += nextint;
			}
		for (int j=0; j>=max; j++){
			if (nextint>max){
					max=nextint;
			}
		}
		System.out.println(max);
		System.out.println(total);
		}
		console.close();
		return total;
	}
}