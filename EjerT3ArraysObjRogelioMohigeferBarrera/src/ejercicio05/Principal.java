package ejercicio05;

import lectura.Leer;

public class Principal {
	public static void main(String[] args) {
		int numeroElectrodomesticos, opcion, salir = 0, nE;
		char consumoEnergetico;
		String color;
		double peso, precioBase;
		
		System.out.println("\t\t=======TIENDA DE ELECTRODOMÉSTICOS MEDIAMARCA=======");
		System.out.println("-------Inicio proceso de inicialización------");
		
		do {
			System.out.print("\nIndique cuántos electrodomésticos va a introducir: ");
			numeroElectrodomesticos = Leer.datoInt();	
		} while (numeroElectrodomesticos <= 0);
		Tienda t = new Tienda(numeroElectrodomesticos);	
														
		System.out.println("\nVamos a introducir todos los electrodomésticos "
				+ "\nSi algún valor se deja en blanco, se sustituirá por su valor por defecto,"
				+ " \nque es el primero de la lista.");
		for (int i=0;i<numeroElectrodomesticos;i++) {
			System.out.println("\nElectrodoméstico " + i + ":");
			System.out.print("Color (blanco/ negro / rojo / azul / gris): ");
			color=Leer.dato();
			System.out.print("Consumo energético (F a A): ");
			consumoEnergetico = Leer.datoChar();
			System.out.print("Peso (el valor por defecto es 5, pero no se puede dejar en blanco): ");
			peso = Leer.datoDouble(); 
			System.out.print("Precio base (el valor por defecto es 100, pero no se puede dejar en blanco): ");
			precioBase = Leer.datoDouble();
			t.nuevoElectrodomestico(precioBase, color, consumoEnergetico, peso);
		}
		System.out.println("-------INICIALIZACIÓN COMPLETA--------\n");
		

		do {
			System.out.println("\n\nMENÚ PRINCIPAL --------------------------------------------------------------------");
			System.out.println("\t0. Salir."
					+ "\n\t1. Listar los electrodomésticos."
					+ "\n\t2. Calcular el precio final de un electrodoméstico concreto."
					+ "\n\t3. Suma de los precios finales de todos los electrodomésticos de la tienda."
					+ "\n\t4. Ver el precio medio de los electrodomésticos."
					+ "\nRespuesta:");
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 0:
					System.out.println("\n\t***GRACIAS POR SU CONFIANZA. MEDIAMARCA, yo soy mediotonto***");
					break;

				case 1:
					t.listaElectrodomesticos();
					break;
					
				case 2:
					t.listaElectrodomesticos();
					System.out.print("Indique el número del electrodoméstico: ");
					nE = Leer.datoInt();
					if (nE >= 0 && nE <= numeroElectrodomesticos) {
						System.out.println("El precio final del electrodoméstico con número de registro "
								+ nE + " es: " + t.precioFinal(nE));
					} else
						System.out.println("***ERROR***. Electrodoméstico no existente");
					break;

				case 3:
					System.out.println("\nLa suma de precios finales de todos los electrodomésticos de la tienda es: "
							+ t.sumaPreciosFinales() + "€");
					break;
					
				case 4: 
					System.out.println("\nLa media de los precios finales de los electrodomésticos de la tienda es: "
							+ t.media() + "€");
					break;
	
				default:
					System.out.println("***ERROR*** Opción inválida, atine.");
			}
		} while (opcion != salir);
		
	}

}

