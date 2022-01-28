package ejercicio;

public class Piso {
	
	private String direccion;
	private int metrosCuadrados;
	private int reforma;
	private int precio;

	
	
	//Constructores
	public Piso(String direccion, int metrosCuadrados, int reforma, int precio) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.reforma = reforma;
		this.precio = precio;
	}
	
	public Piso () {
		
	}

	
	//GettersSetters
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getReforma() {
		return reforma;
	}

	public void setReforma(int reforma) {
		this.reforma = reforma;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	//ToString
	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", metrosCuadrados=" + metrosCuadrados + ", reforma=" + reforma
				+ ", precio=" + precio + "]";
	}
	
	//Metodos
	
	public boolean reforma (int reforma) {
		if (reforma ==1 ) {
			return true;
		}else {
			return false;
		}
	}

}
