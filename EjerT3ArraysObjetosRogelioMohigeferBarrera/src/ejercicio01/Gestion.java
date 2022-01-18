package ejercicio01;

import java.util.Arrays;

public class Gestion {
	
	private Producto [] productos;
	
	
	//Constructores
	public Gestion(Producto[] productos) {
		this.productos = productos;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Gestion [productos=" + Arrays.toString(productos) + "]";
	}
	
	//GettersSetters
	public Producto[] getProductos() {
		return productos;
	}


	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}


	//MetodosdeCalculo
	public double ventaPublico (int codProd ) {
		return productos [codProd].getPrecioFab()+(productos[codProd].getCodProd()*productos[codProd].getTasacion()/100);
	}
	
	public void imprimirVentaPublico (int codProd) {
		System.out.printf("El %s tiene un precio de venta al público de %.2f €\n", productos[codProd].getNombre(), ventaPublico(codProd));
	}
	
	public void annadirProductoLista (Producto producto ) {
		productos [producto.getCodProd()]=producto;
	}
	
	public void mostrarListaProductos (int nPs) {
		for (int i = 0; i<nPs; i++) {
			System.out.println(productos [i]);
		}
	}
	
	public boolean añadirFragil (String sFragil) {
		if (sFragil.equalsIgnoreCase("Si")) {
			return true;
		}else {
			return false;
		}
	}
	

}
