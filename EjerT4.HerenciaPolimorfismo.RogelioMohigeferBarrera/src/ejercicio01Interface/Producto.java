package ejercicio01Interface;

public class Producto implements IImpuesto{

	private double precioSinIva;
	private int iva;
	
	// constructors
	public Producto (double precio, int iva) {
		super();
		this.precioSinIva = precio;
		this.iva = iva;
	}


	// ToString
	@Override
	public String toString() {
		return "Producto [precio sin IVA=" + precioSinIva + "€, iva=" + iva + "%]";
	}
	
	
	
	// GettersSetters
	public double getPrecio() {
		return precioSinIva;
	}

	public void setPrecio(double precio) {
		this.precioSinIva = precio;
	}
	
	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	
	
	// Methods
	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		double cien = 100.0;
		return Math.round(precio  * (1+(double)iva/cien)*cien)/cien;
	}


	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
