package ejercicio04;

public class Venta {
	
	LineaVenta listado [];
	private double total;
	private String empleado;
	
	/*añadir producto*/
	public void addLineaVenta (int posicion, LineaVenta lv) {
		listado [posicion] = lv;
		numProductos++;
	}
	
	public double calcularPrecioUnProducto (Producto p, double descuento) {
		return p.calcularPrecioFinal(descuento);
	}
	
	public double calcularSumaV0 (double descuento) {
		double total = 0.0;
		for (int i = 0; i < listado.length; i++) {
			total += calcularPrecioUnProducto   (listado [i].getProducto(), descuento);
		}
		return total;
	}
	
	
	public double calcularSuma (double descuento) {
		double total = 0.0;
		for (int i = 0; i < listado.length; i++) {
			total += listado [i].getProducto().calcularPrecioFinal (descuento);
		}
		return total;
	}
}
