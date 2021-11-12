package ejerciciosarrays4;

import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y mostrar el número 
		 * guardado en un lugar que indique el usuario por teclado*/
		
		int tam=10, uno=1, noventaynueve=99, entrada=0, salida=0, posicion=0;
		int [] lista;
		Random r = new Random (System.nanoTime());
		
		System.out.println("Bienvenido al programa,\nEste programa le mostrará una lista de 10 números "
				+ "aleatorios entre el 1 y el 99. Se le pedirá una posición de dicha lista para mostrarla.");
		
		do {
			System.out.println("Pulse cualquier número distinto de 0 para empezar, o 0 para acabar: ");
			entrada=Leer.datoInt();
			lista= new int [tam];
			if (entrada!=salida) {
				/*generación de los números*/
				System.out.println("\nLos números son los siguientes:");
				for(int i=0; i<lista.length; i++) {
					lista [i] = r.nextInt(noventaynueve-uno+1)+uno;
					System.out.print(lista [i]);
					if (i < lista.length -1) {
						System.out.print("; ");
					} else {
						System.out.println(".");
					}
					
				}
				do {
					System.out.println("\nDiga una posición del 1 al 10:");
					posicion=Leer.datoInt();
					if (posicion < uno || posicion > tam) {
						System.out.println("***Número incorrecto, no haga trampas***");
					}
				} while (posicion < uno || posicion > tam);
				
				System.out.printf("\nEl número que ocupa la posición %d "
						+ "es:***%d***\n\n",posicion, lista[posicion-uno]);
			}

		} while (entrada != salida);
		System.out.println("Gracias. FIN.");
	}

}
