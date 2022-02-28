package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son calificaciones
		 * de clase). Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú decides las
		 * características que debe tener una nota). Debe permitir almacenar un número infinito de notas
		 * (significa que se deben usar colecciones), se podrán mostrar de manera individual (mostrar una nota
		 * buscándola), dar información del número de notas guardadas, agregar una nueva nota, un método que
		 * borre una de las notas guardadas comprobando antes que la lista no está vacía. Se borrará por número
		 * (la nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con todas las notas (en un método)
		 * y su número correspondiente, el usuario introducirá el número de la que quiera borrar. Realmente, esto
		 * se debe hacer buscando la nota, pero al ser el primer ejercicio, no es necesario hacer los métodos
		 * buscar.
		 */
		
		Nota n;
		Bloc b;
		List <Nota> listado = new ArrayList <Nota> ();
		int id = 1, idBloc = 0, opcion = 0, salir = 0, urgente = 0, eleccion = 0;
		String titulo, cuerpo;
		
		b = new Bloc (idBloc, listado);
		
		imprimirBienvenido();
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			switch (opcion) {
			case 0:
				impirmirDespedida();
				break;
			case 1:
				System.out.println("\nVamos a crear una nueva nota. Diga el título de la nota: ");
				titulo = Leer.dato();
				System.out.println("Bien. Cree ahora el cuerpo de la nota: ");
				cuerpo = Leer.dato();
				System.out.println("Bien. Ahora pulse 1 si es urgente, o pulse 2 si no lo es.");
				urgente = Leer.datoInt();
				n = new Nota (id++, titulo, cuerpo, b.determinarUrgente(urgente));
				b.annadirNota(n);
				break;
			case 2:
				System.out.print("\nIntroduzca el id de la nota que quiere buscar: ");
				id = Leer.datoInt() - 1;
				System.out.println(b.buscarNota(id));		
				break;
			case 3:
				System.out.println("\nEl número total de notas es de: " + b.mostrarCantidadNotas() + ".");
				break;
			case 4:
				System.out.println("\nElija el id de la nota que quiere borrar del listado siguiente: ");
				b.mostrarListado();
				if (!listado.isEmpty()) {
					System.out.print("Respuesta: ");
					eleccion=Leer.datoInt() - 1;
					b.eliminarNota(eleccion);
				}
				break;
			case 5:
				System.out.println("\t\tLISTADO DE NOTAS:");
				b.mostrarListado();
				break;
			case 6:
				System.out.println("\t\tLISTADO DE NOTAS URGENTES:");  // Esta opción está mal
				id=0;
				b.mostrarUrgentes(id);
				break;				
			default:
				System.out.println("\n\t\t*****ERROR, elija una opción correcta******");
			}
		}while (opcion!=salir);
		
		
	}
	
	// Helpers
	
	public static void imprimirBienvenido () {
		System.out.println("\t\t=====BIENVENIDO AL PROGRAMA ANOTE=====");
	}
	
	public static void imprimirMenu () {
		System.out.print("\nElija una opción entre las siguientes: "
				+ "\n\t0. Salir"
				+ "\n\t1. Crear una nota y agregarla"
				+ "\n\t2. Mostrar una nota"
				+ "\n\t3. Mostrar número de notas"
				+ "\n\t4. Borrar una nota"
				+ "\n\t5. Mostrar listado completo"
				+ "\n\t6. Mostrar notas urgentes"
				+ "\nRespuesta: ");
	}
	
	public static void impirmirDespedida () {
		System.out.println("\\t\\t=====GRACIAS, HASTA PRONTO=====");
	}
}
