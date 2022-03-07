package ejemploCRUDColegio;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
	
	private List<Alumno> listAlumnos;

	// Constructor
	
	public Secretaria(List<Alumno> listAlumno) {
		super();
		this.listAlumnos = listAlumno;
	}
	
	// Otro constructor vacío
		
	public Secretaria () {		
		listAlumnos=new ArrayList <Alumno>();
	}
	
	
	// GandS
	
	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(List<Alumno> listAlumno) {
		this.listAlumnos = listAlumno;
	}
	
	// ToString

	@Override
	public String toString() {
		return "Secretaría [listAlumno=" + listAlumnos + "]";
	}
	
	// Los métodos están hechos, por comodidad, sin comprobar si la lista está vacía, 
	// aspecto que deberíamos hacer como buena práctica
	
	public void agregarAlum (Alumno alum) {
		listAlumnos.add(alum);
	}
	
	// Otra versión de agregar vista en clase, devolviendo un boolean. 
	// Habría que tener el imprimir mensaje de error al agregar como hemos visto en clase
	
	public boolean agregar2 (Alumno alum) {
		return listAlumnos.add(alum);
	}
	
	
	public int buscarAlumno (String dni) {
		int temp = -1;
		boolean salir = false;
		
		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = 1;
				salir = true;
			}
		}
		return temp;
	}
	
	
	public void modificarAlumno (String dni, String nombreAlumno) {
		int index = buscarAlumno (dni);
		
		if (index >= 0) {
			listAlumnos.get(index).setNombre(nombreAlumno);
		}
	}
	
	// Devuelve el alumno buscado si lo encuentra o null si no es así
	
	public Alumno buscarAlum2 (String dni) {
		Alumno tem = null;
		boolean salir = false;
		// int j = 0;
		for (int i = 0; i < listAlumnos.size () && !salir; i++) {
			if(listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = listAlumnos.get(i);
				salir = true;
			}
		}
		/*
		for (Alumno alumno : listAlumnos) {
			if (listAlumnos.get(j).getDni().equalsIgnoreCase(dni)) {
				tem = listAlumnos.get(j);
				salir = true;	
			}
			j++;
		}
		*/
		return tem;
	}
	
	
	/* 
	 * Se  puede devolver una lista de alumnos si se pone public list<Alumnos> buscarAlum3 (String dni). 
	 * Se crea una lista temporal dentro del método. Y devolverá esa lista temporal.
	 * 
	 * En esta lista hay que llegar hasta el final de la lista. Se podría investigar con el for each.
	 */
	
	public List <Alumno> buscarAlum3 (String nombre) {
		List <Alumno> listaAuxiliar = new ArrayList <Alumno> ();
		
		for (int i = 0; i < listAlumnos.size() && !listaAuxiliar.isEmpty(); i++) {
			if (listAlumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				listaAuxiliar.add (listAlumnos.get(i));		
			} //Faltaría poner que si no encuentra nada que devuelva un vacío o un null 
			else {
				return null;
			}
		}
		return listaAuxiliar;	
	}
	
	
	
	
	public void imprimirLista () {
		for (Alumno alumno : listAlumnos) {
			System.out.println(alumno);
		}
	}
	
	public void borrarAlumno (String dni) {
		int index = buscarAlumno (dni);
		
		if (index >= 0) {
			listAlumnos.remove(index);
		}
	}
	
	// Este método estaría en la clase vista
	
	public void mostrarErrorAgregar (boolean b) {
		if (b) {
			System.out.println("Se ha agregado el alumno correctamente");
		}else {
			System.out.println("Error al insertar");
		}
	}
	
}
