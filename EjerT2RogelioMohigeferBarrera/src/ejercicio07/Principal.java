package ejercicio07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*7. Leer un número entero y mostrar su tabla de multiplicar. */

	
	int num=0, multi=0, tope=10, result=0, cero=0;
	
	
	System.out.println("Bienvenido/a");
	do {
		
		System.out.println("\n\nIntroduzca un número entero");
		System.out.println("Introduzca 0 para salir");
		
		multi=0; //reinicimamos el multiplicador. Esto es un reinicio//
		num=Leer.datoInt();	
		
		while (multi<=tope && num!=cero) {
			
			result=multi*num;
			System.out.printf("\n%d x %d = %d", num, multi, result);
			multi++;
		}
		
	}while (num!=cero);
	System.out.println("Gracias, hasta la próxima.");
	
	
	
	
	
	
	
	
	}

}
