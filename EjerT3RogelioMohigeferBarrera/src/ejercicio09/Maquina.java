package ejercicio09;


public class Maquina {
	private double recaudacion = 0;
	String contrasenna = new String("Nomelase");  // Contraseña por defecto
	private double cambio;
	
	// Setters and Getters
	public double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	
	public String getContrasenna() {
		return contrasenna;
	}

	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}
	
	
	// Métodos
	public double calcularCambio (double precio, double ingreso) {
		cambio=ingreso-precio;
		return cambio;
	}
	
	public void ventaCancelada() {
		System.out.println("\n***Venta cancelada***");
	}

	public void error() {
		System.out.println("\n\t****** ERROR ******");
	}
}
