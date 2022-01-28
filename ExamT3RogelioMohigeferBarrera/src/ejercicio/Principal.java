package ejercicio;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, direccion;
		int metrosCuadrados = 0, precioMinimo = 0, precioMaximo = 0, mes = 6, reforma = 0, opcion = 0, salir = 0, ganancia = 10, precioFinal = 0;
		
		Piso p;
		Inmobiliaria inm;
		
		System.out.print("Bienvenido/a, a la agencia inmobiliaria No-sin-mi-Comisión. \nVamos a recopilar datos de su piso. Por favor, ingrese su nombre: ");
		nombre=Leer.dato();
		System.out.print("\nHola, "+nombre+". Ahora ingrese los metros cuadrados de su piso: ");
		metrosCuadrados=Leer.datoInt();
		System.out.print("\nBien. Ahora indique en qué dirección se encuentra su piso: ");
		direccion=Leer.dato();
		System.out.print("\nBien. Ahora indique a qué precio mínimo quiere vender su piso: ");
		precioMinimo = Leer.datoInt();
		System.out.print("\nBien. Ahora indique a qué precio máximo quiere vender su piso: ");
		precioMaximo = Leer.datoInt();
		System.out.println("\nBien. Ahora introduzca un 1 si su piso necesita una reforma o un 2 si no la necesita: ");
		reforma = Leer.datoInt();	
		
		p = new Piso (direccion, metrosCuadrados, reforma, precioFinal);
		inm = new Inmobiliaria ();
		
		do {
			System.out.println("_________________________________________________________________________________________________________");
			System.out.print("\n\nBien, "+nombre+". Ahora puedes realizar las siguientes opciones introduciendo el número que quieras por teclado: \n\t0. Salir.\n\t1. Consultar "
					+ "historial de precios de los últimos seis meses.\n\t2. Calcular el precio final de venta de un mes concreto.\n\t3. Calcular el precio por metro cuadrado."
					+ "\n\t4. Cambio del precio de euros a libras esterlinas.\n\t5. Imprimir datos de su piso.");
			switch (opcion) {
			case 0:
				if (opcion==salir) {
					System.out.println("\n\tGracias por su confianza. No dude en consultarnos cualquier duda en el futuro. ¡Hasta pronto!");
				}
				break;
			case 1:
				System.out.println("\nEste es su historial de precios de los últimos seis meses con los rangos que puso: ");
				inm.generarPrecios(precioMinimo, precioMaximo, mes);
				System.out.println(inm.getHistorialPrecios());
				break;
			case 2:
				System.out.println("\nVamos a calcular el precio de venta con nuestra comisión, que es de "+ganancia);
				inm.generarPrecioFinal (ganancia);
				System.out.println(inm.getPrecioFinal());
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("\nVamos a calcular el precio por metro cuadrado, que ha indicado que son: "+metrosCuadrados);
				;
				inm.imprimirPrecioMetro(inm.calcularPrecioMetro (metrosCuadrados));
				break;
			case 5:
				p.reforma(reforma);
				System.out.println(p);
				break;
			default: 
				System.out.println("\n\t***ERROR.*** Por favor, introduce una opción válida.\n_______________________________________________________________________________");
			}
			
		} while (opcion != salir);
		
	
	}

}
