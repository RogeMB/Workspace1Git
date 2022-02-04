package ejercicio03;

public class Motocicleta extends VehiculoMotor {
	
	private double incremento;
	
	//Constructores
	public Motocicleta(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible,
			String bastidor,  boolean activo, double incremento) {
		super(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo);
		this.incremento = incremento;
	}

	//ToString
	@Override
	public String toString() {
		return super.toString() + "Motocicleta [incremento=" + incremento + "]";
	}

	
	//GettersSetters
	public double getIncremento() {
		return incremento;
	}

	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}
	
	
	//Métodos
	@Override
	public double importePotencia(/*double incremento*/) {
		// TODO Auto-generated method stub
		return super.importePotencia() * incremento;
	}

}
