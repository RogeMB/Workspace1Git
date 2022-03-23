package ejercicio03;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	
	private String dni;
	private String nombre;
	private int edad;
	private double notaMedia;

	
	// Constructor
	
	public Alumno(String dni, String nombre, int edad, double notaMedia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}

	// ToString
	
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + "]";
	}
	
	
	// GandS


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
	// Métodos
	
	public int compareTo(Alumno c) {
		return (dni.compareTo(c.getDni()));
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, edad, nombre, notaMedia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
	}
	
	

}
