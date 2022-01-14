package ejercicio09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases.
		* Crear un programa que simule una máquina vendedora de tickets de metro. Tendremos que
		* crear la clase Ticket (Clase POJO), la clase Maquina (donde estarán todos los métodos con
		* funcionalidad) y la clase principal o de prueba. tendrá un menú donde se pueda:
		*	• Comprar uno o varios billetes.
		*	• Calcular el cambio a devolver.
		*	• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el
		*	  ticket el mensaje “válido para x personas”.
		*	• Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener
		*	  disponible un método que le ofrezca el saldo total de la recaudación de la máquina en
		*	  ese día (no es necesario usar fechas) y pueda poner a cero el contador de saldo total.
		* 
		* Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de los
		* billetes ya que estos suelen subir todos los años.
		* 
		* Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de
		* cualquier otra cosa.
		* 
		* Estas últimas funcionalidades también se harán con métodos dentro de la clase Maquina.*/
		
		int opcion = 1, numTickets, intentos, cero = 0;
		String clave = new String("");
		double precio, ingreso, cambio;
		Maquina m = new Maquina();
		Ticket t = new Ticket();
		
		do {
			System.out.println("\n*** SISTEMA AUTOMÁTICO DE VENTA DE BILLETES ***");
			System.out.println("\n*** ELIJA UNA OPCIÓN ***");
			System.out.println("\t1. Comprar billetes."
					+ "\n\t2. Ver precio del billete unitario."
					+ "\n\n\tOpciones sólo para operarios:"
					+ "\n\t3. Parar la máquina para mantenimiento."
					+ "\n\t4. Ver recaudación total."
					+ "\n\t5. Poner a cero la recaudación."
					+ "\n\t6. Cambiar el precio del billete unitario."
					+ "\n\t7. Cambiar contraseña.");
			System.out.print("\nOpción elegida: ");
			opcion = Leer.datoInt();
			System.out.println("");
			
			switch (opcion) {
			case 1:
				/*comprar tickets*/
				// Preguntar número de tickets
				System.out.print("¿Cuántos Tickets desea adquirir?: ");
				numTickets=Leer.datoInt();
				if (numTickets > 0) {
					intentos = 0;
					// Calcular el precio
					t.setNumViajeros(numTickets);
					precio=t.precioTicket();
					System.out.println("\nEl precio de " + numTickets + " tickets es " + precio + "€");
					// Realizar el pago
					System.out.print("Introduzca su pago (devuelve cambio): ");
					ingreso=Leer.datoDouble();
					cambio=m.calcularCambio (precio, ingreso);
					while (cambio < 0 && intentos < 3) {
						intentos ++;
						System.out.println("\nIntento "+intentos+" de 3.");
						System.out.print("Falta: "+(-cambio)+"€\nIntroduzca importe restante: ");
						ingreso=ingreso+Leer.datoDouble();
						cambio=m.calcularCambio(precio, ingreso);
					}
					if (cambio < 0) {
						// Pago insuficiente
						m.ventaCancelada();
						if (ingreso > 0)
							System.out.println("Se le devuelve lo que ha ingresado: "+ingreso+"€");
						precio = 0;	
					} else {
						// Venta válida. Continuamos
						if (cambio > 0)
							System.out.println("\n****** Recoja el cambio: "+cambio+"€ ******");
						// Actualizar recaudación
						m.setRecaudacion(m.getRecaudacion()+precio);
						// Imprimir billete
						t.imprimeTicket();
					}
				} else
					m.ventaCancelada();
				break;
			case 2:
				System.out.println("Precio del billete actual: "+ t.getPrecio1Ticket() +"€");
				break;
			case 3:
				/*Salir. (sólo para el operario)*/
				System.out.print("Introduzca contraseña: ");
				clave = Leer.dato();
				if (clave.equals(m.getContrasenna())) {
					System.out.println("\n\n******** MÁQUINA DETENIDA PARA MANTENIMIENTO ********");
				} else {
					m.error();
					opcion = 0;  // Anular salida
				}
				break;
			case 4: 
				/*Ver recaudación total (sólo para el operario)*/
				System.out.print("Introduzca contraseña: ");
				clave = Leer.dato();
				if (clave.equals(m.getContrasenna())) {
					System.out.println("Recaudación total hasta el momento: " + m.getRecaudacion() +"€");
				} else {
					m.error();
				}
				break;
			case 5:
				/*Ver recaudación total (sólo para el operario)*/
				System.out.print("Introduzca contraseña: ");
				clave = Leer.dato();
				if (clave.equals(m.getContrasenna())) {
					System.out.println("Recaudación total hasta el momento: " + m.getRecaudacion() +"€");
					System.out.println("*** Se ha puesto a cero la recaudación. ***");
					m.setRecaudacion(0);
				} else {
					m.error();
				}
				break;
			case 6:
				/*Cambiar el precio del billete unitario (sólo para el operario)*/
				System.out.print("Introduzca contraseña: ");
				clave = Leer.dato();
				if (clave.equals(m.getContrasenna())) {
					System.out.println("Precio del billete actual: "+ t.getPrecio1Ticket() +"€");
					do {
						System.out.print("Introduzca nuevo precio: ");
						precio = Leer.datoDouble();
					} while (precio<=cero);
					t.setPrecio1Ticket(precio);
				} else {
					m.error();
				}
				break;
			case 7:
				/*Cambiar contraseña (sólo para el operario)*/
				System.out.print("Introduzca contraseña actual: ");
				clave = Leer.dato();
				if (clave.equals(m.getContrasenna())) {
					do {
						System.out.print("Introduzca nueva contraseña: ");
						clave = Leer.dato();
					} while (clave.length()==0);
					m.setContrasenna(clave);
					System.out.println("***Contraseña cambiada correctamente.***");
				} else {
					m.error();
				}
				break;
			default: m.error();
			}

		} while (opcion != 3);
	}
}
