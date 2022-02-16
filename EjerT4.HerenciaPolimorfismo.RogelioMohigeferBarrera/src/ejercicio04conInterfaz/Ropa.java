package ejercicio04conInterfaz;

public class Ropa extends Producto {
	
	private int talla;

	// Constructor
	public Ropa(String nombre, int id, double precio, int stock, int talla) {
		super(nombre, id, precio, stock);
		this.talla = talla;
	}


	
	// ToString
	@Override
	public String toString() {
		return super.toString() + "Ropa [talla=" + talla + "]";
	}

	
	//GettersSetters
	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}


	// Métodos
	@Override
	public double calcularPrecioTotal(double variacion) {
		return getPrecio();
	}
	
	@Override
	
	public String lineaProducto() {
		return super.lineaProducto() + "\t" + this.talla;
	}
	
}
