/*****************************************
 * 	Metodo de ordenamiento por insercion *
 *  @author Francisco 					 *
 ****************************************/
package ordenamientos;

import javax.swing.JOptionPane;

public class MetodoInsercion {

	public static void main(String[] args) {
		ordenaminetoPorInsercion();
	}

	public static void ordenaminetoPorInsercion() {

		// Declaracion de variables
		int numArray[], numElementos, posicion, aux;

		// Pedimos el numero de elementos que contendra el arreglo
		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de elementos del arreglo: "));

		// Inicializamos el arreglo con el numero de elementos.
		numArray = new int[numElementos];

		// Pedimos los elementos que contendra el arreglo
		for (int k = 0; k < numElementos; k++) {
			numArray[k] = Integer
					.parseInt(JOptionPane.showInputDialog("> Ingrese el valor del elemento " + (k + 1) + " : "));
		}
			
		// Ordenamiento por insercion		
		for(int i =0; i < numElementos; i++) {
			posicion = i;
			aux = numArray[i]; // este axuliar me permite refrescar los valores ordenados.
			
			// Al inicio, la primer posicion no tiene izquierda con quien comparar
			// Entonces que la posicion sea mayor que cero, para que tenga valor a la izquierda que comparar.
			// La posicion inicial siempre es 0, por eso decimos que tiene que ser mayour que 0 
			
			// Si el numero de la izquierda (indice actual - 1) es > numero actual (aux) entonces cambio
			// Pocicion indica donde va el indice en el recorrido.
			while((posicion > 0) && (numArray[posicion-1] > aux)) {
				
				numArray[posicion] =  numArray[posicion - 1]; // movemos valor de la izquierda al actual.ats
				
				posicion --; // esto nos permite volver a recorrer valores para validar si estan ordenados.
			}
			
			numArray[posicion] = aux; // esto permite re-establecer el orden el puntero actual.
		}
		
		// Iterar los elementos en orden ascendente
		System.out.println("Todos los numeros del arreglo ordenados de manera ascendente: \n");
		for(int elemento : numArray) {
			System.out.print(elemento + "  ");
		}
		
		// Iterar elementos en orden Descendente
		System.out.print("\n\nTodos los elementos ordenados de manera descendente: \n");
		for(int j = (numElementos - 1); j >= 0; j--) {
			System.out.print(numArray[j] + "  ");
		}
	}
}
