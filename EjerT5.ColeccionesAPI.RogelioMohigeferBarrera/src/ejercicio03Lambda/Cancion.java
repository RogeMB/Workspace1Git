package ejercicio03Lambda;

import java.time.LocalTime;
import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
	
	private String nombre;
	private String autor;
	private String genero;
	private LocalTime duracion;
	
	
	// Constructor
	
	public Cancion(String nombre, String autor, String genero, LocalTime duracion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.duracion = duracion;
	}

	
	// ToString
	
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", autor=" + autor + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	
	
	// GandS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	
	// Métodos

	@Override
	public int compareTo(Cancion c) {
		// TODO Auto-generated method stub
		if(!this.nombre.equalsIgnoreCase(c.nombre)) {
			return (this.nombre.toLowerCase().compareTo(c.nombre.toLowerCase()));
		}else {
			return (this.autor.toLowerCase().compareTo(c.autor.toLowerCase()));
		}
			
	}


/*
	@Override
	public int hashCode() {
		return Objects.hash(autor, duracion, genero, nombre);
	}

*/

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(duracion, other.duracion)
				&& Objects.equals(genero, other.genero) && Objects.equals(nombre, other.nombre);
	}

}
