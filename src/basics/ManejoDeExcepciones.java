/*******************************************************
 * 					Manejo de Excepciones			   *
 * 													   *
 * La forma en la que el programador trate la anomalia *
 * es lo que se conoce generalmente como manejo de 	   *
 * excepciones.  						  			   *
 * 													   *
 * @author Francisco								   *
 ******************************************************/

package basics;

import java.util.Scanner;

public class ManejoDeExcepciones {

	
	public static void main(String[] args) {
		
		int x, y, res;
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Ingrese el primer valor: ");
		//x = sc.nextInt();
		
		//System.out.println("Ingrese el segundo valor: ");
		//y = sc.nextInt();
		
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		
		sc.close();
		
		System.out.println("Next int: " + i);
		System.out.println("Next double: " + d);
		System.out.println("Next String: " + s);
		
		
	}
}
