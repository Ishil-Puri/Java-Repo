/**
 * 
 */
package Console_Lab;

/**
 * @author Ishil Puri
 *7/4/15
 */
import java.util.*;
public class Console_Lab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Console Lab
		console();
		System.out.println();
		oddeven();
		System.out.println();
		zero();
		System.out.println();
		string();
		System.out.println();
		len();
		System.out.println();
		ten();
		System.out.println();
		read();
		System.out.println();
		random(1,5);
		System.out.println();
		guessing_game(1,10);
	}
	//#1.1
	public static void console() {
		Scanner console = new Scanner (System.in);
		int num;
		System.out.println("Please input a number: ");
		num = console.nextInt();
		System.out.println("You typed "+num+".");
		//console.close();
	}
	//#1.2
	public static void oddeven() {
		Scanner oddeven = new Scanner (System.in);
		int num;
		System.out.println("Please enter a number: ");
		num = oddeven.nextInt();
		if (num%2==0){
			System.out.println("The number you entered is even.");
		}else{
			System.out.println("The number you entered is odd.");
		}
		//oddeven.close();
	}
	//#1.3
	public static void zero() {
		Scanner zero = new Scanner (System.in);
		int num;
		System.out.println("Please input a number: ");
		num = zero.nextInt();
		while (num!=0) {
			System.out.println("Please input a number: ");
			num = zero.nextInt();
		}	
		//zero.close();
	}
	//#2.1
	public static void string() {
		Scanner string = new Scanner (System.in);
		String con;
		System.out.println("Please enter a string: ");
		con = string.nextLine();
		System.out.println("You entered "+ con+".");
		//string.close();
	}
	//#2.2
	public static void len() {
		Scanner length = new Scanner (System.in);
		String con;
		System.out.println("Please input a string: ");
		con = length.nextLine();
		System.out.println("You typed "+ con+".");
		int len;
		len = con.length();
		System.out.println(con+" is "+len+" characters long.");
		//length.close();
	}
	//#2.3
	public static void ten() {
		Scanner tenth = new Scanner (System.in);
		String ten;
		int num_chars;
		System.out.println("Please enter a string: ");
		ten = tenth.nextLine();
		num_chars = ten.length();
		while(num_chars!=10){
			System.out.println("Please enter a string: ");
			ten = tenth.nextLine();
		}
		//tenth.close();
	}
	//#3.1
	public static void read() {
		Scanner onefive = new Scanner (System.in);
		int one = 1;
		System.out.println("Please enter a number: ");
		one = onefive.nextInt();
		if (one<=5) {
			System.out.println("Thank you for entering a number between 1 and 5!");
		}else{
			System.out.println("Please enter a number between 1 and 5: ");
			one = onefive.nextInt();
		}
		onefive.close();
	}
	//#3.2
	public static int random(int min, int max) {
		/*Random i = new Random();
		System.out.println(i);
		return random;*/
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		System.out.println(randomNum);
		return randomNum;
	}
	//#3.3
	public static int guessing_game(int min, int max) {
		Scanner guess = new Scanner (System.in);
		int guessnum;
		guessnum = guess.nextInt();
		Random rand = new Random();
		System.out.println("Guess a number between 1 and 10!");
		int randomNum = rand.nextInt((max - min) + 1) + min;
		if (guessnum == randomNum) {
			System.out.println("Good guess!");
		}else{
			System.out.println("Try again!");
			System.out.println();
			System.out.println("Guess a number between 1 and 10!");
			guessnum = guess.nextInt();
		}
		guess.close();
		return randomNum;
	}
}