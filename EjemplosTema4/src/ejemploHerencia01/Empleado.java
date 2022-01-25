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
	
	

}
