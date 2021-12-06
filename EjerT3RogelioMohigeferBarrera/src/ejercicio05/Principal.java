package ejercicio05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear una clase con varios métodos que generen aleatoriamente distintos números o resultados 
		* según las características del sorteo o para qué se vaya a usar, por ejemplo, generar 1, x, 2 para 
		* una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar a los 
		* "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben 
		* todos.*/
		
		int opcion, cero=0;
		Aleatorio al = new Aleatorio ();
		
		do {
			System.out.println("\nIntroduzca la opción del juego que quiera jugar."
					+ "\n0. Salir. \n1. Quiniela. \n2. Primitiva. \n3. Chinos. \n4. Pares o nones.");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Gracias, hasta pronto.");
				break;
			case 1: /* Quiniela*/
				al.imprimirQuiniela();
				break;
			case 2: //Primitiva 
				
			
			case 3:
			
				break; 
			case 4: 
				
				break;
			default: 
				System.out.println("Introduzca una opción correcta.");
			}
			
		}while (opcion != cero);

	}
}
