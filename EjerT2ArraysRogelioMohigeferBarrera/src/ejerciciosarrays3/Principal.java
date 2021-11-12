package ejerciciosarrays3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con números leídos por 
	teclado y mostrar la media de todos los elementos y la cantidad de números “cero” introducidos.*/
		
	int ocho= 8, contadorCeros= 0, cero= 0, arranque= 0, cinco= 5, contadorSusp=0;
	double media= 0, suma= 0;
	int enteros [] = new int [ocho];
	
		
	System.out.println("\nBienvenido/a al programa,"); 
	System.out.println("En este programas rellenamos un array con enteros "
				+ "y te devuelve la media y el número de ceros."); 
	do {
		media = 0;
		suma= 0;
		contadorCeros= 0;
		contadorSusp=0;
			
		System.out.println("\nIntroduce cualquier número distinto de cero o 0 para terminar");
		arranque = Leer.datoInt();
		if (arranque != cero) {
		
			for (int i=0; i<enteros.length; i++) {
				System.out.println("Introduce el número " + (i + 1)+":");
				enteros [i] = Leer.datoInt();
				if (enteros [i]==cero) {
					contadorCeros++;
				}
				if (enteros [i]< cinco) {
					contadorSusp++;
				}
				suma = suma + enteros [i];
			}
			media = suma / enteros.length; //divide entre el  tamaño del array en este preciso momento, así que no afecta el tamaño de diez que pusimos arriba//
			System.out.printf("La media es: %.2f, el número de ceros es %d "
				+ "y el número de suspensos es %d.", media, contadorCeros, contadorSusp);
			
		}
	}while (arranque != cero);
	System.out.println("Gracias por elegirnos. Vuelva más pronto que tarde.");
	
	}

}
