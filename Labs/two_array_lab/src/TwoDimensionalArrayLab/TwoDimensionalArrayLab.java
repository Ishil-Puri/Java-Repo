/**
 * 
 */
package TwoDimensionalArrayLab;

/**
 * @author Ishil Puri
 *7/8/15
 */
import java.util.Scanner;
public class TwoDimensionalArrayLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//main
		int [][] chessBoard =  {{1, 3, 4, 4, 7, 8, 9},
				{12, 43, 54, 1, 7, 20, 9},
				{33, 6, 2, 1, 7, 9, 1},
				{6, 87, 2, 23, 21, 1, 10}};
		System.out.println(findMax(chessBoard));
		System.out.println();
		System.out.println(findMin(chessBoard));
		System.out.println();
		System.out.println(addThree(chessBoard));
		System.out.println();
		System.out.println(addElements(chessBoard));
		System.out.println();
		System.out.println(addAllEvenNumbers(chessBoard));
		System.out.println();
		classMateNames();
	}
	//#1 finding the highest int in the 2d array x
	public static int findMax(int [][] x){
		int max = x[0][0];
		for (int rows=0; rows<x.length; rows++){
			for (int cols=0; cols<x[rows].length; cols++){
				if (x[rows][cols]>max){
					max = x[rows][cols];
				}
			}
		}
		return max;
	}
	//#2 finds the lowest int in the 2d array x
	public static int findMin(int [][] x){
		int min = x[0][0];
		for (int rows=0; rows<x.length; rows++){
			for (int cols=0; cols<x[rows].length; cols++){
				if (x[rows][cols] < min){
					min = x[rows][cols];
				}
			}
		}
		return min;
	}
	//#3 adds 3 to each element in x
	public static int addThree(int [][] x){
		for (int rows=0; rows<x.length; rows++){
			for (int cols=0; cols<x[rows].length; cols++){
				x[rows][cols] += 3;
			}
		}
		return x[3][1];
	}
	//#4 adds two elements together
	public static int addElements(int [][] x){
		int sum = 0;
		sum = x[2][3] + x[3][4];
		return sum;
	}
	//#5 adds all even numbers
	public static int addAllEvenNumbers(int [][] x){
		int evensum=0;
		for (int rows=0; rows<x.length; rows++){
			for (int cols=0; cols<x[rows].length; cols++){
				if(x[rows][cols]%2==0){
					evensum = x[rows][cols] + evensum;
				}
			}
		}
		return evensum;
	}
	//#6
	public static void classMateNames(){
		int x;
		int y;
		Scanner console = new Scanner (System.in);
		System.out.println("Please enter a number: ");
		x = console.nextInt();
		System.out.println("Please enter another number: ");
		y = console.nextInt();
		String [][] names = new String [x][y];
		for (int rows = 0; rows<names.length; rows++){
			for(int cols = 0; cols<names.length; cols++){
				System.out.println("Please enter a name: ");
				names[rows][cols] = console.next();
			}
		}
		for (int rows = 0; rows<names.length; rows++){
			for(int cols = 0; cols<names.length; cols++){
				System.out.println(names[rows][cols]);
			}
		}	
		console.close();
	}
}