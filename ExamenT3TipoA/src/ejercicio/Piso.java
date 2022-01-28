package ejercicio;

public class Piso {
	
	private String direccion;
	private double metrosCuadrados;
	private String reforma;
	private int precio;
	
	//Constructores
	public Piso(String direccion, double metrosCuadrados, String reforma, int precio) {
		super();
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.reforma = reforma;
		this.precio = precio;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metrosCuadrados=" + metrosCuadrados + ", reforma=" + reforma
				+ ", precio=" + precio + "]";
	}
	
	
	//Getters
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public String getReforma() {
		return reforma;
	}
	public void setReforma(String reforma) {
		this.reforma = reforma;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	

}
