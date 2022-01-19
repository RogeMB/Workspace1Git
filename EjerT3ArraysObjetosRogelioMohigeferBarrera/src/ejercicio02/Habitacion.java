package ejercicio02;

import java.util.Arrays;

public class Habitacion {
	/*Se podrá crear una habitación (cuyos atributos serán tipo, precio, qué servicios extra tiene, nombre de
	cliente asignado, número de días contratados, etc.) ver si está ocupada o no, calcular precio final
	según número de días, servicios extra contratados y consumo del minibar, mostrar factura,
	comprobar si está “limpia” (que ha pasado la limpiadora cada día) y aquellos métodos que se quieran
	añadir. Crear un main de prueba.*/
	
	private String tipo;
	private double precio;
	private boolean [] extras;
	private String nombreCliente;
	private int numDias;
	private boolean ocupacion;
	private double gastoMinibar;
	private boolean limpia;
	private double precioFinal;
	
	//Constructores
	public Habitacion(String tipo, double precio, boolean[] extras, String nombreCliente, int numDias,
			boolean ocupacion, double gastoMinibar, boolean limpia, double precioFinal) {
		this.tipo = tipo;
		this.precio = precio;
		this.extras = extras;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.ocupacion = ocupacion;
		this.gastoMinibar = gastoMinibar;
		this.limpia = limpia;
		this.precioFinal = precioFinal;
	}

	
	public Habitacion() {
		super();
	}
	
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precio=" + precio + ", extras=" + Arrays.toString(extras)
				+ ", nombreCliente=" + nombreCliente + ", numDias=" + numDias + ", ocupacion=" + ocupacion
				+ ", gastoMinibar=" + gastoMinibar + ", limpia=" + limpia + ", precioFinal=" + precioFinal + "]";
	}
	
	//GettersSetters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean[] getExtras() {
		return extras;
	}

	public void setExtras(boolean[] extras) {
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

	public double getGastoMinibar() {
		return gastoMinibar;
	}

	public void setGastoMinibar(double gastoMinibar) {
		this.gastoMinibar = gastoMinibar;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	
}
