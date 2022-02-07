package ejercicio03;

public class Furgoneta extends VehiculoMotor{
	
	private int cargaUtil;
	private int numeroPlazas;
	
	//Constructores
	public Furgoneta(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible,
			String bastidor, boolean activo, int cargaUtil, int numeroPlazas) {
		super(cilindrada, caballos, cilindros, tipoCombustible, bastidor, activo);
		this.cargaUtil = cargaUtil;
		this.numeroPlazas = numeroPlazas;
	}

	
	//ToString
	@Override
	public String toString() {
		return super.toString() + "Furgoneta [cargaUtil=" + cargaUtil + ", numeroPlazas=" + numeroPlazas + "]";
	}
	

	//GettersSetters
	public int getCargaUtil() {
		return cargaUtil;
	}

	public void setCargaUtil(int cargaUtil) {
		this.cargaUtil = cargaUtil;
	}
	
	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}


	//Métodos
	public double calcularIncrementoCarga () {
		double importe = 0.0;
		if (this.cargaUtil <= 1000) {
			importe = 18.31;
		}else if (this.cargaUtil > 1000 && this.cargaUtil <= 1500) {
			importe = 27.09;
		}else if (this.cargaUtil > 1500 && this.cargaUtil <= 3000) {
			importe = 47.01;
		}else {
			importe = 68.91;
		}
		return importe;
	}
	
	public int incrementoNumeroPlazas () {
		int incrementoPorPlazas = 0;
		if (numeroPlazas == 1) {
			incrementoPorPlazas = 1;
		}else if (numeroPlazas > 1 && numeroPlazas <=2) {
			incrementoPorPlazas = 3;
		}else if (numeroPlazas > 2 && numeroPlazas <=3) {
			incrementoPorPlazas = 5;
		}else if (numeroPlazas > 3 && numeroPlazas <=5) {
			incrementoPorPlazas = 8;
		}else if (numeroPlazas > 5 && numeroPlazas <=8) {
			incrementoPorPlazas = 13;
		}
		return incrementoPorPlazas;
	}
	
	

	@Override
	public double calcularImpuestoCirculacion(double incremento, double incremento2) {
		// TODO Auto-generated method stub
		return super.calcularImpuestoCirculacion(incremento, incremento2) + calcularIncrementoCarga() + incrementoNumeroPlazas();
	}
	
	
	
	
}
