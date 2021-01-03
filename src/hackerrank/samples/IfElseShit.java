package hackerrank.samples;

import java.util.Scanner;

public class IfElseShit {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Sample data #1: 3 - should be = weird
		// Sample data #2: 24 - should be = not weird

		System.out.println("Enter an Integer number: ");
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // ignore char values and shit
		scanner.close();
		String ans = "";

		if (n % 2 == 1) {
			ans = "Weird";
		} else if (n >= 2 && n <= 5) {
			ans = "Not Weird";
		} else if (n >= 6 && n <= 20) {
			ans = "Weird";
		} else {
			ans = "Not Weird";
		}
		System.out.println(ans);
		
		
		// El primer valor da weird porque entra en la primer condicion porque 3 no es numero par
		// El segundo valor da not weird porque 24 es mayor que 2 a 5, entonces encaja en el ultimo else.

	}

}
