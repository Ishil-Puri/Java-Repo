/**
 * 
 */
package While_Lab;

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
	public static void num() {
		int i = 0;
		while(i<=10) {
			
		}
	}

}