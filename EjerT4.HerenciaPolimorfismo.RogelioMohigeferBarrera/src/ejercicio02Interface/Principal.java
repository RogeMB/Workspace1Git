package ejercicio02Interface;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Construir una clase ArrayReales que declare un atributo de tipo double[] num, lo rellene
			aleatoriamente y que implemente una interfaz llamada Estadisticas. El contenido de esta interfaz es el
			siguiente:

			public interface Estadisticas {
			double calcularMinimo( );//Devuelve el menor número del array
			double calcularMaximo( );//Devuelve el mayor número en el array
			double calcularSumatorio( );//Devuelve la suma de los elementos del array
			}
		 */
		
		int min, max, tama, opcion=0, salir=0;
		
		double num []; 
		
		ArrayReales ar;
		
		
		System.out.println("Bienvenido al programa");
		
		System.out.print("Vamos a crear el array. Diga el máximo: ");
		max = Leer.datoInt();
		System.out.print("Diga el mínimo: ");
		min = Leer.datoInt();
		System.out.print("Diga el tamaño del array: ");
		tama = Leer.datoInt();

		num = new double [tama];
		
		ar = new ArrayReales (num);
		
		ar.rellenarArray(max, min);
		
		do {
			imprimirMenu ();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("Hasta luego.");
				break;
			case 1:
				System.out.println("\nEl máximo del array es: " +  ar.calcularMaximo());
				break;
			case 2:
				System.out.println("\nEl mínimo del array es: " + ar.calcularMinimo());
				break;
			case 3:
				System.out.println("\nLa suma del array es:  " + ar.calcularSumatorio());
				break;
			case 4:
				System.out.println("\nEl array es: ");
				ar.mostrarArray();
				break;
			default:
				System.out.println("Diga opción correcta.");
			}
		}while (opcion != salir);
	
		
	}
	
	// helpers
	
	public static void imprimirMenu () {
		System.out.print("\n\nMenú: Pulse 0 para salir."
				+ "\nPulse 1 para calcular el máximo del array."
				+ "\nPulse 2 para calcular el mínimo del array."
				+ "\nPulse 3 para calcular la suma del array."
				+ "\nPulse 4 para mostrar el array."
				+ "\nRespuesta: ");
		
	}
}
