package ejercicio02Examen;

public abstract class Producto implements IInterfable {
	
	private double precioBase;
	private int cantidadStock;
	private String nombre;
	private boolean activo;
	
	
	// Constructor
	public Producto(double precioBase, int cantidadStock, String nombre, boolean activo) {
		super();
		this.precioBase = precioBase;
		this.cantidadStock = cantidadStock;
		this.nombre = nombre;
		this.activo = activo;
	}
	
	
	// GandS
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	//ToString

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidadStock=" + cantidadStock + ", nombre=" + nombre
				+ ", activo=" + activo + "]";
	}


	
	// Métodos
	
	@Override
	public double calcularPVP(double porcentaje, int fijo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void avisarPeligro() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
