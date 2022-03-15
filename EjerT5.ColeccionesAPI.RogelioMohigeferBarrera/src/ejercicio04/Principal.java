package ejercicio04;

import java.util.HashMap;
import java.util.Map;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el número de
		 * teléfono como valor). Crear aquellos métodos que se utilizan normalmente en una agenda, como
		 * agregar, borrar, mostrar, buscar por algún criterio (por ejemplo, por nombre), modificar algún dato,
		 * etc. Y un main para probar todo.
		 * 
		 */
		
		
		String nombre, apellidos, telefono, email, direccion, empresa;
		int id = 0, opcion = 0, salir = 0;
		
		Map <Contacto, String> listado = new HashMap <Contacto, String>();
		Agenda a = new Agenda (listado);
		
		imprimirBienvenido ();
		
		do {
			imprimirMenu ();
			opcion = Leer.datoInt();
			switch (opcion) {
			case 0:
				imprimirDespedida ();
				break;
			case 1:
				System.out.print("\nDiga el nombre del contacto: ");
				nombre = Leer.dato();
				System.out.print("Diga los apellidos del contacto: ");
				apellidos = Leer.dato();
				System.out.print("Diga el teléfono del contacto: ");
				telefono = Leer.dato();
				System.out.print("Diga el nombre del contacto: ");
				nombre = Leer.dato();
				System.out.print("Diga el nombre del contacto: ");
				nombre = Leer.dato();
				
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				
			default:
				System.out.println("\t\t***ERROR, elija una opción válida***");
			}
			
			
		}while (opcion != salir);
		
		
		

	}
	
	// Helpers
	
	public static void imprimirBienvenido () {
		System.out.println("\t\t=====BIENVENIDO A LA GESTIÓN DEL CLUB DE CAMPO VIÑEDA=====");
	}
	
	public static void imprimirMenu () {
		System.out.print("\n\nElija una opción entre las siguientes: "
				+ "\n\t0. Salir"
				+ "\n\t1. Agregar un nuevo contacto"
				+ "\n\t2. Buscar un contacto"
				+ "\n\t3. Editar un contacto"
				+ "\n\t4. Quitar un contacto"
				+ "\n\t5. Mostrar listado completo de contactos"
				+ "\n\t6. Mostrar cantidad de contactos"
				+ "\nRespuesta: ");
	}
	
	public static void imprimirDespedida () {
		System.out.println("\\t\\t=====GRACIAS, HASTA PRONTO=====");
	}
}
