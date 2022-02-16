package ejercicio05;

public class EmpleadoFijo extends Empleado {
	int porcentajeRetencion;
	double retencion;

	double cien = 100.0;
	
	
	// Constructor
	public EmpleadoFijo(int numEmpleado, String nombre, double sueldoBase, int porcentajeRetencion) {
		super(numEmpleado, nombre, sueldoBase);
		this.porcentajeRetencion = porcentajeRetencion;
		this.retencion = cero;  // atributo double de la super clase Empleado
	}
	
	// ToString:
		@Override
		public String toString() {
			actualizarRetencion();
			return super.toString() + 
					"\n\t[Modalidad: \"Fijo\". Retenciones: " + retencion + ". Porcentaje de retencion: " + porcentajeRetencion + "%]";
		}

	
	// Setters and getters

	public int getPorcentajeRetencion() {
		return porcentajeRetencion;
	}

	public void setPorcentajeRetencion(int porcentajeRetencion) {
		this.porcentajeRetencion = porcentajeRetencion;
	}

	public double getRetencion() {
		return retencion;
	}
	

	
	// métodos 
	public void actualizarRetencion() {
		this.retencion = sueldoBase * porcentajeRetencion / cien;
	}
		
	// Calcular sueldo neto final del mes:
	@Override
	public double calcularSueldoNetoFinal() {

		actualizarRetencion();
		return super.calcularSueldoNetoFinal() - retencion;
	}
	
	// Inicializar (nuevo mes):
	@Override
	public void inicializar () {
		super.inicializar();
		this.retencion = cero;
	}
	
	
}
