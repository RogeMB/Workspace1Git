package ejercicio03;

public class Coche extends VehiculoMotor {
	
	
	//Constructores
	public Coche(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible, 
			String bastidor, boolean activo) {
		super(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo);
	}

	

	//ToString
	@Override
	public String toString() {
		return super.toString() + "Coche []";
	}




	//Métodos
	@Override
	public double calcularImpuestoCirculacion(int incremento) {
		// TODO Auto-generated method stub
		double divisor = 100.00;
		return super.calcularImpuestoCirculacion(incremento)+ incremento * (super.calculoCM3()/divisor);
	}
	
	
	
}
