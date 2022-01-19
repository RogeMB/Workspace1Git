package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que
		tenga caché. Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una
		clase Hotel con una lista de Habitaciones y una clase de prueba para gestionar el hotel (realmente
		habría algunas clases más, como serían Cliente, Productos, etc. Pero no entraremos en eso). Se
		podrá crear una habitación (cuyos atributos serán tipo, precio, qué servicios extra tiene, nombre de
		cliente asignado, número de días contratados, etc.) ver si está ocupada o no, calcular precio final
		según número de días, servicios extra contratados y consumo del minibar, mostrar factura,
		comprobar si está “limpia” (que ha pasado la limpiadora cada día) y aquellos métodos que se quieran
		añadir. Crear un main de prueba.*/
		
		
		String nombreCliente, clave;
		int numNoches, opcion = 0, salir = 0;
		
		Habitacion ha;
		Hotel ho;
		Prueba p;
		
		Prueba.imprimirBienvenida();
		do {
			p = new Prueba ();
			Prueba.imprimirMenuPrincipal();
			opcion = Leer.datoInt();
			switch (opcion) {
				case 0:
					System.out.println("==========MUCHAS GRACIAS POR USAR iHOTEL. ¡VUELVA PRONTO!==========");
					break;
				case 1:
					clave = new String ();
					System.out.print("\nIntroduzca la contraseña actual: ");
					if (clave.equals(p.getContrasenna()))  {
						do {
							Prueba.imprimirSubMenuPersonal();
							switch (opcion) {
								case 0:
									System.out.println("<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<---<");
									break;
								case 1:
									
									break;
								case 2:
									
									break;
								case 3:
									
									break;
								case 4: 
									
									break;
								case 5:
									break;
								case 6:
									break;
								case 7:
									break;
								default: 
									Prueba.imprimirIncorrecto();
							}
								
							}while (opcion != salir);
					}else {
						Prueba.imprimirIncorrecto();
					}
					
					
					break;
				case 2:
					
					break;
				default:
					Prueba.imprimirIncorrecto();
				}
			
			
		
			
		}while (opcion != salir);
		
		

	}

}
