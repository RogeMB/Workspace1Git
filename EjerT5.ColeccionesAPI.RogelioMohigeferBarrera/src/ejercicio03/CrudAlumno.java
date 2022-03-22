package ejercicio03;

import java.util.Iterator;
import java.util.Set;

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
	
	public Alumno buscarporDniV2 (String dni) {
		
		Alumno a;
		Iterator <Alumno> it = alumnos.iterator();
		boolean encontrado = false;
		
		while (it.hasNext() && !encontrado) {
			a = it.next();
			if (a.getDni().equalsIgnoreCase(dni)) {
				encontrado = true;
				return a;
			}
		}
		
		return null;
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
	
}
