package ejercicio02Interface;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas {

	private double [] num;
	
	
	
	// Constructores
	public ArrayReales () {
		super();
	}
	
	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}
	
	// ToString
	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}

	// GettersSetters
	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	
	
	// Métodos
	public void rellenarArray (int max, int min) {
		Random r = new Random (System.nanoTime());
		for (int i = 0; i < num.length; i++) {
			num [i] = r.nextInt(max - min + 1) +min;
		}
	}
	
	public void mostrarArray () {
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1 + ". " + num [i]);
		}
	}
	
	
	@Override
	public double calcularMinimo () {
		double min = 0.0;
		//int contador = 0;
		for (int i = 0; i < num.length; i++) {
			//if (contador == 0) {
			if (i==0) {
				min = num [i];
			} else {
				if (num [i] < min) {
					min = num [i];
				}
			}
			//contador ++;
		}
		return min;
	}

	
	@Override
	public double calcularMaximo ( ) {
		double max = 0.0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num [i];
			}
		}
		return max;
	}
	
	
	@Override
	public double calcularSumatorio () {
		double suma = 0.0;
		for (int i = 0; i < num.length; i++) {
			suma += num[i];
		}
		return suma;
	}


}
