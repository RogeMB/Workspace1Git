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
		
		int seleccion=0, opcion=0, salir=0, numSuspensos=0;
		double notaMedia=0.0;
		
		
		Set<Alumno> alumnos = new HashSet <Alumno>();
		
		alumnos.add(new Alumno("11111111Q", "Antonio", 0, 0));
		
		CrudAlumno crud = new CrudAlumno (alumnos);
		
		
		imprimirBienvenida();
		do {
			opcion=Leer.datoInt();
			
		}while(opcion!=salir);

		/* 
		 * case 1 mostrar lista alumnos
		 * case 2 buscar un alumno
		 * cas3 modificar notas alumnos
		 * case4 eliminar alumno
		 */
		
		
		
		
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
				+ "\n2. Borrar Alumno"
				+ "\n3. Mostrar listado Alumnos"
				+ "\n4. Modificar nota Alumno");
	}

}
