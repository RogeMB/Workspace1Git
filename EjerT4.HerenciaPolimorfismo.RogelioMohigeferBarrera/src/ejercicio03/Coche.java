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
	public double importeCM3(double incremento) {
		// TODO Auto-generated method stub
		double divisor = 100.00;
		return super.importeCM3(incremento) * (1+ incremento/divisor);
	}



	@Override
	public double calcularImpuestoCirculacion() {
		// TODO Auto-generated method stub
		return super.calcularImpuestoCirculacion(105)+ super.calculoCM3()*0.25;1.7
	}
	
	
	
}
