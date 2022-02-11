package ejercicio01Interface;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		double sueldo, precio;
		int iva;
		Producto p;
		Trabajador t;
		
		
		imprimirBienvenida();
		System.out.print("Ingrese su nombre: ");
		nombre = Leer.dato();
		System.out.print("Ingrese su sueldo: ");
		sueldo = Leer.datoDouble();		
		t = new Trabajador (nombre, sueldo);
		
		System.out.println("Ahora vamos a calcular cuánto tiene que pagar de IRPF.");
		t.calcularTramo();
		System.out.println("Va a pagar de IRPF: " + t.calculoIrpf(sueldo) + "€.");
		sueldo -= t.calculoIrpf(sueldo);
		System.out.println(t);
		System.out.println("Su sueldo neto es: " + sueldo + "€.");
		
		
		
		System.out.print("\nVamos a calcular el precio del producto con el IVA. Ingrese el IVA aplicable: ");
		iva = Leer.datoInt();
		System.out.print("Bien. Ahora ingrese el precio del producto en euros: ");
		precio = Leer.datoDouble();
		p = new Producto (precio, iva);
		
		System.out.println(p);
		System.out.println("El precio del producto con el IVA aplicado es: " + p.calculoIva(precio, iva) + "€.");
		
	
		
	}



// Helpers

public static void imprimirBienvenida () {
	System.out.println("\t\tBIENVENIDO AL PROGRAMA IMPUESTABLE");
	}
}
