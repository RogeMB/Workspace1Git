package ejerciciosarrays5;

import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear un programa que realice lo siguiente:
			• Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.*/
		
		int lista [];
		int ranMax=0, ranMin=0, suma=0, mayor=0, menor=0, tam=0;
		boolean repetir = true;
		Random r = new Random (System.nanoTime());
		
		do {
			suma =0;
			System.out.println("Bienvenido/a, \nEste programa le da la suma, el mayor y el menor número generado");
			System.out.println("Introduzca la longitud del array, o -1 para salir");
			
			tam = Leer.datoInt();
			if (tam !=-1) {
				lista = new int [tam];
				System.out.println("Introduzca el límite mínimo posible");
				ranMin=Leer.datoInt();
				
				System.out.println("Introduzca el límite máximo posible");
				ranMax= Leer.datoInt();
				
				//menor=ranMin;
				//mayor=0;
				System.out.println("La lista de números es:");
				for (int i=0; i<lista.length; i++) {
					lista[i] = r.nextInt(ranMax-ranMin+1)+ranMin;
					System.out.print("\t"+lista[i]);
					if (i==0) {
						menor=lista[i];
						mayor=lista[i];
					}else {
						if (lista [i] < menor) {
							menor =lista [i];
						}
						if (lista[i] > mayor) {
							mayor = lista[i];
						} //no es necesario poner llaves en los if que solo tengan una línea después//
					}
					suma = suma + lista[i];
					
				}
				System.out.printf("\n\nLa suma de todos los números %d, el máximo es %d "
						+ "y el mínimo es %d \n\n", suma, mayor, menor);
				
			}else {
				repetir = false;
			}
			
		}while (repetir);
		System.out.println("FIN");
	}

}
