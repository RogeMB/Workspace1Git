package ejemplo01List;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String>lista = new ArrayList<String> ();
		List <Integer>enumerados = new ArrayList<Integer> ();		
		
		lista.add("Roge");
		lista.add("Cosi");
		
		
		enumerados.add(2);
		
		
		
		System.out.println(lista);
		
		/*******************************************************************************************************/
		
		/*
		 * Se debe crear el alumno antes de  instanciar la lista.
		 */
		
		Alumno a = new Alumno ("Pepe", 24, 7.1);
		
		List <Alumno> listaAlumnos = new ArrayList <Alumno> ();
		
		listaAlumnos.add(new Alumno("Roge", 32, 9.1));
		
		listaAlumnos.add(1, (new Alumno("Paco", 21, 5.7))); // Probar cambiar el index a 0. Cambia el orden en el print. 
															// No se puede poner por ejemplo 5 porque deja espacios vacios y da error point null
		
		listaAlumnos.add(2, a);
		
		System.out.println(listaAlumnos.size());
		
		System.out.println(listaAlumnos);
		
		System.out.println(listaAlumnos.get(0));
		
	}

}
