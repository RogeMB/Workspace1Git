package ejercicio1;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int dias=0, opcion=0, salida=0, hasta=0, desde=0, numLit=0, min=1, posicion=0;
		int lista []= null;
		Random r = new Random (System.nanoTime());
		
		System.out.println("\t\t*** || EL PLUVIOMETRO DE NICO || ***");
		
		
		do {
			System.out.println("\nTeclee la opción que desee pulsando el número correspondiente: \n\t0. Salir "
				+ "\n\t1. Generar nº de litros recogidos (aleatorios) \n\t2. Tabla con los días y litros recogidos \n\t3. Muestra los litros de un día determinado "
				+ "\n\t4. Número de días de lluvia \n\t5. Media diaria de cantidad de litros de lluvia \n\t6. Porcentaje de lluvia respecto 15 litros");
			
			opcion=Leer.datoInt();
			switch (opcion) {
				case 0:
					System.out.println("\t\t***||| GRACIAS POR USAR NUESTRO PROGRAMA. HASTA PRONTO |||***");
					break;
				case 1:
					System.out.print("Teclee, por favor, el número de días: ");
					dias=Leer.datoInt();
					do {
						if (dias<=0) {
							System.out.println("\t\t***ERROR***Por favor, elija un nº de días mayor que 0***\n_______________________________________");
						}else {
							do {
												
								System.out.print("\nAhora, teclee el mínimo de litros recogidos: ");
								desde=Leer.datoInt();
							
								System.out.print("\nAhora, teclee el máximo de litros recogidos: ");
								hasta=Leer.datoInt();
								if (hasta<0 || desde<0) {
									System.out.println("\t\t***ERROR*** Por favor, elija un nº positivo\n___________________________________________");
								}else {
									
								}
							
							} while (hasta<0 || desde<0);
							
						}
					}while (dias<=0); 
					System.out.println("Operación correcta\n_____________________________________");
					//lista= new int [dias];
			
					break;
			
				case 2: 
					
					lista= new int [dias];
					System.out.println("DIA\t\t\tCANTIDAD");
					for (int i=0; i<lista.length; i++) {
						numLit= r.nextInt((hasta-desde+1)-desde);
						System.out.printf("\n%d\t\t\t%d\n________________________________________", (i+min), numLit);
					}
					
					break;
			
				case 3:
					System.out.print("\nEliga un día en concreto dentro de los límites que usted puso: ");
					posicion=Leer.datoInt();
					do {
						
						if (posicion<desde || posicion>hasta){
							System.out.println("***ERROR Introduzca valores correctos\n______________________");
						
						}else {
							System.out.printf("\nEn el día %d llovío: %dlitros", posicion, lista[posicion+min]);
						}
					}while (posicion<desde || posicion >hasta);
					break;
			
				case 4:
					
						System.out.println("\nHa llovido "+dias+"días.");
					
				
					break;
				
				case 5:
				
					break;
			
				case 6:
			
					break;
			
				default: 
				System.out.println("***OPCIÓN INCORRECTA. INTENTE DE NUEVO***\n__________________________________");
					break;
			
			}	
		
		} while (opcion!=salida);
		
	}

}
