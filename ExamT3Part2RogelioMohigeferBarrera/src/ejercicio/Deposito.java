package ejercicio;

public class Deposito {
	
	private double altura;
	private double radio;
	private int litros;
	private double precio;
	/*private double volumen;*/

	
	
	
	//Constructores
	public Deposito(double altura, double radio, int litros, double precio, double volumen) {
		this.altura = altura;
		this.radio = radio;
		this.litros = litros;
		this.precio = precio;
		/*this.volumen = volumen;*/
	}

	public Deposito() {
		
	}

	
	//ToString
	@Override
	public String toString() {
		return "Deposito [altura=" + altura + ", radio=" + radio + ", litros=" + litros + ", precio=" + precio
				+ /*", volumen=" + volumen + */"]";
	}
	

	//GettersSetters
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/*
	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
*/
	
	//Calculos
	public double calcularVolumen () {
		return altura*Math.PI*Math.pow(radio, 2)*1000; 
	}
	
}
	