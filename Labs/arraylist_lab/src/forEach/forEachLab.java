/**
 * 
 */
package forEach;

/**
 * @author Ishil Puri
 *7/12/15
 */
import java.util.*;
public class forEachLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//main
		inOrder();
		System.out.println();
		int[] rand = {8,2,9,8,4,1,6,3,7};
		randomArray(rand);
	}
	//#6 checks if the array is in order
	public static void inOrder(){
		int[] correct = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] notCorrect = {10,3,1,4,2,6,5,9,7,8,13,15,11,12,14,17,19,16,20,18};
		int lastnum = 0;
		for (int i : notCorrect ){

			if (i == lastnum + 1){

				//whatever
				lastnum++;
			}
		}
		if (lastnum==20){
			System.out.println("In order.");
		}else{
			System.out.println("Not in order.");
		}
	}
	//#7 counts the # of 8's and adds them together
	public static void randomArray(int[] rand){
		int counter = 0;
		for(int i:rand){
			if (i==8){
				counter += 1; 
			}
		}
		for (int i : rand){
			System.out.println(i);
		}
		System.out.println();
		System.out.println("The sum is " +counter*8+".");
	}
	//#8
	public static void forJames(Scanner console){
		
		return ;
	}
}