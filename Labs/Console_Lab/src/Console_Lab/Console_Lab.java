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
		Scanner console = new Scanner (System.in);
		console(console);
		System.out.println();
		oddeven(console);
		System.out.println();
		zero(console);
		System.out.println();
		string(console);
		System.out.println();
		len(console);
		System.out.println();
		ten(console);
		System.out.println();
		read(console);
		System.out.println();
		random(1,5);
		System.out.println();
		guessing_game(1,10, console);
		console.close();
	}
	//#1.1
	public static void console(Scanner console) {
		int num;
		System.out.println("Please input a number: ");
		num = console.nextInt();
		System.out.println("You typed "+num+".");
	}
	//#1.2
	public static void oddeven(Scanner console) {
		int num;
		System.out.println("Please enter a number: ");
		num = console.nextInt();
		if (num%2==0){
			System.out.println("The number you entered is even.");
		}else{
			System.out.println("The number you entered is odd.");
		}
	}
	//#1.3
	public static void zero(Scanner console) {
		int num;
		System.out.println("Please input a number: ");
		num = console.nextInt();
		while (num!=0) {
			System.out.println("Please input a number: ");
			num = console.nextInt();
		}	
	}
	//#2.1
	public static void string(Scanner console) {
		String con;
		System.out.println("Please enter a string: ");
		con = console.next();
		System.out.println("You entered "+ con+".");
	}
	//#2.2
	public static void len(Scanner console) {
		String con;
		System.out.println("Please input a string: ");
		con = console.next();
		System.out.println("You typed "+ con+".");
		int len;
		len = con.length();
		System.out.println(con+" is "+len+" characters long.");
	}
	//#2.3
	public static void ten(Scanner console) {
		String ten;
		System.out.println("Please enter a string: ");
		ten = console.next();
		while(ten.length() != 10){
			System.out.println("Please enter a string that is 10 characters long: ");
			ten = console.next();
		}
	}
	//#3.1
	public static void read(Scanner console) {
		int one = 1;
		System.out.println("Please enter a number: ");
		one = console.nextInt();
		if (one<=5) {
			System.out.println("Thank you for entering a number between 1 and 5!");
		}else{
			System.out.println("Please enter a number between 1 and 5: ");
			one = console.nextInt();
		}
	}
	//#3.2
	public static int random(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		System.out.println(randomNum);
		return randomNum;
	}
	//#3.3
	public static int guessing_game(int min, int max, Scanner console) {
		int guessnum;
		System.out.println("Guess a number between 1 and 10!");
		guessnum = console.nextInt();
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		while(guessnum!=randomNum){
			if (guessnum == randomNum) {
				System.out.println("Good guess!");
			}else{
				System.out.println("Try again!");
				System.out.println();
				System.out.println("Guess a number between 1 and 10!");
				guessnum = console.nextInt();
				if (guessnum == randomNum){
					System.out.println("Good guess!");
				}
			}
		}
		return randomNum;
	}
}