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
	
	
	//Cálculos
	
	public double calcularPaga () {
		return 0.0;
	}
	
	//IMPORTANTE: MAL EJEMPLO PARA AHORRAR CALCULOS:
	/*
	 * public double calcularPaga () {
		return (1200-1200*20/100)+35*23;
	}
	
	//Luego en la clase heredada consulor:
	 * 
	 *public double () {
	 * 	return (1200-1200*20/100)+35*23 + horas*tarifa;
	 *}
	 *
	 *LO QUE SE HACE ES: 
	 *
	 public double () {
	  	return super.calcularPaga () + horas*tarifa;
	 }
	*/

}
