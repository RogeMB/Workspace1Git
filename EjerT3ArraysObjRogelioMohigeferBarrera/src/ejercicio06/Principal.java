package ejercicio06;

import lectura.Leer;

public class Principal {
	public static void main(String[] args) {
		int numFilas, butacasPorFila, precio, opcion, salir = 0, fila, butaca;
		String pelicula;
		boolean hayLibres;
				
		System.out.println("\t\t*******===CINEMA PARADISO===******* ");
		System.out.println("\t_____Comienzo proceso de inicialización_____");
		
		do {
			System.out.print("Introduzca el precio de la entrada: ");
			precio = Leer.datoInt();	
		} while (precio <= 0);
		
		do {
			System.out.print("Introduzca el número de filas de la sala: ");
			numFilas = Leer.datoInt();	
		} while (numFilas <= 0);
		
		do {
			System.out.print("Introduzca el número de butacas por cada fila: ");
			butacasPorFila = Leer.datoInt();
		}while (butacasPorFila <= 0); 
			
		System.out.print("Introduzca el nombre de la película que se proyecta: ");
		pelicula = Leer.dato();
		
		
		Sala s = new Sala(1, numFilas, butacasPorFila, precio, pelicula);
		System.out.println(" ***PROCESO DE INIZIALIZACIÓN COMPLETADO*** ");

		
		do {
			System.out.println("\n\nMENÚ PRINCIPAL --------------------------------------------------------------------");
			System.out.println("\t0. Salir."
					+ "\n\t1. Ver Cartelera."
					+ "\n\t2. Comprar una entrada."
					+ "\n\t3. Ver recaudación."
					+ "\n\t4. Cambiar la película en proyección."
					+ "\n\t5. Ver el precio de la entrada."
					+ "\n\t6. Modificar el precio de las entradas."
					+ "\nRespuesta: ");
			
			opcion = Leer.datoInt();
			System.out.println();  //solo para dejar una línea de espacio en blanco
			
			switch (opcion) {
				case 0:
					System.out.println("  ***GRACIAS POR SU CONFIANZA. PROGRAMA TERMINADO***");
					break;
				
				case 1:
					System.out.println("Película en proyección: " + s.getPelicula());
					break;
				
				case 2: 
					//Proceso de venta de entradas: Preguntamos la fila y miramos si hay butacas libres en la fila
					if (s.hayButacas()) {
						do {
							do {
								numFilas = s.getNumFilas();
								System.out.print("¿De qué fila quiere las entradas (0 a " + (numFilas-1) + ")?: ");
								fila = Leer.datoInt();
							} while (fila < 0  || fila > numFilas-1);
							
							//Ver si hay butacas libres en la fila e imprimirlas
							hayLibres = s.imprimeButacasLibresOcupadas(fila);
							if (hayLibres) {
								//Vender una entrada de la fila
								System.out.print("¿Qué butaca de la fila " + fila +" desea comprar (no válido para "
										+ "cancelar): ");
								butaca = Leer.datoInt();
								if (butaca >=0 && butaca < butacasPorFila) {
									if (s.isLibre(fila, butaca)) {
										s.vender(fila, butaca);  //Se vende la localidad
										System.out.println("Se le asigna la butaca "+butaca+" de la fila "+fila);
										System.out.println("Disfrute de la película\n");	
									} else {
										System.out.println("\t***ERROR***. Venta cancelada (localidad ocupada)");
									}	
								} else {
									System.out.println("\t***ERROR***. Venta cancelada (butaca no válida)");
								}
							} else
								System.out.println("***ERROR***. Fila ocupada: elija otra fila.");
						} while (!hayLibres);
					} else {
						System.out.println("***ERROR***. Lo sentimos: la sala está llena");
					}
					break;
				
				case 3: 
					System.out.println("Recaudación actual: "+s.getRecaudacion()+"€");
					break;
				
				case 4:
					System.out.println("Película en proyección: " + s.getPelicula());
					System.out.print("Título de la película en proyección: ");
					pelicula=Leer.dato();
					s.setPelicula(pelicula);
					break;
				
				case 5: 
					System.out.println("El precio de la entrada es de " + s.getPrecio() + "€");
					break;
					
				case 6: 
					System.out.println("El precio de la entrada es de " + s.getPrecio() + "€");
					do {
						System.out.print("Introduzca el nuevo precio de la entrada: ");
						precio = Leer.datoInt();	
					} while (precio <= 0);
					s.setPrecio(precio);
					break;
				default: 
					System.out.println("\n\t***ERROR***. Ingrese una opción válida");
			}
			
		} while (opcion != salir);
	}
}
