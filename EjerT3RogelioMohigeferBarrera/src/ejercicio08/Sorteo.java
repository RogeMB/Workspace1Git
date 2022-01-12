package ejercicio08;

import java.util.Random;

public class Sorteo {
	
	private int numPremiado;
	private Decimo d;
	
	
	//Contructores
	public Sorteo(int numPremiado, Decimo d) {
		this.numPremiado = numPremiado;
		this.d = d;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Sorteo [numPremiado=" + numPremiado + ", d=" + d + "]";
	}

	//GettersSetters
	public int getNumPremiado() {
		return numPremiado;
	}
	
	public void setNumPremiado(int numPremiado) {
		this.numPremiado = numPremiado;
	}
	
	public Decimo getD() {
		return d;
	}
	
	public void setD(Decimo d) {
		this.d = d;
	}
	
	//Aleatorio
	public int calcularAleatorio (int min, int max) {
		int valor = 0;
		Random num = new Random (System.nanoTime());
		valor= num.nextInt(max - min + 1) + min;
		return valor;
	}
	

}
