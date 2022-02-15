package ejercicio05;

public class EmpleadoFijo extends Empleado {
	int porcentajeRetencion;
	double retencion;

	double cien = 100.0;
	
	
	// Constructor -----------------------------------------
	public EmpleadoFijo(int numEmpleado, String nombre, double sueldoBase, int porcentajeRetencion) {
		super(numEmpleado, nombre, sueldoBase);
		this.porcentajeRetencion = porcentajeRetencion;
		this.retencion = cero;  // atributo double de la super clase Empleado
	}


	
	// Setters and getters ---------------------------------
	// No hay setRetencion porque se calcula desde el sueldoBase
	public int getPorcentajeRetencion() {
		return porcentajeRetencion;
	}

	public void setPorcentajeRetencion(int porcentajeRetencion) {
		this.porcentajeRetencion = porcentajeRetencion;
	}

	public double getRetencion() {
		return retencion;
	}
	

	
	// Otros métodos ---------------------------------------
	// Actualizar las retenciones.
	// Las retenciones deben actualizarse antes de acceder a ellas:
	public void actualizarRetencion() {
		this.retencion = sueldoBase * porcentajeRetencion / cien;
	}
		
	// Calcular sueldo neto final del mes:
	@Override
	public double calcularSueldoNetoFinal() {
		// Actualizamos las retenciones:
		actualizarRetencion();
		return super.calcularSueldoNetoFinal() - retencion;
	}
	
	// Inicializar (nuevo mes):
	@Override
	public void inicializar () {
		super.inicializar();
		this.retencion = cero;
	}
	
	// toString:
	@Override
	public String toString() {
		// Actualizamos las retenciones:
		actualizarRetencion();
		return super.toString() + 
				"\n\t[Modalidad: \"Fijo\". Retenciones: " + retencion + ". Porcentaje de retencion: " + porcentajeRetencion + "%]";
	}
}
