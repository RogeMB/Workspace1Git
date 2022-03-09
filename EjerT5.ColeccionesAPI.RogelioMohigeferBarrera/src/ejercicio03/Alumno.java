package ejercicio03;

public class Alumno {
	
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

}
