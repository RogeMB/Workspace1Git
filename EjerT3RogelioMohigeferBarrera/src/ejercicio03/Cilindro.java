package ejercicio03;

public class Cilindro {
	
	private double radio, altura;
	int dos = 2;
	
	public Cilindro (double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	public Cilindro () {		
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double CalcularVolumen () {
		return Math.PI*Math.pow(radio, dos)*altura;
	}
	
}
