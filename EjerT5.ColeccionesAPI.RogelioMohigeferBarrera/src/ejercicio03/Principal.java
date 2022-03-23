package ejercicio03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que guarde los nombres de los alumnos de la clase. Se deben poder mostrar,
		 * modificar y borrar los que se quiera de forma individual, es decir, el usuario debe decir quién quiere
		 * mostrar, modificar o borrar. Se puede crear otra clase con funcionalidades como sacar nota media del
		 * curso, dar el número de suspensos en total, media de suspensos, etc. Usa la interfaz Set implementada
		 * por hashset.
		 * 
		 */
		
		int seleccion=0, opcion=0, salir=0, numSuspensos=0, edad=0;
		double notaMedia=0.0;
		String dni, nombre; 
		
		Set<Alumno> alumnos = new HashSet <Alumno>();
		
		alumnos.add(new Alumno("11111111Q", "Antonio", 21, 9));
		alumnos.add(new Alumno("55555555D", "Roge", 32, 10));
		alumnos.add(new Alumno("33333333J", "Paco", 21, 7));
		alumnos.add(new Alumno("44444444S", "Roberto", 24, 9));
		
		CrudAlumno crud = new CrudAlumno (alumnos);
		
		
		imprimirBienvenida();
		do {
			
			imprimirMenu();
			opcion=Leer.datoInt();
			switch(opcion) {
			case 0:
				imprimirDespedida();
				break;
			case 1: 
				System.out.println("Diga dni del alumno: ");
				dni=Leer.dato();
				System.out.println("Diga nombre del alumno: ");
				nombre=Leer.dato();
				System.out.println("Diga edad del alumno: ");
				edad=Leer.datoInt();
				System.out.println("Diga nota media del alumno: ");
				notaMedia=Leer.datoDouble();
				crud.annadirAlumno (new Alumno (dni, nombre, edad, notaMedia));
				break;
			case 2:
				System.out.println("===Imprimiendo Listado===");
				crud.mostrarListado();
				break;
			case 3:
				System.out.println("===Ordenando Por DNI===");
				crud.ordenarPorDni();
				break;
			case 4:
				System.out.println("Diga dni del alumno que quiere modificar: ");
				dni=Leer.dato();
				if(alumnos.contains(crud.buscarporDniV2(dni))) {
					System.out.println("Diga la nueva nota media del alumno: ");
					notaMedia=Leer.datoDouble();
					crud.modificarNotaAlumno(crud.buscarporDniV2(dni), notaMedia);
				}else {
					System.out.println("ERROR Alumno no encontrado");
				}
				
				
			case 5:
				System.out.println("Diga dni del alumno que quiere borrar:");
				dni=Leer.dato();
				if(!alumnos.isEmpty()) {
					crud.borrarAlumno(crud.buscarporDniV2(dni));
					System.out.println("El alumno ha sido borrado");
				}else if (alumnos.contains(crud.buscarporDniV2(dni))) {
					System.out.println("ERROR listado vacío");
				}else {
					System.out.println("ERROR Alumno no encontrado");
				}
				
			default:
				System.out.println("***ERROR***Elija opción válida");
			
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
		System.out.print("\nElija una opción entre las siguientes: "
				+ "\n0. Salir"
				+ "\n1. Añadir Alumnos"
				+ "\n2. Mostrar listado Alumno"
				+ "\n3. Mostrar listado ordenado dni Alumnos"
				+ "\n4. Modificar nota Alumno"
				+ "\n5. Borrar alumno"
				+ "\nRespuesta: ");
	}

}
