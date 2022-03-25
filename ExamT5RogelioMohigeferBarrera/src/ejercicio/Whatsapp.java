package ejercicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Whatsapp {
	
	List<Mensaje> listado;
	private static double TotalRecaudado;
	
	
	//Constructor
	
	public Whatsapp(List<Mensaje> listado) {
		super();
		this.listado = listado;
	}


	// ToString
	
	@Override
	public String toString() {
		return "Whatsapp [listado=" + listado + "]";
	}


	// GandS
	
	public List<Mensaje> getListado() {
		return listado;
	}


	public void setListado(List<Mensaje> listado) {
		this.listado = listado;
	}


	public static double getTotalRecaudado() {
		return TotalRecaudado;
	}


	public static void setTotalRecaudado(double totalRecaudado) {
		TotalRecaudado = totalRecaudado;
	}
	
	
	// Métodos
	
	public void eliminarMensaje(int id) {
		listado.remove(id);
	}
	
	public void mostarTodos() {
		Iterator<Mensaje> it =  listado.iterator();
		List<Mensaje> temp = new ArrayList<Mensaje> ();
		Mensaje aux;
		while(it.hasNext()) {
			aux=it.next();
			temp.add(aux);
		}
		for (Mensaje mensaje : temp) {
			System.out.println("========================================================================");
			System.out.println(mensaje);
			System.out.println("========================================================================");
		}
	}
	
	public List<Mensaje> buscarTodosUno(String nombre){
		Iterator<Mensaje> it =  listado.iterator();
		List<Mensaje> temp = new ArrayList<Mensaje> ();
		Mensaje aux;
		while(it.hasNext()) {
			aux=it.next();
			if(aux.getNombreContacto().equalsIgnoreCase(nombre))
			temp.add(aux);
		}
		return temp;
	}

	public Mensaje buscarUno(String nombre) {
		Iterator<Mensaje> it =  listado.iterator();
		Mensaje aux=null;
		boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			aux=it.next();
			if(aux.getNombreContacto().equalsIgnoreCase(nombre))
				encontrado=true;
		}
		if(!encontrado) {
			aux=null;
		}
		return aux;
	}
	
	public List<Mensaje> ordenarPorNombre (Comparator<Mensaje> comp){
		List<Mensaje> temp = new ArrayList<Mensaje> (listado);
		temp.sort(comp);
		return temp;
	}
	
	public double calcularRecaudado(int centimoMensaje, String nombre) {
		final double divisor= 100;
		TotalRecaudado = (double)(buscarTodosUno(nombre).size()*centimoMensaje)/divisor;
		return TotalRecaudado;
	}
	
	public void mostrarBonito(List<Mensaje> l) {
		for (Mensaje mensaje : l) {
			System.out.println(mensaje); //no me ha dado tiempo a usarlo
		}
	}
	
}
