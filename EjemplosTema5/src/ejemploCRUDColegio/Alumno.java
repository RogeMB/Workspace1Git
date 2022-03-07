package ejemploCRUDColegio;

public class Alumno {
	
	private String dni;
	private String nombre;
	
	// Constructor
	
	public Alumno(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
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
	
	// ToString
	
	@Override
	public String toString() {
		return "********************************\n"
			 + "Dni: " + dni + "\n"
			 + "Nombre: " + nombre+"\n"
			 + "********************************\n";
	}
	
}