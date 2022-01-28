package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Inmobiliaria {
	
	
	private int id_oficina;
	private Piso piso;
	private int [] listaPrecios;

	//Constructor
	public Inmobiliaria(int id_oficina, Piso piso, int[] listaPrecios) {
		super();
		this.id_oficina = id_oficina;
		this.piso = piso;
		this.listaPrecios = listaPrecios;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Inmobiliaria [id_oficina=" + id_oficina + ", piso=" + piso + ", listaPrecios="
				+ Arrays.toString(listaPrecios) + "]";
	}


	//GettersSetters
	public int getId_oficina() {
		return id_oficina;
	}

	public void setId_oficina(int id_oficina) {
		this.id_oficina = id_oficina;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public int[] getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(int[] listaPrecios) {
		this.listaPrecios = listaPrecios;
	}
	

	//Cálculos
	
	public int generarAleatorio (int desde, int hasta) {
		int precio;
		Random num = new Random (System.nanoTime());
		precio = num.nextInt(hasta-desde+1)+desde;
		return precio;
	}
	
	
	public int [] rellenarLIstadoPRecio (int desde, int hasta) {
		for (int i = 0; i < listaPrecios.length; i++) {
			listaPrecios [i] = generarAleatorio (desde, hasta);	
		}
		return listaPrecios;
	}
	

	
	public int calcularPrecioMetro2() {
		int precioM2;
		precioM2 = piso.getPrecio()/(int)piso.getMetrosCuadrados();
		return precioM2;
	}
	
	public double calcularPrecioLibras (double cambio) {
		double precioLibras;
		precioLibras = piso.getPrecio()*cambio;
		return precioLibras;
	}
}
