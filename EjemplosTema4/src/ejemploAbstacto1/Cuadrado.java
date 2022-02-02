package ejemploAbstacto1;

public class Cuadrado extends Figura {

	private double lado;
	
	
	//Constructores	
	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}

	//ToString
	@Override
	public String toString() {
		return super.toString() + "Cuadrado [lado=" + lado + "]";
	}

	//Métodos
	@Override
	public double calcularArea() {
		//Implementación del método
		return lado*lado;
	}
	
}
