package ejercicio06v2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Este ejercicio debería ser mucho más complejo, pero solo debemos hacer lo que se pide, aunque
		en alguna ocasión tenga menos sentido o falten cosas por hacer. Se trata de implementar un
		programa para gestionar un cine con una sola sala.
		Cada Entrada (una de las clases) de cine tendrá un número identificativo, precio, si está libre u
		ocupada, número de la fila y de butaca. Todas las funcionalidades estarán en la clase Sala, que
		estará caracterizada por número identificador, número total de localidades, un objeto tipo Entrada y
		un array de localidades (tipo Entrada).
		Se darán al usuario las siguientes opciones en un switch:
		• Ver cartelera que mostrará el título de la película proyectada.

		• Comprar una entrada comprobando si una localidad está vendida ya anteriormente.
		Todas las entradas valen lo mismo. En este caso, solo hay que mirar si su atributo "libre"
		es verdadero o falso, sin preocuparnos por nada más. Al acabar una venta habrá que
		pasar esa entrada a ocupada.
		• Calcular ganancias totales del día. Para ello al final de cada compra habrá que sumar la
		cantidad en el lugar que se haya habilitado para llevar el dinero total en caja.
		• Modificar el precio de una entrada.
		• Alguno más que se te ocurra.*/
		
		int opcion = 0, salir = 0, idEnt = 0, tam = 0;
		Sala s;
		Entrada e;
		String clave;

		do {
			s = new Sala ();
		
			
			Sala.imprimirMenu();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				System.out.println("\n\t ***GRACIAS, VUELVA PRONTO***");
				break;
			case 1:
				if (s.localidades==null)
				
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.print("Introduzca la contraseña: ");
				clave=Leer.dato();
				s = new Sala (clave);
				s.imprimirTrueFalse(s.comprobarContrasenna(clave));
				if (s.comprobarContrasenna(clave)) {
					Sala.imprimirSubMenu();
					opcion=Leer.datoInt();
					
				}
				
				break;
			default: 
				System.out.println("\n\t***ERROR***Introduzca una opción válida.");
			}
			
			
			
			
		} while (opcion != salir);
		
		
		
		
	
		
		
		
		
		
		

	}

}
