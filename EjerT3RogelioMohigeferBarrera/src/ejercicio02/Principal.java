package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementar un programa que contenga dos métodos en una clase “operaciones”: un método al
		 * que se le pase un número entero y diga si este es positivo o negativo y otro que diga si un número
		 * es par o impar. La clase no debe tener ningún atributo. Se deben probar los métodos en el main.*/
		int numero, salir, cero = 0;
		Operaciones op = new Operaciones ();
		String Paridad ="";
		
		
		do {
			System.out.println("Introduzca un número entero positivo: ");
			numero = Leer.datoInt();
			
			if (op.esPar(numero))
				Paridad = "Par";
				
			else Paridad = "Impar";
				
			System.out.println("El " +numero+" es "+Paridad+".");
			
			System.out.println("\nIntroduzca otro número entero: ");
			numero = Leer.datoInt();
			
			System.out.println("El " +numero+" es "+op.esPos(numero)+".");
			
			System.out.println("¿Desea repetir? Introduzca 0 para salir o cualquier número para continuar");
			salir=Leer.datoInt();
		} while (salir != cero);
		
		System.out.println("Gracias, hasta pronto.");

		
		
	}

}
