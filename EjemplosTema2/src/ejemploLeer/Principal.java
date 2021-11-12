package ejemploLeer;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
	
		String apellidos; //Podemos meter números también. Siempre que no operemos con ellos.//
		int edad=0;  
		double sueldo=0.0;
		
		
		System.out.println("Hola, introduzca sus apellidos");
			
		apellidos=Leer.dato(); //Funciona en la pantalla escribiendo los apellidos y dándole a "Enter".//
		System.out.println("Tus apellidos son: "+apellidos);
		
		System.out.println("Ahora diga su edad");
		
		edad=Leer.datoInt(); //aquí no se pueden poner letras porque es un Int.//
		System.out.println("Tu edad es: "+edad+"años");
		
		System.out.println("¿Cuánto cobra?");
		sueldo=Leer.datoDouble();
		System.out.printf("Su sueldo es de: %.2f€", sueldo);
	
	}

}
