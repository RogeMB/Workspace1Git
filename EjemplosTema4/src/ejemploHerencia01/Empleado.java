package ejemploHerencia01;

public class Empleado extends Trabajador {
	
	private double sueldo;
	private double impuestos;
	
	//Constructor_heredado
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return super.toString() + " Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}

	
	//GettersSetters
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	//Cálculos
	
	public double calcularPaga () {  //REESCRIBIR UN METODO. NO SE LE PASA VARIABLES PUES ESO SERIA SOBRECARGAR
		double divisor = 100.0;
		return this.sueldo - (this.impuestos*this.sueldo / divisor);
	}
	
	

}
