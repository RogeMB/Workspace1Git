package ejercicio03Lambda;

import java.util.SortedMap;
import java.util.TreeMap;
import java.time.LocalTime;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora, minuto, segundo;
		int index = 0, opcion = 0, salir = 0;
		String nombre, autor, genero;
		LocalTime duracion;
		SortedMap<Integer, Cancion> listado = new TreeMap <Integer, Cancion> ();
		CrudBiblioteca c = new CrudBiblioteca (listado);
		
		imprimirBienvenida();
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				imprimirDespedida();
				break;
			case 1:
				System.out.print("\nVamos a añadir una nueva canción.\nDiga el nombre de la canción: ");
				nombre=Leer.dato();
				System.out.print("Diga el nombre del autor de la canción: ");
				autor=Leer.dato();
				System.out.print("Diga el género de la canción: ");
				genero=Leer.dato();
				System.out.println("Diga cuántas horas dura la canción: ");
				hora=Leer.datoInt();
				System.out.println("Diga cuántos minutos dura la canción: ");
				minuto=Leer.datoInt();
				System.out.println("Diga cuántos segundos dura la canción: ");
				segundo=Leer.datoInt();
				duracion= LocalTime.of(hora, minuto, segundo);
				c.annadirCancion(index++, new Cancion (nombre, autor, genero, duracion));
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
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			default:
				System.out.println("\n***ERROR, elija una opción válida***");
			}
			
		}while(opcion!=salir);
		
		
	}
	
	// Helpers
	
	public static void imprimirBienvenida(){
		System.out.println("\t\t=====BIENVENIDO AL PROGRAMA=====");
	}
	
	public static void imprimirDespedida(){
		System.out.println("\n\t\t=====GRACIAS, HASTA PRONTO=====");
	}
	
	public static void imprimirMenu(){
		System.out.print("\n\t\tElija una opción entre las siguientes:"
				+ "\n0. Salir"
				+ "\n1. Introducir canción a la biblioteca"
				+ "\n2. Buscar canción por nombre"
				+ "\n3. Buscar canción por autor"
				+ "\n4. Buscar canción por duración"
				+ "\n5. Calcular número de canciones por género"
				+ "\n6. Mostrar canciones de más de una determinada duración"
				+ "\n7. Calcular número de intérpretes distintos"
				+ "\n8. Ordenar biblioteca por duración"
				+ "\n9. Ordenar biblioteca por autores"
				+ "\n10. Eliminar una canción de la biblioteca"
				+ "\n11. Mostrar listado completo de canciones"
				+ "\nRespuesta: ");
		
		
	}

}
