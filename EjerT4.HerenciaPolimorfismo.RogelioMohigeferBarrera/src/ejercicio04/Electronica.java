
package ejercicio04;

public class Electronica extends Producto{

	private String marca;

	// Contructores
	public Electronica(String nombre, int id, double precio, int stock, String marca) {
		super(nombre, id, precio, stock);
		this.marca = marca;
	}

	
	// ToString
	@Override
	public String toString() {
		return super.toString() + "Electronica [marca=" + marca + "]";
	}

	
	// GettersSetters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	// Métodos
	@Override
	public double calcularPrecioTotal(double porcentajeImpuesto) {
		// TODO Auto-generated method stub
		double divisor = 100.0;
		return getPrecio() * (1 + porcentajeImpuesto/divisor);
	}
	
	@Override

	public String lineaProducto() {
		return super.lineaProducto() + "\t" + this.marca;
	}
	
}
