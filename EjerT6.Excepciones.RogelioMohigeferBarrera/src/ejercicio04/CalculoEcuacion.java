package ejercicio04;

public class CalculoEcuacion {
	
	private double a;
	private double b;
	private double c;
	
	// Constructor 
	
	public CalculoEcuacion(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// ToString
	
	@Override
	public String toString() {
		return "CalculoEcuacion [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	// GandS
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	//Métodos
	
	public void comprobarAB () throws EcuacionDegenerada {
		if (a==0 && b==0) {
			throw new EcuacionDegenerada("La ecuación es degenerada.");
		}
	}
	
	public double calcularDiscriminante () throws RaizCompleja {
		double discriminante = (Math.pow(b, 2) - (4 * a * c));
		if (discriminante>0) {
			return discriminante;
		}else {
			throw new RaizCompleja ("Las raíces son complejas.");
		}
	}
	
	public double[] calcularEc() throws RaizCompleja{
		double[]soluciones;
		if(calcularDiscriminante() == 0) {
			soluciones = new double [1];
			soluciones [0] = ((-b) - (4 * a * c)) / (2 * a);
		}else {
			soluciones = new double [2];
			soluciones[0] = ((-b) + Math.sqrt(calcularDiscriminante())) / (2 * a);
			soluciones[1] = ((-b) - Math.sqrt(calcularDiscriminante())) / (2 * a);
		}
		return soluciones;
	}
	
}
