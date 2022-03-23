package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=0, salir=0, id=0, centimoMensaje=0;
		String nombreContacto, cuerpoMensaje;
		double totalRecaudado=0.0;
		
		List<Mensaje> listado = new ArrayList<Mensaje> ();
		
		Mensaje m1 = new Mensaje (1, "Roge", "Hola qué tal?");
		Mensaje m2 = new Mensaje (2, "Roge", "Adiós que vaya bien");
		Mensaje m3 = new Mensaje (3, "Carlota", "Voy para allá");
		Mensaje m4 = new Mensaje (4, "Paco", "Ven para acá");
		
		listado.add(m1);
		listado.add(m2);
		listado.add(m3);
		listado.add(m4);
		
		Whatsapp w = new Whatsapp(listado);
		
		
		imprimirBienvenida();
		System.out.print("Diga cuántos centimos va a cobrar por cada mensaje: ");
		centimoMensaje=Leer.datoInt();
		
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				imprimirDespedida();
				break;
			case 1:
				System.out.print("\nDiga el nombre del contacto del que quiere buscar un mensaje: ");
				nombreContacto=Leer.dato();
				if(!listado.isEmpty()) {
					if(w.buscarUno(nombreContacto)!=null)
						System.out.println(w.buscarUno(nombreContacto));
					else {
						System.out.println("***ERROR mensaje no encontrado***");
					}
				}else {
					System.out.println("***ERROR listado vacío***");
				}
				break;
			case 2:
				System.out.print("\nDiga el nombre del contacto del que quiere buscar los mensajes: ");
				nombreContacto=Leer.dato();
				if(!listado.isEmpty()) {
					System.out.println(w.buscarTodosUno(nombreContacto));
				}else {
					System.out.println("***ERROR listado vacío***");
				}
				break;
			case 3:
				System.out.println("\n===ELIMINAR MENSAJE===");
				System.out.print("\nDiga el id del mensaje que quiere eliminar: ");
				id=Leer.datoInt();
				if(!listado.isEmpty() && listado.contains(listado.get(id))) {
					w.eliminarMensaje(id);
				}else {
					System.out.println("***ERROR listado vacío o mensaje no encontrado***");
				}
				break;
			case 4:
				//no me ha dado tiempo
				break;
			case 5:
				System.out.println("\n===MOSTRAR TODOS ORDENADOS POR NOMBRE===");
				if(!listado.isEmpty()) {
					System.out.println(w.ordenarPorNombre(new CompararPorNombre()));
				}else {
					System.out.println("***ERROR listado vacío***");
				}
				break;
			case 6:
				System.out.println("\n===MOSTRAR TODOS ORDENADOS POR ID===");
				Collections.sort(listado);
				w.mostarTodos(); //No hace falta hacer otro método
				break;
			case 7:
				System.out.print("\nDiga el nombre del contacto del que quiere buscar los mensajes: ");
				nombreContacto=Leer.dato();
				if(!listado.isEmpty()) {
					totalRecaudado = w.calcularRecaudado(centimoMensaje, nombreContacto);
					System.out.println("El total recaudado de " + nombreContacto + " es: " + totalRecaudado + " centimos de €.");
				}else {
					System.out.println("***ERROR listado vacío***");
				}
				
				break;
			case 8:
				System.out.println("\n===MOSTRAR TODOS===");
				w.mostarTodos();
				break;
				
			default:
				System.out.println("***ERROR***Elija una opción válida");
			}
		}while(opcion!=salir);
		
		

	}
	
	// Helpers
	
	public static void imprimirBienvenida() {
		System.out.println("=====BIENVENIDO AL PROGRAMA=====");
	}
	
	public static void imprimirDespedida() {
		System.out.println("=====GRACIAS POR USAR EL PROGRAMA=====");
	}
	
	public static void imprimirMenu() {
		System.out.print("\nElija una opción entre las siguientes:"
				+ "\n0. Salir"
				+ "\n1. Buscar un mensaje por contacto"
				+ "\n2. Buscar todos los mensajes de un contacto"
				+ "\n3. Borrar un mensaje"
				+ "\n4. Modificar cuerpo de un mensaje"
				+ "\n5. Ordenar lista por nombre del contacto"
				+ "\n6. Ordenar lista por id"
				+ "\n7. Calcular total recaudado mensajes de un contacto"
				+ "\n8. Mostrar listado completo"
				+ "\nRespuesta: ");
	}
	
}
