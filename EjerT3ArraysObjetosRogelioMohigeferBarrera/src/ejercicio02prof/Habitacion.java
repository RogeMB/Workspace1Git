package ejercicio02prof;

public class Habitacion {
	/*Se podrá crear una habitación (cuyos atributos serán tipo, precio, qué servicios extra tiene, nombre de
	cliente asignado, número de días contratados, etc.) ver si está ocupada o no, calcular precio final
	según número de días, servicios extra contratados y consumo del minibar, mostrar factura,
	comprobar si está “limpia” (que ha pasado la limpiadora cada día) y aquellos métodos que se quieran
	añadir. Crear un main de prueba.*/
	
	private int tipo;
	private double precio;
	private boolean extras;
	private String nombreCliente;
	private int numDias;
	private boolean ocupacion;
	private boolean limpia;
	
	//Constructores
	public Habitacion(int tipo, double precio, boolean extras, String nombreCliente, int numDias,
			boolean ocupacion, boolean limpia) {
		this.tipo = tipo;
		this.precio = precio;
		this.extras = extras;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.ocupacion = ocupacion;
		this.limpia = limpia;
	}

	
	public Habitacion() {
		super();
	}
	
	//ToString
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precio=" + precio + ", extras=" + extras + ", nombreCliente="
				+ nombreCliente + ", numDias=" + numDias + ", ocupacion=" + ocupacion + ", limpia=" + limpia + "]";
	}

	//GettersSetters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public boolean isOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}
	
}
