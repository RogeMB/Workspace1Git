package ejercicio04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Venta {
	
	private LineaVenta linVenta [];
	private String empleado;
	private double precioTotal;
	private Producto listaProductos [];
	private int numTicket;

	
	// Constructores

	public Venta(String empleado, int numTicket, Producto[] listaProductos) {
		this.empleado = empleado;
		this.listaProductos = listaProductos;
		this.numTicket = numTicket;
		this.precioTotal = 0.0;
		this.linVenta = new LineaVenta[0];  
	}


	// ToString
	@Override
	public String toString() {
		return "Venta [linVenta=" + Arrays.toString(linVenta) + ", empleado=" + empleado + ", precioTotal=" + precioTotal
				+ ", listaProductos=" + Arrays.toString(listaProductos) + "]";
	}



	// GettersSetters
	public LineaVenta[] getlinVenta() {
		return linVenta;
	}

	public void setlinVenta(LineaVenta[] linVenta) {
		this.linVenta = linVenta;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Producto[] getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	
	// Métodos
	

	public void addProducto (Producto p, int posicion) {
		listaProductos [posicion] = p;
		p.setStock(p.getStock()+1);
	}
	

	public void mostarProductos () {
		for (int i = 0; i < listaProductos.length; i++) {
			System.out.println(i+". "+ listaProductos[i]);
		}
	}
	
	
	public void addLineaVenta(int cantidad, Producto p) {
		
		linVenta = Arrays.copyOf(linVenta, linVenta.length + 1);
	
		linVenta[linVenta.length-1] = new LineaVenta(cantidad, p);
	}
	
	
	public double calcularTotal(double variacion) {
		double total = 0.0;
		
		for (int i = 0; i < linVenta.length; i++) {
			total += linVenta[i].calcularSubtotal(variacion);
		}
		return total;
	}
	
	

	public void imprimirTiquet(double variacion) {
		LocalDate hoy;
		LocalTime hora;
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm");
		hoy = LocalDate.now();
		hora = LocalTime.now();
		
		System.out.println("\t SUPERMERCADO MERCASEÑORA"
				+ "\n\t\tB2409309"
				+ "\n\tC/Payaso Sánchez Cagajón s/n"
				+ "\n"
				+ "\nEmpleado: "+empleado+"\t Número del ticket: "+numTicket
				+ "\n================================================"
				+ "\nCANT\tPRODUCTO\tPRECIO\t\tSUBTOTAL");
		for (int i = 0; i < linVenta.length; i++) {
			System.out.println(linVenta [i].getCantidad()+"\t"+linVenta[i].getProducto().getNombreParaTicket()+"\t"
					+linVenta[i].calcularPrecioUnitario(variacion)
					+"\t\t"+linVenta[i].calcularSubtotal(variacion));
		}
		System.out.println("================================================"
				+ "\n\t\tTOTAL IVA INCLUIDO: "+calcularTotal(variacion));
		System.out.println("Fecha: " + hoy.format(formatoFecha) + "  Hora: " + hora.format(formatoHora));
		
		System.out.println("===============================================");
		System.out.println("\t\tGRACIAS POR SU VISITA");
	}
	
	public void imprimirTodosLosProductos() {
		System.out.println("======================================================================");
		System.out.println("\t\tLISTADO GENERAL DE PRODUCTOS DE LA TIENDA");
		System.out.println("Nombre\t\tNº Id\tPrecio\tStock\tCaduc / Marca / Talla");
		for (int i=0; i<listaProductos.length; i++ ) {
			System.out.println(listaProductos[i].lineaProducto());
		}
		System.out.println("======================================================================");
	}
	
}

