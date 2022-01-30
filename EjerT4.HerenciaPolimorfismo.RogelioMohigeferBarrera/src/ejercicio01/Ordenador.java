package ejercicio01;

public class Ordenador {
	
	private double capacidadDiscoDuro;
	private double frecuenciaProcesador;
	private double precioBase;
	

	//Constructores
	public Ordenador(double capacidadDiscoDuro, double frecuenciaProcesador, double precioBase) {
		super();
		this.capacidadDiscoDuro = capacidadDiscoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
	}

	
	//ToString
	@Override
	public String toString() {
		return "\nOrdenador [Capacidad disco duro=" + capacidadDiscoDuro + " Gb, frecuencia del procesador=" + frecuenciaProcesador
				+ " GHz, precio base=" + precioBase + " €]";
	}


	//GettersSetters
	public double getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	//Cálculos
	public double calcularPrecioFinal (int comision) {
		int uno = 1;
		double cien = 100.0;
		
		return Math.round(this.precioBase * (uno + comision/cien)*cien)/cien;
	}
	
}
