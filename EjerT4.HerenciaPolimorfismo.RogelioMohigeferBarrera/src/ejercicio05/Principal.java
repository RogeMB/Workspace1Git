package ejercicio05;

import lectura.Leer;

public class Principal {
	public static void main(String[] args) {
		int i,j;	// índices para bucles
		
		// Creamos la oficina:
		Oficina o = new Oficina();
		
		System.out.println("\t*** Bienvenido al programa de prueba ***\n");
		System.out.println("Acabamos de crer la Oficina.\nAhora vamos a crear:");
		System.out.println("\tDos empleados a comisión, con sueldos de 1400€ y 5% de comisión sobre ventas.");
		System.out.println("\tDos empleados fijos, con sueldos de 1500€ y 20% de retención.");
		System.out.println("\tUn empleado genérico, con sueldo de 1600€");
		pausa();
		
		// Añadimos dos empleados a comisión:
		o.CrearEmpleadoAComision("Andrés", 1400, 5);
		o.CrearEmpleadoAComision("Ana", 1400, 5);
		// Añadimos dos empleados fijos:
		o.CrearEmpleadoFijo("Noah", 1500, 20);
		o.CrearEmpleadoFijo("Carlota", 1500, 20);
		// Añadimos un empleado genérico:
		o.CrearEmpleadoGenerico("Javier", 1600);
		// Listamos los empleados:
		o.listarEmpleados();
		
		System.out.println("\nAhora, añadiremos 10 ventas de 500€ a cada empleado,"
				+ " y una venta de 5000€ al segundo empleado a comisión.");
		for (i = 0; i<o.getNumEmpleados(); i++) {
			for (j=0;j<10;j++) {
				o.setNuevasVentas(o.getEmpleado(i), 1000);		
			}
		}
		o.setNuevasVentas(o.getEmpleado(1), 5000);
		pausa();
		o.listarEmpleados();
		
		System.out.println("\nPor último, veremos la situación global de la oficina.");
		pausa();
		
		System.out.println("SITUACIÓN ACTUAL DE LA OFICINA ==============================");
		System.out.println("Número de empleados: " + o.getNumEmpleados());
		System.out.println("Gastos totales en sueldos base: " + o.calcularTotalSueldosBases());
		System.out.println("Gastos totales en comisiones: " + o.calcularGastosComisiones());
		System.out.println("Retenciones totales: " + o.calcularRetenciones());
		System.out.println("Suma de sueldos finales: " + o.calcularSueldosNetosFinales());
		System.out.println("=============================================================");
		
		System.out.println("\n\t*** FIN DEL PROGRAMA DE PRUEBA. Gracias. ***");
	}
	
	public static void pausa() {
		System.out.println("Pulse INTRO para continuar...");
		Leer.dato();
	}
}
