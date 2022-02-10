package ejercicio03;
/**
 * Sub class of VehiculoMotor
 * @version JDK 11. Minimum JDK 5
 * @see VehiculoMotor package
 * 
 */
public class Motocicleta extends VehiculoMotor {
	
	
	// Constructors
	public Motocicleta(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible,
			String bastidor,  boolean activo) {
		super(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo);

	}

	// ToString
	@Override
	public String toString() {
		return "Motocicleta []";
	}

	
	
	// Methods
	/**
	 * @see calcularImpuestoCirculacion && importePotencia in VehiculoMotor class
	 * @return ImpuestoCirculacion with an extra tax amount depending of the power defined in Principal by user
	 */
	@Override
	public double calcularImpuestoCirculacion(int incremento) {
		// TODO Auto-generated method stub
		double divisor = 100.00; 
		return super.calcularImpuestoCirculacion(incremento) + incremento * (super.calculoPotenciaHP()/divisor);
	}

	

}
