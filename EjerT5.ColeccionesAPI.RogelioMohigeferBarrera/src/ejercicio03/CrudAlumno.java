package ejercicio03;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CrudAlumno {
	
	
	private Set<Alumno> alumnos;

	// Constructor
	
	public CrudAlumno(Set<Alumno> alumnos) {
		super();
		this.alumnos = alumnos;
	}

	
	// GandS
	
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	// To String
	
	@Override
	public String toString() {
		return "CrudAlumno [alumnos=" + alumnos + "]";
	}

	
	// Métodos 
	
	public boolean annadirAlumno(Alumno a) {
		alumnos.add(a);
		if(alumnos.contains(a)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void mostrarListado () {
		if(!alumnos.isEmpty()) {
			int i=1;
			for (Alumno alumno : alumnos) {
				System.out.println(i++ + ". " + alumno);
			}
		}
	}
	
	public Alumno buscarporDniV2 (String dni) {
		Alumno a=null;
		Iterator <Alumno> it = alumnos.iterator();
		boolean encontrado = false;
		
		while (it.hasNext() && !encontrado) {
			a = it.next();
			if (a.getDni().equalsIgnoreCase(dni)) {
				encontrado=true;
			}
		}	
		if(!encontrado) {
			a=null;
		}
		return a;
		
	}
	

	public Alumno buscarporDni (String dni) {
		Alumno alumno = null;
		
		for (Alumno a : alumnos) {
			if (a.getDni().equalsIgnoreCase(dni) ) {
				return a;
			}	
		}
		return alumno;
	}
	
	
	public void ordenarPorDni () {
		SortedSet <Alumno> alumnosTree = new TreeSet <Alumno> (alumnos);
		int i=1;
		for (Alumno alumno : alumnosTree) {
			System.out.println(i++ + ". " + alumno);
		}
	}
	
	public void borrarAlumno(Alumno a) {
		alumnos.remove(a);
	}
	
	public void modificarNotaAlumno(Alumno a, Double nota) {
		if(!alumnos.isEmpty()) {
			a.setNotaMedia(nota);
		}else {
			System.out.println("ERROR el listado está vacío");
		}
	}
}
