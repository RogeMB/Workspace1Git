package ejercicio03;

import java.util.HashSet;
import java.util.Set;

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
		
		Set<Alumno> alumnos = new HashSet <Alumno>();
		
		alumnos.add(new Alumno("30240458T", "Antonio", 0, 0));
		
		
		CrudAlumno crud = new CrudAlumno (alumnos);
		
		int seleccion, eleccion, idAlumno;
		
		/*case 1 mostrar lista alumnos
		 * case 2 buscar un alumno
		 * cas3 modificar notas alumnos
		 * case4 eliminar alumno
		 * 
		 */
		
		
		
	}

}
