package ejerciciosarrays4version2;

import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Rellenar un array unidimensional de las posiciones que quiera con números aleatorios entre lo que quiera y lo que quiera y mostrar el número 
		 * guardado en un lugar que indique el usuario por teclado*/
		
		int desde=0, hasta=0, tam=0, opt=0;
		int [] lista; //primero declaramos el array//
		Random r= new Random (System.nanoTime());
		
		System.out.println("Bienvenido/a,");		
		do {	
			System.out.println("Diga la cantidad de números a generar. Pulse 0 para acabar.");
			tam=Leer.datoInt();
			if (tam>1) {
				lista= new int [tam]; //luego instanciamos el array//
		
				System.out.println("\nDiga el límite inferior de los números a generar: ");
				desde=Leer.datoInt();
		
				System.out.println("\nAhora diga el límite superior de los números a generar: ");
				hasta=Leer.datoInt();
	
				//rellenamos el array con aleatorios//
				for (int i=0; i<lista.length; i++) {
					lista[i]=r.nextInt(hasta-desde+1)+desde;
				}
				//mostramos todo///
				for (int i=0; i<lista.length;i++) {
					System.out.print("\t"+lista[i]);
				}
				//En realidad, el programa solo pide que mostremos esto//
				System.out.println("\nDiga la posición que quiere ver: ");
				opt=Leer.datoInt();
				if (opt<lista.length+1) {
					System.out.println("------La posición es: "+lista[opt-1]+".-------\n");	
				}else {
					System.out.println("***Posición incorrecta.***\n");
				}
			}
		}while (tam!=0);
	System.out.println("FIN del programa.");
	}

}
