package ejercicio05;

public class Empleado {

	String nombre;
	int numEmpleado;
	double sueldoBase, ventas;
	boolean activo;		// Se pondrá a false cuando la persona ya deje de ser empleado.
	
	double cero = 0.0;
	
	
	// Constructor 
	public Empleado(int numEmpleado, String nombre, double sueldoBase) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.ventas = cero;
		this.activo = true;
	}
	
	
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	


	
	// Otros métodos
	
	// Aumentar las ventas en una cantidad:
	public void setNuevasVentas(double importe) {
		this.ventas += importe;
	}
	
	// Calcular sueldo neto final del mes:
	public double calcularSueldoNetoFinal() {
		return sueldoBase;
	}
	
	// Inicializar (nuevo mes):
	public void inicializar () {
		setVentas(cero);
	}
	
	// toString:
	public String toString() {
		return "[Empleado nº: " + numEmpleado + ". Nombre: " + nombre + ". Sueldo base: " + sueldoBase + "€. Ventas: " 
				+ ventas + "€. Sueldo final: " + calcularSueldoNetoFinal() + "€]";
	}
}
