package ejercicio04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Alimentacion extends Producto implements ICaducable{
	
	private LocalDate fechaCaducidad;
	

	public Alimentacion(String nombre, int id, double precio, int stock, LocalDate fechaCaducidad) {
		super(nombre, id, precio, stock); // Constructor
		this.fechaCaducidad = fechaCaducidad;
	}


	
	
	@Override
	public String toString() {
		return super.toString() + "Alimentacion [fechaCaducidad=" + fechaCaducidad + "]"; // ToString
	}
	
	

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;	// GettersSetters
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	
	

	@Override
	public double calcularPrecioTotal(double porcentajeDescuento) {	// Métodos
		// TODO Auto-generated method stub
		double divisor = 100.0;
		return getPrecio() * (1- porcentajeDescuento/divisor);
	}

	@Override
	public boolean calcularCaducado () {
		LocalDate hoy; 
		long dias;
		
		hoy = LocalDate.now();
		dias = ChronoUnit.DAYS.between(hoy, fechaCaducidad);
		
		if(dias <=2) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String lineaProducto() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return super.lineaProducto() + "\t" + this.fechaCaducidad.format(formatoFecha);
	}
	
	@Override
	public String getNombreParaTicket() {
		String miNombre;
		miNombre = this.getNombre();
		if (calcularCaducado()) {
			miNombre += "*";
		}
		return ponerLongitudCadena(miNombre,15);
	}
	
}
