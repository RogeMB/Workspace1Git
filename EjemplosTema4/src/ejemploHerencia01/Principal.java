package ejemploHerencia01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "", puesto = "";
		double sueldo = 0, impuesto = 0;
		Trabajador t;
		Empleado e;
		
		
		
		System.out.println("¿Cómo te llamas?");
		nombre = Leer.dato();
		System.out.println("¿Cuál es tu puesto?");
		puesto = Leer.dato();
		
		t = new Trabajador (nombre, puesto);
		
		
		
		System.out.println("¿Cómo te llamas?");
		nombre = Leer.dato();
		System.out.println("¿Cuál es tu puesto?");
		puesto = Leer.dato();
		System.out.print("\n¿Cuánto sueldo ganas? Respuesta: ");
		sueldo = Leer.datoDouble();
		System.out.println("\n¿Cuánto impuesto pagas? Respuesta: ");
		impuesto = Leer.datoDouble();
		
		e = new Empleado (nombre, puesto, sueldo, impuesto);
		

	}

}
