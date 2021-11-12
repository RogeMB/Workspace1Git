package ejemplo2;

import Lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
	int edad=0;
	double sueldoA=0.0, sueldoB=0.0, sueldoTotal=0.0;
	String nombre;
	
	System.out.println("Ponga su edad");
	edad=Leer.datoInt(); //EL ORDEN ES IMPORTANTISIMO, NO SALDRÁ NADA EN LA PANTALLA SI ESTA LÍNEA VA ANTES QUE LA ANTERIOR//
	System.out.println("Su edad es de "+edad+ "años.");
	
	System.out.println("Vamos a sumar dos sueldos. Introduzca el sueldo A");
	sueldoA=Leer.datoDouble(); //HAY QUE PONER LÍNEA POR LÍNEA GUIANDO AL USUARIO. NO SE PUEDE PONER TODO DE GOLPE.//
	
	System.out.println("Introduzca ahora el sueldo B");
	sueldoB=Leer.datoDouble();
	
	System.out.println("La suma de ambos sueldos es:");
	sueldoTotal=sueldoA+sueldoB;
	System.out.printf("%.2f€ más %.2f€ es igual a %.2f€", sueldoA, sueldoB, sueldoTotal);
	
	System.out.println("\nIntroduzca su nombre completo.");
	nombre=Leer.dato();
	System.out.printf("Su nombre completo es: %s", nombre);
	
	}

}
