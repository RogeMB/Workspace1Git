package ejercicio03Lambda;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.function.Function;

public class CrudBiblioteca {

	private SortedMap<Integer, Cancion> listado;

	
	// Constructor
	
	public CrudBiblioteca(SortedMap<Integer, Cancion> listado) {
		super();
		this.listado = listado;
	}
	
	
	// ToString
	
	@Override
	public String toString() {
		return "Biblioteca [listado=" + listado + "]";
	}
	
	
	// GandS
	
	public SortedMap<Integer, Cancion> getListado() {
		return listado;
	}

	public void setListado(SortedMap<Integer, Cancion> listado) {
		this.listado = listado;
	}
	
	
	// Métodos
	
	public void annadirCancion (int index, Cancion c) {
		listado.put(index, c);
	}
	
	public void buscarCancionPorNombre () {
		Function<Integer, Cancion> funcionBuscar = s1 -> {
			Cancion aux = null;
			boolean encontrado = false;
			for (Entry<Integer, Cancion> entry : listado.entrySet()) {
				Integer key = entry.getKey();
				Cancion val = entry.getValue();
				
			}
		}
	}
	
	
	public void eliminarCancion (int index) {
		
	}
	
}
