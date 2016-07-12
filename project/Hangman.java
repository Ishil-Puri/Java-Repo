package projects;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

/**
 * @author Ishil Puri
 *
 */
public class Hangman {       

	public static ArrayList<String> split = new ArrayList<String>();
	public static ArrayList<String> guessed = new ArrayList<String>();
	public static String[] cpu = {"hi", "java", "what", "hello", "watermelon", "snowflake", "aardvark", "instructions", "donaldtrump", "aggragate"};
	public static int choice;
	public static int count=0;
	public static String word;
	public static String guess;
	public static boolean flag = true;
	public static boolean g = false;
	public static boolean punish = false;
	public static int token = 0;
	public static ArrayList<String> dashes;

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		menu(console);
		console.close();
	}
	public static void menu(Scanner console){

		print("\t\tWelcome to Hangman!\n");
		print("\t#1 Play against your friend!");
		print("\t#2 Play against an easy cpu!");
		print("\t#3 Play against a hard cpu!");

		intcheck(console);
		flag = true;
	}
	/**
	 * @param Scanner console accepts input (System.in)
	 * 
	 * Checks which game they want to play
	 */

	public static void checkC(Scanner console){

		switch(choice){
		case 1 : 
			flag = false;
			human(console);
			break;
		case 2 : 
			flag = false;
			easy(console);
			break;
		case 3 : 
			flag = false;
			hard(console);
			break;
		default : print("Invalid game! Choose again!\n");
		intcheck(console);
		break;
		}

	}
	/**
	 * Validator
	 * 
	 * @param Scanner console accepts input (System.in)
	 * 
	 * Checks whether input is an Integer
	 */
	public static void intcheck(Scanner console){
		do {
			try{
				System.out.print("\nWhich game would you like to play?: ");
				choice = console.nextInt();

				System.out.println(
						"You chose #" + choice);
				checkC(console);
				flag = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again. (" +
						"Incorrect input: an integer is required)\n");
				console.nextLine();

			}

		}while (flag);
	}
	/**
	 * Validator
	 * 
	 * @param Scanner console accepts input (System.in)
	 * 
	 * shortcut for a println statement
	 */
	public static void print(String n){
		System.out.println(n);
	}

	/**
	 * @param Scanner console accepts input (System.in)
	 * Asks for the word to be guessed
	 */
	public static void wordC(Scanner console){
		print("\nWhat word would you like the opponent to guess?");
		word = console.next().toLowerCase();
		if(word.length()>0){
			System.out.println("---------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nThank you! Player 2 may now look at the screen.\n");
		}else{
			System.out.println("Not a valid input");
		}
	}

	public static void guess(String n, Scanner console){
		System.out.println("\tGood luck guessing! The word is " + n.length() + " characters long! \n\tYou can only spare 6 incorrect guesses (unless you guess the whole word), use each one wisely: ");
		addWord(n);
		//dashes = new ArrayList<String>();
		//loop that keeps asking for guesses as long as the incorrect # of guesses is below <= 6 and they haven't guessed the whole word
		while (g==false&&count<=6){
			if(punish==true){
				printBody();
				punish=false;
			}else{
				
			}
			System.out.println();
//			dashes(n);
//			for (String i : dashes){
//				System.out.print(i);
//			}
			print("\n\nWhat is your guess?  ");
			guess = console.next().toLowerCase();
			guessed.add(guess);
			
			if (guess.length()>1){
				if(guess.equals(n)){
					System.out.println("Player 2 Wins!");
					g=true;
				}else{
					System.out.println("You Lose! '" + n + "' was the word. Hint: patience is the key...");
					System.exit(0);
				}
			}else{

//				for (int i=0; i<=guessed.size()+1; i++){
//				}

				for(int i=0; i<split.size(); i++){
					if (split.get(i).equals(guess)){
					//	dashes.set(i, guess);
						split.remove(i);
					}else{
						token++;
					}
				}
				if (split.size()==0){
					print("Player two guessed the word '"+n+"' correctly!");
					g=true;
				}
				else if (token==split.size()){
					print("WRONG!");
					punish = true;
					count++;
					token=0;
				}else if(token<split.size()){
					punish = false;
					print("Nice guess!");
					print("That's " + (n.length() - split.size()) + " down! "+split.size() + " left!" );
					token=0;

				}
			}
		}

	}

//	public static ArrayList<String> dashes(String n){
//		for (int i=0; i<n.length(); i++){
//			dashes.add("_");
//		}
//		return dashes;
//	}

	//adds word to an ArrayList
	public static void addWord(String n){
		for (int i=0; i<n.length(); i++){
			split.add(n.substring(i, i+1));
		}
	}

	//delivers consequences
	public static void printBody(){
		switch(count){
		case 1 : 
			//if you get 1 guess wrong, you get a head
			print("You got a head!\n\t O");
			break;
		case 2 :
			//gives arm for 2 incorrect guesses
			print("You received a left arm!\n\t O");
			System.out.print("\t\\");
			break;
		case 3:
			//gives torso for 3 wrong guesses
			print("You now have a torso!\n\n\t O");
			System.out.print("\t\\");
			System.out.print("|");
			break;
		case 4:
			//gives arm for 4 incorrect guesses
			print("You received a right arm!\n\t O");
			System.out.print("\t\\");
			System.out.print("|");
			System.out.print("/");
			break;
		case 5:
			//gives foot for 5 wrong guesses
			print("You received a left foot!\n\t O");
			System.out.print("\t\\");
			System.out.print("|");
			System.out.print("/");
			print("\n\t/");
			break;
		case 6:
			//gives foot for 6th incorrect guess & exits
			print("You received a right foot!\n\t O");
			System.out.print("\t\\");
			System.out.print("|");
			System.out.print("/");
			System.out.print("\n\t/");
			System.out.print(" \\\n");
			print("YOU ARE DEAD!");
			System.exit(0);
			break;
		default : 
			break;
		}
	}

	/**
	 * @param Scanner console accepts input (System.in)
	 * 
	 * 1v1 calls 2 methods that will start game
	 */
	public static void human(Scanner console){
		wordC(console);
		guess(word, console);


	}
	public static void easy(Scanner console){
		word = cpu[(int)(Math.random()*6)];
		guess(word, console);
	}
	public static void hard(Scanner console){
		word = cpu[(int)(Math.random()*5+4)];
		guess(word, console);
	}
}