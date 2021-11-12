package ejemploFor;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope=0, tope2=0;
		String nombre;
		
		System.out.println("¿Cuántas veces quieres escribir tu nombre?");
		tope=Leer.datoInt();
		System.out.println("Diga su nombre");
		nombre=Leer.dato();
				
		for (int i=0; i<tope; i++) {
			System.out.println("Número "+(i+1)+": "+nombre);
			System.out.println("¿Cuántas veces quiere que se imprima hola?");
			tope2=Leer.datoInt();
			for (int j=0;j<tope2; j++) {
				System.out.println("¡Hola!");
				
			}
		
		}
	System.out.println("\n\t\t¡FIN!");
	
	
	}

}
