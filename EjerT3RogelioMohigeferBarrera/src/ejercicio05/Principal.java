package ejercicio05;

import java.util.Arrays;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear una clase con varios métodos que generen aleatoriamente distintos números o resultados 
		* según las características del sorteo o para qué se vaya a usar, por ejemplo, generar 1, x, 2 para 
		* una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar a los 
		* "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben 
		* todos.*/
		
		int opcion, cero=0, tam=6, numJuga, numPC, sumaJuga, sumaPC, ganadorChinos, 
				parImparJuga, parImparPC;
		Aleatorio a = new Aleatorio ();
		int primitiva [] = new int [tam];
		
		do {
			System.out.println("\nIntroduzca la opción del juego que quiera jugar."
					+ "\n0. Salir. \n1. Quiniela. \n2. Primitiva. \n3. Chinos. \n4. Pares o nones.");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Gracias, hasta pronto.");
				break;
				
			case 1: /* Quiniela*/
				a.imprimirQuiniela();
				break;
				
			case 2: //Primitiva//
				a.calcularPrimitiva(primitiva);
				Arrays.sort(primitiva); /*ordenar los números del array*/
				a.imprimirPrimitiva (primitiva);
				break;
				
			case 3: /*Chinos*/
				System.out.println("Vamos a jugar a los chinos. Yo (PC) elijo un número del 0 al 3 y tú otro. "
						+ "Gana quien acierta la suma de nuestros respectivos números.");
				System.out.println("PC: Voy a elegir mi número entre 0 y 3. \nElige tú el tuyo: ");
				numJuga = Leer.datoInt();
				while (numJuga < 0 || numJuga > 3) {
					System.out.println("Incorrecto, prueba de nuevo.");
					numJuga = Leer.datoInt();
				}
				numPC = a.numeroPC(); //número aleatorio del pc
				
				sumaPC = a.sumaChinosPC(numPC); //suma aleatoria del pc
				
				System.out.println("PC: Yo digo que entre los dos sumamos: "+sumaPC+ ". ¿Y tú qué dices?");
				sumaJuga = Leer.datoInt();
				while (sumaJuga == sumaPC || sumaJuga < 0 || sumaJuga > 6) {
					System.out.println("Incorrecto, no hagas trampas, prueba de nuevo.");
					sumaJuga = Leer.datoInt();
				}
				System.out.println("PC: Mi número era: "+numPC);
				ganadorChinos = a.ganadorChinos(numPC, numJuga, sumaPC, sumaJuga);
				switch (ganadorChinos) {
					case 1:
						System.out.println("Enhorabuena, has ganado tú.");
						break;
					case 2:
						System.out.println("PC: He ganado yo, otra vez será. ");
						break;
					default: 
						System.out.println("No ha ganado nadie.");
				}
				break; 
				
			case 4: 
				System.out.println("Vamos a jugar al Pares o Nones. Yo (PC) elijo un número del 0 al 5 y tú otro. "
						+ "Gana quien acierta si la suma de nuestros respectivos números es par o impar.");
				System.out.println("PC: Voy a elegir mi número entre 0 y 5. \nElige tú el tuyo: ");
				numJuga = Leer.datoInt();
				while (numJuga < 0 || numJuga > 5) {
					System.out.println("No vale ese número, prueba de nuevo.");
					numJuga = Leer.datoInt();
				}
				
				numPC = a.numeroPCdos();
				
				System.out.println("¿Qué eliges, 1 para Nones o 2 para Pares?");
				parImparJuga=Leer.datoInt(); //no hacemos comprobación, damos voto de confianza
				
				if (parImparJuga != 1) {
					parImparPC = 1;
					System.out.println("Vale, yo elijo nones. ¡Pares o nones, una, dos y tres!");
				}else {
					parImparPC = 2;
					System.out.println("Vale, yo elijo pares. ¡Pares o nones, una, dos y tres!");
				}
				
				a.imprimirGanadorParesNones(numPC, numJuga, parImparJuga, parImparPC);
				break;
			
			default: 
				System.out.println("Introduzca una opción correcta.");
			}
			
		}while (opcion != cero);

	}
}
