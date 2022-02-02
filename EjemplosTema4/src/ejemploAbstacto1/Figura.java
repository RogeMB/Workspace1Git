package ejemploAbstacto1;

public abstract class Figura {
	//puntos para graficar
	
	private double x;
	private double y;
	
	
	//Constructores No lo utilizamos para instanciar sino para definirlo en la subclase
	public Figura(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + ", toString()=" + super.toString() + "]";
	}

	
	//GettersSetters
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	//Métodos
	public abstract double calcularArea ();
	
}