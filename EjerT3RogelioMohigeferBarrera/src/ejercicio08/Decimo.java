package ejercicio08;

import java.util.Random;
import java.util.Arrays;

public class Decimo {
	
	private int cantidad;
	private int precio;
	private int [] cartera;
	private int decimo;
	private int premio;
	
	
	//Constructores
	
	

	
	//ToString

	
	//GettersSetters
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public int[] getCartera() {
		return cartera;
	}

	public void setCartera(int[] cartera) {
		this.cartera = cartera;
	}

	public int getDecimo() {
		return decimo;
	}

	public void setDecimo(int decimo) {
		this.decimo = decimo;
	}
	
	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	//MétodosCálculo
	public int generarDecimo () {
		int max = 99999;
		int min = 0;
		Random num = new Random (System.nanoTime());
		decimo = num.nextInt(max - min + 1) + min;
		return decimo;
	}
	
	public void generarCartera (int cantidad) {
		cartera = new int [cantidad];
		for (int i = 0; i<cartera.length; i++) {
			cartera [i] = generarDecimo ();
		}
		Arrays.sort(cartera);
	}
	
	public void imprimirDecimo () {
		for (int i = 0; i<cartera.length; i++) {
			System.out.printf("\t%05d", cartera[i]);
		}
	}




	
	
	
	
	
	
}
