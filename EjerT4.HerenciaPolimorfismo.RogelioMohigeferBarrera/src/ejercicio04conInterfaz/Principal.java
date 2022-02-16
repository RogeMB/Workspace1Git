/**
 * Este paquete contiene un programa sencillo para generar un ticket de productos de un supermercado,
 *  con las siguientes clases.
 */
package ejercicio04conInterfaz;

import java.time.LocalDate;
import lectura.Leer;
/**
 * 
 * @author Rogelio Mohigefer, Pepito Pérez
 * @version JDK 11
 *
 */
public class Principal {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String empleado;
		Producto listaProductos [];
		Venta v;
		
		int numTicket = 0, tam = 5, opcion, cero = 0;
		double variacion = 10;
				
		
		System.out.println("\t=== Bienvenido al programa de prueba ===\n");
		System.out.println("Comenzamos creando un array de " + tam + " productos.");
		System.out.println("Los productos de Electrónica serán cargados con un impuesto del " + variacion + "%");
		System.out.println("Los productos de Almimentación a los que les queden menos de 2 días para caducar, tendrán "
				+ "un descuento del 50%");
		
		listaProductos = new Producto[tam];
		
		listaProductos[0] = new Alimentacion ("Pipas", 1, 1.50, 100, LocalDate.of(2022, 3, 28));
		listaProductos[1] = new Alimentacion ("Patatas", 2, 2.50, 70, LocalDate.of(2022, 3, 28));
		listaProductos[2] = new Alimentacion ("Yogurt", 3, 2.50, 70, LocalDate.of(2022, 2, 16));
		listaProductos[3] = new Electronica ("Televisor PX3", 450, 300, 5, "Panasonic");
		listaProductos[4] = new Ropa ("Camiseta", 54, 20, 50, 34);
		
		System.out.println("\nCreamos, a continuación, un objeto Venta, que será el ticket");
		numTicket ++;
		v = new Venta("Andrés", numTicket, listaProductos);
		
		System.out.println("Le añadimos varios productos, que constituirán las líneas del ticket.");
		
		v.addLineaVenta(1, listaProductos[3]);
		v.addLineaVenta(6, listaProductos[2]);
		v.addLineaVenta(3, listaProductos[0]);	
		v.addLineaVenta(2, listaProductos[4]);
		
		System.out.println("Y con ello, damos la inicialización por completada.");
		pausa();
		
		do {
			System.out.println("\n\n*** MENÚ PRINCIPAL ***");
			System.out.println("Elija una opción:");
			System.out.println("\t0. Salir.");
			System.out.println("\t1. Imprimir ticket de venta.");
			System.out.println("\t2. Imprimir listado de productos.");
			System.out.println("\t3. Cambiar nombre del empleado.");
			System.out.print("Respuesta: ");
			opcion = Leer.datoInt();
			System.out.println();
			
			switch (opcion) {
				case 0: {
					System.out.println("*** Gracias por usar el programa ***");
					break;
				}
				case 1: {
					v.imprimirTiquet(variacion);
					break;
				}
				case 2: {
					v.imprimirTodosLosProductos();
					break;
				}
				case 3: {
					System.out.print("Introduzca el nombre del empleado que hace la venta: ");
					empleado = Leer.dato();
					v.setEmpleado(empleado);
					break;
				}
			}
		} while (opcion != cero);
				
	}
	
	public static void pausa() {
		System.out.print("Pulse Intro para continuar...");
		Leer.dato();
	}

}

