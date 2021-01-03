/**********************************************
 * 			Ordenamiento de datos			  *
 * 											  *
 * Metodo de la burbuja:					  *
 * 											  *
 *  Funciona revisando cada elemento de       *		
 *  la lista que va a ser ordenada con		  *
 *  el siguiente intercambiandolos de		  *
 *  posicion si estan en orden equivicado.    *
 *                                    		  *
 * ------------------------------------------ *
 * @author Francisco			      		  *
**********************************************/

package ordenamientos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		metodoBurbuja();
	}

	// Metodo de la burbuja
	@SuppressWarnings("resource")
	public static void metodoBurbuja() {
		// Declaracion de variables
		Scanner entrada = new Scanner(System.in);
		int arregloNumeros[], numeroDeElementos, aux;

		// Pedimos al usuario que nos digite el numero de elementos
		numeroDeElementos = Integer
				.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

		// Asignamos el numero de elementos del arreglo (tamaño)
		arregloNumeros = new int[numeroDeElementos];

		// Iteramos la entrada de elementos en el arreglo -> Metemos los numeros al
		// arreglo.
		for (int i = 0; i < numeroDeElementos; i++) {
			System.out.println((i + 1) + ". Digite un numero: ");
			arregloNumeros[i] = entrada.nextInt();
		}

		// Metodo Burbuja:

		for (int i = 0; i < (numeroDeElementos - 1); i++) {

			// Ordenar datos del arreglox
			for (int j = 0; j < (numeroDeElementos - 1); j++) {

				// si numActual > numSiguiente = cambio
				if (arregloNumeros[j] > arregloNumeros[j + 1]) {

					aux = arregloNumeros[j];
					arregloNumeros[j] = arregloNumeros[j + 1];
					arregloNumeros[j + 1] = aux;
				}

			}

		}

		// Iterar datos ordenados.
		System.out.print("Arreglo ordenado crecientemente: ");
		for (int a = 0; a < numeroDeElementos; a++) {
			System.out.print(arregloNumeros[a] + " ");
		}

		System.out.println("\n");
		// Iterar datos ordenados de manera decreciente
		System.out.print("Arreglo ordenado decrecientemente: ");
		for (int i = (numeroDeElementos - 1); i >= 0; i--) {
			System.out.print(arregloNumeros[i] + "  ");
		}
	}
}
