/**
 * 
 */
package Diamond;

/**
 * @author Ishil Puri
 *
 */
public class Diamond {

	public static void main(String[] args) {
		border();
		topHalf();
		bottomHalf();
		border();

	}
	static void border() {
		System.out.println("#================#");
	}

	static void topHalf() {

		for(int line=0; line<=3; line++) {

			int spaces = (6-2*line);
			int dots = (4*line);
			drawLine(spaces, dots);
		}


	}

	static void bottomHalf() {

		for(int line=0; line<=3; line++) {
			int spaces=(2*line);
			int dots=(12-(4*line));
			drawLine(spaces, dots);
		}
	}

	static void drawLine( int spaces, int dots ) {

		System.out.print("|");
		for(int space=1; space <= spaces; space++) {
			System.out.print(" ");
		}
		System.out.print("<>");
		for(int dot=1; dot<=dots; dot++) {
			System.out.print(".");
		}
		System.out.print("<>");
		for(int space=1; space <= spaces; space++) {
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.println();
	}
}