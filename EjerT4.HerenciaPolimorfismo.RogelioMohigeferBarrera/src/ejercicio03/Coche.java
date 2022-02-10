package ejercicio03;

/**
 * @version JDK Minimum JDK 5
 * @author mohigefer.barog22
 */
public class Coche extends VehiculoMotor {
	
	
	// Constructors
	public Coche(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible, 
			String bastidor, boolean activo) {
		super(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo);
	}

	

	// ToString
	@Override
	public String toString() {
		return super.toString() + "Coche []";
	}



	/**
	 * @see calcularImpuestoCirculacion && importeCM3 in VehiculoMotor class
	 * @return ImpuestoCirculacion with an extra tax amount depending of the CM3 defined in Principal by user
	 */
	// Methods
	@Override
	public double calcularImpuestoCirculacion(int incremento) {
		// TODO Auto-generated method stub
		double divisor = 100.00;
		return super.calcularImpuestoCirculacion(incremento)+ incremento * (super.calculoCM3()/divisor);
	}
	
	
	
}
