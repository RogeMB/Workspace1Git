package ejercicio01Examen;

public class Suite extends HabitacionEstandar {
	
	private double metrosCuadrados;
	private double gastoExtra;

	
	
	
	public Suite(double precioBase, boolean esLibre, String nombreCliente, int numeroDias, int numeroOcupantes,
			double metrosCuadrados, double gastoExtra) {
		super(precioBase, esLibre, nombreCliente, numeroDias, numeroOcupantes);
		this.metrosCuadrados = metrosCuadrados;
		this.gastoExtra = gastoExtra;
	}

	
	
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getGastoExtra() {
		return gastoExtra;
	}

	public void setGastoExtra(double gastoExtra) {
		this.gastoExtra = gastoExtra;
	}



	@Override
	public String toString() {
		return super.toString() + "Suite [metrosCuadrados=" + metrosCuadrados + ", gastoExtra=" + gastoExtra + "]";
	}



	@Override
	public double calcularPrecio(double porc) {
		// TODO Auto-generated method stub
		double divisor = 100.0;
		return super.calcularPrecio(porc) + this.gastoExtra-(super.calcularPrecio(porc)) ;
	}

	
	
	
}
