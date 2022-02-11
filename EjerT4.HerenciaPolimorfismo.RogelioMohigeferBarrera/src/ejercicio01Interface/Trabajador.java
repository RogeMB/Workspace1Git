package ejercicio01Interface;

public class Trabajador implements IImpuesto{
	
	private String nombre;
	private double sueldoBruto;
	
	// constructors
	public Trabajador(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldoBruto = sueldo;
	}


	// ToString
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", sueldo bruto=" + sueldoBruto + "]";
	}

	
	// GettersSetters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldoBruto;
	}

	public void setSueldo(double sueldo) {
		this.sueldoBruto = sueldo;
	}



	
	
	// Methods
	
	// Tramos IRPF
	public int calcularTramo () {
		if (this.sueldoBruto <= 12000)
			return 1;
		else if (this.sueldoBruto > 12000 && this.sueldoBruto <= 20000)
			return 10;
		else if (this.sueldoBruto > 20000 && this.sueldoBruto <= 35000)
			return 20;
		else if (this.sueldoBruto >35000 && this.sueldoBruto <= 50000)
			return 30;
		else 
			return 40;
	}
	
	
	@Override
	public double calculoIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		double divisor= 100.0;
		return (sueldo/divisor) * (double)calcularTramo();
	}
		
}
