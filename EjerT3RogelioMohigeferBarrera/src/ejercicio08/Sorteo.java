package ejercicio08;

import java.util.Random;

public class Sorteo {
	
	private int numPremiado;
	private int premioEconomico;
	private Decimo d;
	private boolean sorteoEfectuado;
	
	
	//Contructores
	
	public Sorteo(int numPremiado, int premioEconomico, Decimo d) {
		this.numPremiado = numPremiado;
		this.premioEconomico = premioEconomico;
		this.d = d;
	}
	
	public Sorteo() {
		
	}

	
	//ToString

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
	
	public int getPremioEconomico() {
		return premioEconomico;
	}

	public void setPremioEconomico(int premioEconomico) {
		this.premioEconomico = premioEconomico;
	}
	
	public boolean getSorteoEfectuado() {
		return sorteoEfectuado;
	}

	public void setSorteoEfectuado(boolean sorteoEfectuado) {
		this.sorteoEfectuado = sorteoEfectuado;
	}
	
	
	//MétodosCálculo

	public int calcularPremiado () {
		int max = 99999;
		int min = 0;
		Random num = new Random (System.nanoTime());
		numPremiado= num.nextInt(max - min + 1) + min;
		sorteoEfectuado=true;
		return numPremiado;
	}
	
	public boolean verificarPremiado (int cartera []) {
		for (int i = 0; i<cartera.length; i++) {
			if (numPremiado==cartera [i]) {
				return true;
			}
		}
		return false;
	}
	
	public int calcularGanancias (int precio, int cantidad, boolean gana, int premio) {
		int premioEconomico = 0;
		if (gana) {
			premioEconomico = premio-(cantidad * precio);
		} else {
			premioEconomico = -(cantidad * precio);
		}
		return premioEconomico;
	}
	
	//impresión
	public void imprimirGanador () {
		System.out.println(numPremiado);
	}

}
