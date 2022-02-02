package ejemploAbstacto1;

public class Rectangulo extends Figura {
	
	private double altura, base;

	//Constructores
	public Rectangulo(double x, double y, double altura, double base) {
		super(x, y);
		this.altura = altura;
		this.base = base;
	}

	//ToString
	@Override
	public String toString() {
		return super.toString() + "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}
	
	//Métodos
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	
}
