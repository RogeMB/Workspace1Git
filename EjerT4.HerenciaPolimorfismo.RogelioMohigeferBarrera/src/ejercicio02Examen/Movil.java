package ejercicio02Examen;

public class Movil extends Producto {
	
	private String marca;
	private String modelo;

	
	// Constructor
	public Movil(double precioBase, int cantidadStock, String nombre, boolean activo, String marca, String modelo) {
		super(precioBase, cantidadStock, nombre, activo);
		this.marca = marca;
		this.modelo = modelo;
	}


	
	// ToString
	@Override
	public String toString() {
		return super.toString() + "Movil [marca=" + marca + ", modelo=" + modelo + "]";
	}


	// GandS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	

	// Metodos
	public double calcularPVP(double porcentaje, int fijo) {
		// TODO Auto-generated method stub
		double divisor = 100.0;
		return super.calcularPVP(porcentaje, fijo) + getPrecioBase () * (1+(porcentaje/divisor));		
	}
	
	
	
	
}
