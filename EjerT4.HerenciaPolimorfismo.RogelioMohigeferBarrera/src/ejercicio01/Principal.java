package ejercicio01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear un programa con una clase ordenador que permita modelar uno con características como
			capacidad de disco duro, frecuencia del procesador, precio base, etc. Crear dos clases hijas, llamadas
			Tablet y Portátil. Añadir a tablet el atributo para el precio del seguro de la pantalla y al portátil, un
			descuento de oferta en forma de porcentaje.
			La clase madre debe tener un método para calcular el precio de venta al público aplicando un % de
			ganancia del vendedor al precio base. Este método se debe reescribir en las clases hijas sumando el
			extra de la tablet por el seguro y al portátil calculando el precio con el descuento por estar de oferta.
			Crear un main sencillo (no es necesario crear menú) para comprobar todo, basta llamar a los métodos
			en orden adecuado y mostrar el resultado de los cálculos que hace cada uno, es decir, el precio de venta
			al público de un objeto de cada tipo (un ordenador, una tablet y un portátil).
		 * */
		
		int cero = 0;
		int descuento = 0, comision = 0, opcion = 0, salir = 0; 
		double capacidadDiscoDuro, precioBase, frecuenciaProcesador, precioSeguroPantalla;
		
		Ordenador o;
		Tablet t;
		Portatil p;
		
		System.out.println("\t\tBienvenido/a al programa");
		
		do {
			Principal.imprimirMenu();
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 0:
					System.out.println("\t\t    Gracias, hasta pronto."
							+ "\n\t\t======PROGRAMA TERMINADO======");
					break;
				case 1:
					System.out.print("Introduzca, por favor, la capacidad del disco duro del ordenador: ");
					capacidadDiscoDuro = Leer.datoDouble();
					System.out.print("Introduzca, por favor, la frecuencia del procesador del ordenador: ");
					frecuenciaProcesador = Leer.datoDouble();
					System.out.print("Introduzca, por favor, el precio base del ordenador: ");
					precioBase = Leer.datoDouble();
					
					o = new Ordenador (capacidadDiscoDuro, frecuenciaProcesador, precioBase);
					
					do {
						Principal.imprimirComision();
						comision=Leer.datoInt();
						if (comision < cero) 
							System.out.println("\t***ERROR***Introduzca un valor válido.");
						
					}while (comision < cero);
					
					o.setPrecioBase(o.calcularPrecioFinal(comision));
					System.out.println(o);
					break;
					
				case 2:
					System.out.print("Introduzca, por favor, la capacidad del disco duro de la tablet: ");
					capacidadDiscoDuro = Leer.datoDouble();
					System.out.print("Introduzca, por favor, la frecuencia del procesador de la tablet: ");
					frecuenciaProcesador = Leer.datoDouble();
					System.out.print("Introduzca, por favor, el precio base de la tablet: ");
					precioBase = Leer.datoDouble();
					System.out.print("Introduzca, por favor, el precio del seguro de la pantalla de la tablet: ");
					precioSeguroPantalla = Leer.datoDouble();
					
					t = new Tablet (capacidadDiscoDuro, frecuenciaProcesador, precioBase, precioSeguroPantalla);
					
					do {
						Principal.imprimirComision();
						comision=Leer.datoInt();
						if (comision < cero) 
							System.out.println("\t***ERROR***Introduzca un valor válido.");
						
					}while (comision < cero);
					
					t.setPrecioBase(t.calcularPrecioFinal(comision));
					System.out.println(t);
					break;
					
				case 3:
					System.out.print("Introduzca, por favor, la capacidad del disco duro del portátil: ");
					capacidadDiscoDuro = Leer.datoDouble();
					System.out.print("Introduzca, por favor, la frecuencia del procesador del portátil: ");
					frecuenciaProcesador = Leer.datoDouble();
					System.out.print("Introduzca, por favor, el precio base del portátil: ");
					precioBase = Leer.datoDouble();
					System.out.print("Introduzca, por favor, el descuento de venta (porcentaje) sobre el precio "
							+ "del portátil: ");
					descuento = Leer.datoInt();
					
					p = new Portatil (capacidadDiscoDuro, frecuenciaProcesador, precioBase, descuento);
					
					do {
						Principal.imprimirComision();
						comision=Leer.datoInt();
						if (comision < cero) 
							System.out.println("\t***ERROR***Introduzca un valor válido.");
						
					}while (comision < cero);
	
					p.setPrecioBase(p.calcularPrecioFinal(comision));
					System.out.println(p);
					break;
					
					default:
						System.out.println("\t***ERROR***. Diga una opción válida.");
			}
			
		}while (opcion != salir);

	}
	
	//Helpers
	public static void imprimirMenu () {
		System.out.print("\n\t---Proceso de instanciación iniciado---\n¿Qué objeto quiere crear?"
				+ "\n\t Pulse 0 para salir del programa."
				+ "\n\t Pulse 1 para un ordenador."
				+ "\n\t Pulse 2 para una tablet."
				+ "\n\t Pulse 3 para un portátil."
				+ "\nRespuesta: ");		
		
	}
	
	public static void imprimirComision () {
		System.out.print("\nIntroduzca la comisión de venta del producto, a partir de 0 (sin comisión) "
				+ "en adelante (sea cauto)."
				+ "Respuesta: ");
	}

}
