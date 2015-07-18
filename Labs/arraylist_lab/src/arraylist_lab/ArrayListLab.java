/**
 * 
 */
package arraylist_lab;
/**
 * @author Ishil Puri
 *7/10/15
 */
import java.util.*;
public class ArrayListLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//main
		Scanner console = new Scanner (System.in);
		ArrayList <String> names = createList(console);
		System.out.println();
		reverseList(names);
		System.out.println();
		System.out.println(capitalizePlurals(names));
		System.out.println();
		System.out.println(removePlurals(console));
		System.out.println();
		ArrayList<Integer>num1 = new ArrayList<Integer>();
		console.close();
	}
	//#1 adds strings inputed from the console into an arraylist and prints them
	public static ArrayList<String> createList(Scanner console){
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("How many strings would you like to enter?");
		int num = console.nextInt();
		for (int i = 0; i<num; i++){
			System.out.print("Please enter any string: ");
			String input = console.next();
			names.add(input);
			System.out.println();
		}
		for (int i = 0; i<names.size(); i++){
			System.out.print(names.get(i)+" ");
		}
		return names;
	}
	//#2 reverses order of list in #1
	public static ArrayList<String> reverseList(ArrayList<String> names){
		int j = names.size() - 1;
		for(int i = 0; i < j; i++) {
			names.add(i, names.remove(j));
		}
		for (int i = 0; i<names.size(); i++){
			System.out.print(names.get(i)+" ");
		}
		return names;
	}
	//#3 capitalizes all elements that end in an s
	public static ArrayList<String> capitalizePlurals(ArrayList<String> names){
		for (int i = 0; i<names.size(); i++){
			String findlen = names.get(i);
			if(findlen.endsWith("s")==true){
				String upper = findlen.toUpperCase();
				names.set(i, upper);
			}
		}
	return names;
	}
	//#4 removes all elements that end with an "s" or "S"
	public static ArrayList<String> removePlurals(Scanner console){
		ArrayList<String> removed = new ArrayList<String>();
		System.out.println("How many strings would you like to enter?");
		int num = console.nextInt();
		for (int i = 0; i<num; i++){
			System.out.print("Please enter any string: ");
			String input = console.next();
			removed.add(input);
			for (int j = 0; j<removed.size(); j++){
				String findlen = removed.get(j);
				if(findlen.endsWith("s")==true){
					removed.remove(j);
				}
				if(findlen.endsWith("S")==true){
					removed.remove(j);
					
				}
			}
		}
		
	return removed;
	}
	//#5 
	//public static ArrayList<Integer> intersectLists(ArrayList<Integer>){
		
	//}
}