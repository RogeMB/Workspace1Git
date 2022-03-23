package ejercicio01;

import java.util.List;
import java.util.Objects;

public class Bloc {
	
	private int idBloc;
	private List <Nota> listado;
	
	// Constructor
	
	public Bloc(int idBloc, List<Nota> listado) {
		super();
		this.idBloc = idBloc;
		this.listado = listado;
	}

	// ToString

	@Override
	public String toString() {
		return "Bloc [idNota=" + idBloc + ", listado=" + listado + "]";
	}

	
	// Getters&Setters	
	
	public int getIdBloc() {
		return idBloc;
	}

	public void setIdAgenda(int idBloc) {
		this.idBloc = idBloc;
	}

	public List<Nota> getListado() {
		return listado;
	}

	public void setListado(List<Nota> listado) {
		this.listado = listado;
	}
	
	
	// Métodos
	
	public void annadirNota (Nota n) {
		listado.add(n);
	}
	
	public int mostrarCantidadNotas () {
		return listado.size();
	}
	
	public void mostrarListado () {
		if (!listado.isEmpty()) {
			System.out.println(listado);
		}else {
			System.out.println("\n\t\t*****ERROR, el listado está vacío*****");
		}
	}
	
	public void mostrarUno (int id) {
		if(!listado.isEmpty()) {
			System.out.println(listado.get(id));	
		}
	}
	
	public void mostrarUrgentes (int idNota) {	  // Este método está mal
		if (!listado.isEmpty() && listado.get(idNota) != null) {     
			for (Nota nota : listado) {
				if (buscarNota(idNota).isEsUrgente()) {
					System.out.println(nota);	
				}
				idNota++;
			}
		}else {
			System.out.println("\n\t\t*****ERROR, el listado está vacío*****");
		}
	}
	
	
	public boolean determinarUrgente (int urgente) {
		if (urgente == 1)
			return true;
		else 
			return false;
	}
	
	public void eliminarNota (int elegido) {
		listado.remove(elegido);
	}
	
	public Nota buscarNota (int idNota) {
		boolean encontrado = false;
		for (Nota nota : listado) {
			if (nota.getId()==idNota) {
				encontrado=true;
			}
		}
		if (!encontrado) {
			return null;
		} else {
			return listado.get(idNota);
		}
	}
		
}
