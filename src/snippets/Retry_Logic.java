/**************************
 * Retry condition snippet*
 * @author Francisco      *
 *************************/
package snippets;

import java.util.Scanner;

public class Retry_Logic {
	
	public static void main(String[] args) {
		
		int count = 0;
		int maxTries = 3;
		Scanner sc = new Scanner(System.in);
		while(true) {
			

			System.out.println("Type a Integer number higher than 3: ");
			try {
				int userInput = Integer.parseInt(sc.next());
				if(userInput > 3) {
					System.out.println("Welldone!");
					break;
				}
			} catch (Exception e) {
				if(++count == maxTries) throw e;
				System.err.println("You only have "+(maxTries-count)+" tries remaining, please enter a integer digit.");
			}
		}
	}

}
