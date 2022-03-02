package ejercicio02;

import java.util.List;

public class Gestion {
	
	private List <Socio> listado;

	
	
	// Constructor
	
	public Gestion(List<Socio> listado) {
		super();
		this.listado = listado;
	}


	
	// ToString
	
	@Override
	public String toString() {
		return "Gestion [listado=" + listado + "]";
	}



	// Getters&Setters
	
	public List<Socio> getListado() {
		return listado;
	}

	public void setListado(List<Socio> listado) {
		this.listado = listado;
	}
	
	
	// Métodos
	
	public void annadirSocio (Socio s) {
		listado.add(s);
	}
	
	public int calcularCantidadSocios () {
		return listado.size();
	}
	
	public void mostrarListado () {
		if (!listado.isEmpty()) {
			System.out.println(listado);
		}else {
			System.out.println("***EL LISTADO ESTÁ VACÍO");
		}
	}
	
	public void mostrarActivos () {
		for (Socio socio : listado) {
			if (socio.isActivo() && socio != null) {
				System.out.println(socio);
			}
		}
	}
	
	public Socio buscarSocio (int id) {
		boolean encontrado = false;
		for (Socio socio : listado) {
			if (socio.getId() == id) {
				encontrado=true;
			}
		}
		if (encontrado) {
			return listado.get(id);
		}else {
			return null;
		}
	}
	
	public void editarSocio (int id) {
		if (!listado.isEmpty() && buscarSocio(id) != null) {
			Socio socio = buscarSocio(id);
			socio.setNombre(socio.getNombre());
			socio.setApellidos(socio.getApellidos());
			socio.setEdad(socio.getEdad());
			socio.setCuota(socio.getCuota());
		}
	
	}
	
	
	public void borrarSocio (int id) {
		if (!listado.isEmpty() && buscarSocio(id) != null) {
			Socio socio = buscarSocio (id);
			socio.setActivo(false);
		}
	}
	
	

}
