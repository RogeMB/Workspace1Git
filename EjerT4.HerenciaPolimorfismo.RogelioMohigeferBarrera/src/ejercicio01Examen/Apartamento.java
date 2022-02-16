package ejercicio01Examen;

public class Apartamento extends HabitacionEstandar {
	
	private boolean servicioLimpieza;  // se puede hacer sin booleano
	private double precioServicioLimpieza;
	
	
	public Apartamento(double precioBase, boolean esLibre, String nombreCliente, int numeroDias, int numeroOcupantes,
			boolean servicioLimpieza, double precioServicioLimpieza) {
		super(precioBase, esLibre, nombreCliente, numeroDias, numeroOcupantes);
		this.servicioLimpieza = servicioLimpieza;
		this.precioServicioLimpieza = precioServicioLimpieza;
	}


	@Override
	public String toString() {
		return super.toString() + "Apartamento [servicioLimpieza=" + servicioLimpieza + ", precioServicioLimpieza="
				+ precioServicioLimpieza + "]";
	}


	
	
	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	public double getPrecioServicioLimpieza() {
		return precioServicioLimpieza;
	}

	public void setPrecioServicioLimpieza(double precioServicioLimpieza) {
		this.precioServicioLimpieza = precioServicioLimpieza;
	}

	
	

	@Override
	public double calcularPrecio(double porc) {
		// TODO Auto-generated method stub
		if (servicioLimpieza) {
			return super.calcularPrecio(porc)+precioServicioLimpieza;
		}else {
			return super.calcularPrecio(porc);
		}
		
	}
	
	
	
	
	
	
	
	

}
