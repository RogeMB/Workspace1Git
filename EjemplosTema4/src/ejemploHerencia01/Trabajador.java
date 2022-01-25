package ejemploHerencia01;

public class Trabajador {
	
	private String nombre;
	private String puesto;
	
	
	//Constructor
	public Trabajador(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}

	//ToString
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + "]";
	}

	//GettersSetters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
