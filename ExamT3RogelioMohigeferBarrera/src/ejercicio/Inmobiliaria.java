package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Inmobiliaria {
	
	private int id;
	private Piso p;
	private int historialPrecios [];
	private int precioFinal;
	
	
	//Constructores
	public Inmobiliaria(int id, Piso p, int[] historialPrecios, int mes, int precioFinal) {
		super();
		this.id = id;
		this.p = p;
		this.historialPrecios = historialPrecios;
		this.precioFinal = precioFinal;
	}
	
	public Inmobiliaria () {
		
	}

	
	//GettersSetters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Piso getP() {
		return p;
	}


	public void setP(Piso p) {
		this.p = p;
	}


	public int[] getHistorialPrecios() {
		return historialPrecios;
	}


	public void setHistorialPrecios(int[] historialPrecios) {
		this.historialPrecios = historialPrecios;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}


	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Inmobiliaria [id=" + id + ", p=" + p + ", historialPrecios=" + Arrays.toString(historialPrecios)
			 + ", precioFinal=" + precioFinal + "]";
	}

	
	//Cálculos
	
	public void generarPrecios (int precioMinimo, int precioMaximo, int mes) {
		historialPrecios = new int [mes];
		Random r = new Random (System.nanoTime());
		for (int i = 0; i < historialPrecios.length; i++) {
			historialPrecios [i] = r.nextInt(precioMaximo-precioMinimo+1)+precioMaximo;
			this.setHistorialPrecios(historialPrecios);
		}
	}
	
	public int generarPrecioFinal (int ganancia) {
		int uno = 1, cien = 100;
		this.setPrecioFinal(precioFinal * (uno + (ganancia/cien))); 
		return precioFinal;
	}
	
	public int calcularPrecioMetro (int metrosCuadrados) {
		int precioMetro = 0;
		precioMetro = precioFinal * metrosCuadrados;
		return precioMetro;
	} 
	
	public void imprimirPrecioMetro (int precioMetro) {
		System.out.println("El precio por metro cuadrado es de: "+precioMetro);

	}
	
}




