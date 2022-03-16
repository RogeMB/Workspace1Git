package ejercicio05;

import java.util.Collections;
import java.util.List;

public class CrudAgenda {
	
	private List <Contacto> listado;

	
	// Constructor
	
	public CrudAgenda(List<Contacto> listado) {
		super();
		this.listado = listado;
	}


	
	// ToString
	
	@Override
	public String toString() {
		return "Agenda [listado=" + listado + "]";
	}


	
	// GandS
	
	public List<Contacto> getListado() {
		return listado;
	}

	public void setListado(List<Contacto> listado) {
		this.listado = listado;
	}
	
	
	
	// Métodos
	
	
	public void annadir (Contacto c) {
			listado.add(c);
	}
	
	
	public void mostrarListado () {
		
		if (!listado.isEmpty()) {
			for (Contacto contacto : listado) {
				System.out.println("======================================================"
						+ "\n " + contacto.getDni() + ""
						+ "\n " + contacto.getNombre() + ""
						+ "\n " + contacto.getApellidos() + ""
						+ "\n " + contacto.getTelefono() + ""
						+ "\n " + contacto.getEmail() + ""
						+ "\n======================================================");	
			}	
		}else {
			System.out.println("\t\t***ERROR: El listado está vacío***");
		}
	}
	
	public void mostrarOrdenNatural (List <Contacto> lista) {
		if (!listado.isEmpty()) {
			Collections.sort(lista);
			mostrarListado();
		}else {
			System.out.println("\t\t***ERROR: El listado está vacío***");
		}
	}
	
	public void mostrarOrdenArtificial (List <Contacto> lista) {
		if (!listado.isEmpty()) {
			Collections.sort(lista, new CompararPorTelefono());
			mostrarListado();
		}else {
			System.out.println("\t\t***ERROR: El listado está vacío***");
		}
	}
	
	public void mostrarOrdenDNIinverso (List <Contacto> lista) {
		if (!listado.isEmpty()) {
			Collections.sort(lista, new CompararPorDNI().reversed());
			mostrarListado();
		}else {
			System.out.println("\t\t***ERROR: El listado está vacío***");
		}
	}

}
