package ejercicio04conInterfaz;

public class LineaVenta {
	
	private int cantidad;
	private Producto p;

	
	
	
	public LineaVenta(int cantidad, Producto p) {	// Constructores
		super();
		this.cantidad = cantidad;
		this.p = p;

	}

	// ToString
	
	@Override
	public String toString() {
		return super.toString() + "LineaVenta [cantidad=" + cantidad + ", p=" + p + "]";
	}
	
	
	
	
	public int getCantidad() {		// GettersSetters
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Producto getProducto() {
		return p;
	} 
	
	public void setP(Producto p) {
		this.p = p;
	}
	
	
	
	// Métodos
	public double calcularPrecioUnitario (double variacion) {			
		double cero = 0.0;		
		
		if (p instanceof Alimentacion) {	
			variacion = 50;
			if (((Alimentacion)p).calcularCaducado()) {
				return p.calcularPrecioTotal(variacion);
			} else {
				return p.calcularPrecioTotal(cero);
			}
		} else {
				return p.calcularPrecioTotal(variacion);
		}
	}
	
	
	public double calcularSubtotal(double variacion) {
		p.setStock(p.getStock() - cantidad);
		return calcularPrecioUnitario(variacion) * cantidad;
	}
	
}
