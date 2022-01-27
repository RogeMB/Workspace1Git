package ejemploHerencia01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas = 0, tope = 8/*horas*/;
		String nombre = "", puesto = "";
		double sueldo = 0, impuesto = 0, tarifa = 0.0;
		Trabajador t;
		Empleado e;
		Consultor c;
		
		
		System.out.println("TRABAJADOR");
		System.out.print("¿Cómo te llamas? Respuesta: ");
		nombre = Leer.dato();
		System.out.print("¿Cuál es tu puesto? Respuesta: ");
		puesto = Leer.dato();
		
		t = new Trabajador (nombre, puesto);
		
		
		System.out.println("EMPLEADO");
		System.out.print("¿Cómo te llamas? Respuesta: ");
		nombre = Leer.dato();
		System.out.print("¿Cuál es tu puesto? Respuesta: ");
		puesto = Leer.dato();
		System.out.print("¿Cuánto sueldo ganas? Respuesta: ");
		sueldo = Leer.datoDouble();
		System.out.println("¿Cuánto impuesto pagas? Respuesta: ");
		impuesto = Leer.datoDouble();
		
		e = new Empleado (nombre, puesto, sueldo, impuesto);
		
		System.out.println("CONSULTOR");
		System.out.print("¿Cómo te llamas? Respuesta: ");
		nombre = Leer.dato();
		System.out.print("¿Cuál es tu puesto? Respuesta: ");
		puesto = Leer.dato();
		System.out.print("¿Cuántas horas trabajas? Respuesta: ");
		sueldo = Leer.datoDouble();
		System.out.println("¿Cuánto cobras por horas? Respuesta: ");
		impuesto = Leer.datoDouble();
		
		c = new Consultor (nombre, puesto, horas, tarifa);
		
		c.avisarHorasExtra(tope);
		
		System.out.println(t);
		System.out.println("--------------------------------------------------------------");
		System.out.println(e);
		System.out.println("--------------------------------------------------------------");
		System.out.println(c);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Paga del trabajador: " +t.calcularPaga());
		System.out.println("Paga del empleado: " +e.calcularPaga());
		System.out.println("Paga del consultor: " +c.calcularPaga());
		
	}
}
