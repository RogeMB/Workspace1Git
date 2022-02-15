package ejercicio05;

public class EmpleadoAComision extends Empleado {
	int porcentajeComision;   // En tantos por ciento
	double comisionObtenida;  // En € (se añade al sueldoBase para obtener el sueldo Final)
	
	double cien = 100.0;

	// Constructor -------------------------------
	public EmpleadoAComision(int numEmpleado, String nombre, double sueldoBase, int porcentajeComision) {
		super(numEmpleado, nombre, sueldoBase);
		this.porcentajeComision = porcentajeComision;
		this.comisionObtenida = cero;  // atributo double de la superclase Empleado
	}
	
	
	
	// Getters and Setters -----------------------
	// No tiene sentido setComisionObtenida, porque se calcula desde ventas y porcentajeComision
	public int getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(int porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public double getComisionObtenida() {
		return comisionObtenida;
	}

	

	// Otros métodos -----------------------------
	
	// setVentas (hay que redefinirlo, porque hay que calcular las comisiones):
	@Override
	public void setVentas(double ventas) {
		super.setVentas(ventas);
		comisionObtenida = ventas * porcentajeComision / cien;
	}
	
	// Aumentar las ventas en una cantidad (hay que redefinirlo, porque hay que calcular las comisiones)
	@Override
	public void setNuevasVentas(double importe) {
		super.setNuevasVentas(importe);
		comisionObtenida += importe * porcentajeComision / cien;
	}
	
	// Calcular sueldo neto final del mes:
	@Override
	public double calcularSueldoNetoFinal() {
		return super.calcularSueldoNetoFinal() + comisionObtenida;
	}
	
	// Inicializar (nuevo mes):
	@Override
	public void inicializar () {
		super.inicializar();
		this.comisionObtenida = cero;
	}
	
	// toString:
	@Override
	public String toString() {
		// Las comisiones están actualizadas, porque se hacen en cada venta.
		String felicidades = "€.";
		if (comisionObtenida > 500.0)
			felicidades = "€ ¡¡FELICIDADES!!";
		return super.toString() + 
				"\n\t[Modalidad: \"A comisión\". Comisiones: " + comisionObtenida + felicidades + " Porcentaje de comisión: " + porcentajeComision + "%]";
	}

}
