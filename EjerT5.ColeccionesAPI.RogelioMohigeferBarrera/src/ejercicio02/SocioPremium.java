package ejercicio02;

public class SocioPremium extends Socio{
	
	private int cantidadFamiliares;


	// Constructor
	
	public SocioPremium(int id, String nombre, String apellidos, int edad, double cuota, boolean activo,
			int cantidadFamiliares) {
		super(id, nombre, apellidos, edad, cuota, activo);
		this.cantidadFamiliares = cantidadFamiliares;
	}
	

	
	// ToString

	@Override
	public String toString() {
		return super.toString() +  "SocioPremium [cantidadFamiliares=" + cantidadFamiliares + "]";
	}
	
	
	// Getters&Setters
	
	public double getCantidadFamiliares() {
		return cantidadFamiliares;
	}

	public void setCantidadFamiliares(int cantidadFamiliares) {
		this.cantidadFamiliares = cantidadFamiliares;
	}

	
	
	// Métodos

	public boolean comprobarBonificacion (int minimoMiembros, int cantidadMiembros) {
		if (cantidadMiembros > minimoMiembros) {
			return true;
		}else {
			return false;
		}
	}
	
	
	@Override
	public double calcularCuota(double bonificacionUno, double bonificacionDos, double descuentoPremium, int minimoMiembros, int cantidadMiembros) {
		// TODO Auto-generated method stub
		final double divisor = 100.0;
		if (comprobarBonificacion (minimoMiembros, cantidadMiembros)){
			return super.calcularCuota(bonificacionUno, bonificacionDos, descuentoPremium, minimoMiembros, cantidadMiembros) * (1-(descuentoPremium/divisor));
		}else {
			return super.calcularCuota(bonificacionUno, bonificacionDos, descuentoPremium, minimoMiembros, cantidadMiembros);
		}
		
	}
	
	public void imprimirPremium () {
		System.out.println("\t\t***PREMIUM***");
	}
	
}
