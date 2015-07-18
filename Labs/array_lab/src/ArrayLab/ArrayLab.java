/**
 * 
 */
package ArrayLab;

/**
 * @author Ishil Puri
 *7/7/15
 */
import java.util.*;
public class ArrayLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Array Lab
		randomArray();
		System.out.println();
		familyArray();
		System.out.println();
		Scanner console = new Scanner (System.in);
		consoleArray(console);
		System.out.println();
		System.out.println(multiplySumArray(5));
		System.out.println();
		upperCase(console);
		System.out.println();
		findMe(console);
		System.out.println();
		boolean flag = fourInARow();
		if (flag == true){
			System.out.println("True");
		}
		else
			System.out.println("False");
		System.out.println();
		int[] five = {6,9,8,7,5};
		greaterThanFive(five);
		console.close();
	}
	//#1 one
	public static void printIntArray(int[] one){
		System.out.print(one[0]);
		for (int i = 1; i < one.length; i++) {
			System.out.print(", " + one[i]);
		}
		System.out.println();
	}
	//#2 two
	public static void printStringArray(String[] two){
		for (String c : two){
			System.out.println(c);
		}
		System.out.println();
	}
	//#3 three
	public static void randomArray() {
		int[] arrint = new int[10];
		for (int i = 0; i<arrint.length; i++){
			arrint[i] = (int) (Math.random()*100+1);
			arrint[i]++;
		}
		printIntArray(arrint);
		return ;
	}
	//#4 family array
	public static void familyArray(){
		String[] familia = {"Vipin", "Tina", "Ishil", "Iyesha"};
		printStringArray(familia);
		return;
	}
	//#5 console array
	public static void consoleArray(Scanner console) {
		int[] arrow = new int[10];
		for (int i = 0; i<=9; i++) {
			System.out.println("Please enter a number: ");
			arrow[i] = console.nextInt();
		}
		printIntArray(arrow);
	}
	//#6 multiplySumArray
	public static int multiplySumArray(int x) {
		int sum = 0;
		int[] mult = {x,x,x,x,x,x,x,x,x,x};
		for (int i = 0; i<=9; i++){
			mult[i] = mult[i] * i;
		}
		for (int j = 0; j<=9; j++){
			sum = sum + mult[j];
		}
		return sum;
	}
	//#7
	public static void upperCase(Scanner console) {
		String[] upper = new String[5];
		for (int i = 0; i<5; i++) {
			System.out.println("Please enter a string: ");
			upper[i] = console.next().toUpperCase();
		}
		printStringArray(upper);
	}
	//#8
	public static void findMe(Scanner console) {
		int[] randint = new int[100];
		for (int i = 0; i<randint.length; i++){
			randint[i] = (int) (Math.random()*15+1);
			randint[i]++;
		}
		System.out.println("Please enter a number: ");
		int num = console.nextInt();
		for (int j = 0; j<randint.length; j++){
			if (num == randint[j]){
				System.out.println("Found at "+j);
				return;
			}
		}
		System.out.println("Not found!");
		return;
	}
	//#9
	public static boolean fourInARow(){
		int count = 0;
		char[] four = {'x', 'x', 'x', 'x', 'o', 'o', 'o', 'o'};
		for (int i = 0; i<=four.length; i++){
			if (four[i] == 'x'){
				count++;
			if (count == 4){
				return true;
				}
			}
		}
		return false;
	}
	//#10
	public static boolean greaterThanFive(int[] data) {
		for(int i = 0; i<data.length; i++) {
			if (data[i]<5){
				System.out.println("false");
				return false;
			}
		}
		System.out.println("True");
		return true;
	}
}