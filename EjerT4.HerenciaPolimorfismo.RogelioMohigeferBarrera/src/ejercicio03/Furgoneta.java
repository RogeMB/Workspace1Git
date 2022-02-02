package ejercicio03;

public class Furgoneta extends VehiculoMotor{
	
	private int cargaUtil;
	
	//Constructores
	public Furgoneta(double cilindrada, double caballos, int cilindros, TipoCombustible tipoCombustible,
			int cargaUtil) {
		super(cilindrada, caballos, cilindros, tipoCombustible);
		this.cargaUtil = cargaUtil;
	}

	
	//ToString
	@Override
	public String toString() {
		return super.toString() + "Furgoneta [cargaUtil=" + cargaUtil + "]";
	}
	

	//GettersSetters
	public int getCargaUtil() {
		return cargaUtil;
	}

	public void setCargaUtil(int cargaUtil) {
		this.cargaUtil = cargaUtil;
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
	
	

	@Override
	public double calcularImpuestoCirculacion() {
		// TODO Auto-generated method stub
		return super.calcularImpuestoCirculacion() + calcularIncrementoCarga();
	}
	
	
	
	
}
