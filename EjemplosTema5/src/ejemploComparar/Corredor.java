package ejemploComparar;

public class Corredor implements Comparable <Corredor>{

	
	private int dorsal;
	private double marca;
	private String nombre;
	
	// Constructores 
	
	public Corredor(int dorsal, double marca, String nombre) {
		this.dorsal = dorsal;
		this.marca = marca;
		this.nombre=nombre;
	}
	
	// GandS
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public double getMarca() {
		return marca;
	}
	public void setMarca(double marca) {
		this.marca = marca;
	}
	public String getNombre(){
		return nombre;
	}
	
	// ToString
	
	@Override
	public String toString() {
		return "Corredor [dorsal=" + dorsal + ", marca=" + marca + ", nombre=" + nombre + "]";
	}

	
	/*Orden natural simple basado, por ejemplo, en uno de los atributos primitivos como el dorsal
	 * usa interface Comparable y se modifica la clase modelo original.
	 * se debe reescribir el método compareTo en la clase modelo definiendo cómo se quiere ordenar*/ 
	
	// Métodos
	
	@Override
	public int compareTo(Corredor c) {
		
		if(this.dorsal < c.dorsal) {
			return -1;

		}else {
			if (this.dorsal > c.dorsal) {
				return 1;
			}
			
			return 0;
		}
		
	}
}
