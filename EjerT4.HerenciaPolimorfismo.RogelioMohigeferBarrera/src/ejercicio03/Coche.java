package ejercicio03;

import org.w3c.dom.ranges.Range;

public class Coche extends VehiculoMotor {
	
	private double incremento;
	private int numeroPlazas; 
	
	//Constructores
	public Coche(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible, double incremento,
			int numeroPlazas) {
		super(cilindrada, caballos, cilindros, tipoCombustible);
		this.incremento = 1.25;
		this.numeroPlazas = numeroPlazas;
	}


	
	//ToString
	@Override
	public String toString() {
		return super.toString() + "Coche [incremento=" + incremento + ", numeroPlazas=" + numeroPlazas + "]";
	}


	
	//GettersSetters
	public double getIncremento() {
		return incremento;
	}

	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}


	//Métodos
	
	//fibo
	public int incrementoNumeroPlazas () {
		int incrementoPorPlazas = 0;
		if (numeroPlazas >= 0 && numeroPlazas <=1) {
			incremento = 1;
		}else if (numeroPlazas >= 1 && numeroPlazas <=2) {
			incremento = 3;
		}else if (numeroPlazas >= 2 && numeroPlazas <=3) {
			incremento = 5;
		}else if (numeroPlazas >= 3 && numeroPlazas <=5) {
			incremento = 8;
		}else if (numeroPlazas >= 5 && numeroPlazas <=8) {
			incremento = 13;
		}else if (numeroPlazas >= 8 && numeroPlazas <=13) {
			incremento = 21;
		}
		
		return incrementoPorPlazas;
	}
	
	@Override
	public double importeCM3() {
		// TODO Auto-generated method stub
		return (super.importeCM3() * incremento) + incrementoNumeroPlazas();
	}
	
}
