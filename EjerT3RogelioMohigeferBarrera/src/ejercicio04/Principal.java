package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que lea un texto del teclado y un número entero y muestre en pantalla
		* dicho texto una cantidad de veces igual al número introducido. La clase se puede llamar
		* "Copiado".*/
		
		String texto = "";
		int copias;
		
		System.out.println("Bienvenido/a, \nIntroduzca el texto que quiera: ");
		texto = Leer.dato();
		
		System.out.println("\nBien, ahora introduzca el número de veces (sin decimales)"
				+ " que quiera que se repita el texto: ");
		copias = Leer.datoInt();
		
		Copiado Cop = new Copiado (texto, copias);
		Cop.ImprimirTexto ();
		
		System.out.println("Gracias, hasta pronto.");
	}
}
