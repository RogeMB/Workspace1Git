package ejercicio03;

public class Motocicleta extends VehiculoMotor {
	
	
	//Constructores
	public Motocicleta(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible,
			String bastidor,  boolean activo) {
		super(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo);

	}

	//ToString
	@Override
	public String toString() {
		return "Motocicleta []";
	}

	
	
	//Métodos
	@Override
	public double calcularImpuestoCirculacion(int incremento) {
		// TODO Auto-generated method stub
		double divisor = 100.00; 
		return super.calcularImpuestoCirculacion(incremento) + incremento * (super.calculoPotenciaHP()/divisor);
	}

	

}
