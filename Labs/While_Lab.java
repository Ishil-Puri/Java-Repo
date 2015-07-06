/**
 * 
 */
package Labs;

/**
 * @author Ishil Puri
 *7/2/15
 */
public class While_Lab {
	final static String name = "Ishil";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		wloop();
		System.out.println();
		bool();
		System.out.println();
		num();
		System.out.println();
		inc3();
		System.out.println();
		calbool();
	}	
	// #1 while loop for name 5 times
	public static void wloop() {
		int i = 0;
		while(i<=4){
			System.out.println(name);
			i+=1;
		}
	}	
	//#2 using a boolean to stop while loop
	public static void bool() {
		int i = 0;
		boolean flag = false;
		while(flag==false) {
			if (i<5) {
				System.out.println(name);
			}else{
				flag=true;
			}
			i++;

		}
	}
	// #3 using if statement to figure out whether number is odd or even
	public static void num() {
		int i = 1;
		while(i<=10) {
			if (i%2==0){
				System.out.println(i+ " is even.");
			}else{
				System.out.println(i+" is odd.");
			}
			i+=1;
		}
		System.out.println();
	}
	//#4 incrementing by 3
	public static void inc3() {
		int i = 1;
		while(i<=30) {
			i+=3;
			System.out.println("loop");
		}
		i+=1;
	}
	//#5 California
	public static void calbool() {
		boolean flag = false;
		while(flag==false) {
			String state = "California";
			state.substring(0,5);
			System.out.println(state.substring(0, 6));
			System.out.println("character found at position");
			flag=true;
		}
	}
}