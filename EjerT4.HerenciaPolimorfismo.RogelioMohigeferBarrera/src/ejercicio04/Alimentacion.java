package ejercicio04;


import java.time.LocalDateTime;
import java.util.Date;


public class Alimentacion extends Producto {
	
	private Date fechaCaducidad;
	LocalDateTime today = LocalDateTime.now ();

	
	//Constructores
	public Alimentacion(double precio, String nombre, String codigo, Date fechaCaducidad) {
		super(precio, nombre, codigo);
		this.fechaCaducidad = new Date ();
	}


	//ToString
	@Override
	public String toString() {
		return super.toString() + "Alimentacion [fechaCaducidad=" + fechaCaducidad + "]";
	}

	//GettersSetters
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	@Override
	public double calcularPrecioFinal(double descuento) {
		// TODO Auto-generated method stub
		double divisor = 100.0;
		
		if (fechaCaducidad > today.plusDays (2) {
			return getPrecio () - (getPrecio() * descuento/divisor);
		}
		
		return 0;
	}
	
	
	//Métodos
	
}
