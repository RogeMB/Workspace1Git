package ejercicio01;

public class Tablet extends Ordenador {
	
	private double precioSeguroPantalla;


	//Constructor
	public Tablet(double capacidadDiscoDuro, double frecuenciaProcesador, double precioBase,
			double precioSeguroPantalla) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase);
		this.precioSeguroPantalla = precioSeguroPantalla;
	}


	//ToString
	@Override
	public String toString() {
		return super.toString() + " Tablet [Precio del seguro pantalla=" + precioSeguroPantalla + "€]";
	}


	//GettersSetters
	public double getPrecioSeguroPantalla() {
		return precioSeguroPantalla;
	}

	public void setPrecioSeguroPantalla(double precioSeguroPantalla) {
		this.precioSeguroPantalla = precioSeguroPantalla;
	}
	
	
	//Cálculos
	public double calcularPrecioFinal (int comision) {
		return super.calcularPrecioFinal(comision) + this.precioSeguroPantalla;
	}
	
}
