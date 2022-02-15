package ejercicio05;

public class Empleado {
	/* Ésta es la superclase, de la que derivan los distintos tipos de empleados.
	 * Como no es abstracta, se podrán crear objetos de este tipo, que serán Empleados Genéricos.
	 * Para saber que un empleado es genérico o de otro tipo, usaremos una variable:
	 * 
	 * tipoEmpleado -->  cuyos valores pueden ser:  0=Genérico, 1=A Comisión, 2=Fijo.
	 * 
	 * Esta variable valdrá 0 por defecto. Los constructores de las subclases deben encargarse
	 * de cambiarla al valor de sus respectivos tipos.
	 */
	String nombre;
	int numEmpleado;
	double sueldoBase, ventas;
	boolean activo;		// Se pondrá a false cuando la persona ya deje de ser empleado.
	
	double cero = 0.0;
	
	
	// Constructor ------------------------------------
	public Empleado(int numEmpleado, String nombre, double sueldoBase) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.ventas = cero;
		this.activo = true;
	}
	
	
	
	// Getters and Setters ----------------------------
	// No se permite cambiar el número de empleado
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
	


	
	// Otros métodos -----------------------------------
	
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
