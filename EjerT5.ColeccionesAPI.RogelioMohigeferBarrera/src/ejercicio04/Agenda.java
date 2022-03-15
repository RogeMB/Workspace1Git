package ejercicio04;

import java.util.Iterator;
import java.util.Map;

public class Agenda {
	
	private Map <Contacto, String> listado;
	
	// Construtor
	
	public Agenda(Map<Contacto, String> listado) {
		super();
		this.listado = listado;
	}

	// GandS

	public Map getListado() {
		return listado;
	}

	public void setListado(Map listado) {
		this.listado = listado;
	}



	// ToString
	
	@Override
	public String toString() {
		return "Agenda [listado=" + listado + "]";
	}

	
	// Métodos
	
	
	public void agregarContacto (Contacto c, String telefono) {
		listado.put(c, telefono);	
	}
	
	
	public void mostrarUnContacto (String nombre) {
		Contacto index = buscarPorNombre (nombre);
		System.out.println(index);
	}
	
	public Contacto buscarPorNombre (String nuevoNombre) {
		Iterator <Contacto> it = listado.keySet().iterator ();
		Contacto tmp = null;
		boolean encontrado = false;
		while (it.hasNext() && !encontrado) {
			tmp = it.next();
			if (tmp.getNombre().equalsIgnoreCase(nuevoNombre)) {
				encontrado=true;
				return tmp;
			}
			
		}
		return tmp;
	}
	
	
	
	
}
