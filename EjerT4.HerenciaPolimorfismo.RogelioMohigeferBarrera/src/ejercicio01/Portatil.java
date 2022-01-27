package ejercicio01;

public class Portatil extends Ordenador {
	
	private int descuento;

	
	//Constructores
	public Portatil(double capacidadDiscoDuro, double frecuenciaProcesador, double precioBase, int descuento) {
		super(capacidadDiscoDuro, frecuenciaProcesador, precioBase);
		this.descuento = descuento;
	}
	

	//ToString
	@Override
	public String toString() {
		return super.toString() + " Portatil [descuento=" + descuento + "]";
	}
	
	
	//GettersSetters
	public int getDescuento() {
		return descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	//Cálculos
	public double calcularPrecioFinal (int comision) {
		int uno = 1;
		int divisor = 100;
		return super.calcularPrecioFinal(comision) * (uno - this.descuento/divisor);
	}
}