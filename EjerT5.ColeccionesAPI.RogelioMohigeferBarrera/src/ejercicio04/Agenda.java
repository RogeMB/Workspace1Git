package ejercicio04;

import java.util.Map;

public class Agenda {
	
	private Map listado;
	
	
	// Construtor
	
	public Agenda(Map listado) {
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
	
	
	
	
}
