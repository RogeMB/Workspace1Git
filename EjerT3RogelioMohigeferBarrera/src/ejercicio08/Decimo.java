package ejercicio08;

public class Decimo {
	
	private int cantidad;
	private double precio;
	private int num;
	
	
	//Constructores
	public Decimo(double precio, int num) {
		this.precio = precio;
		this.num = num;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Decimo [precio=" + precio + ", num=" + num + "]";
	}
	
	//GettersSetters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
}
