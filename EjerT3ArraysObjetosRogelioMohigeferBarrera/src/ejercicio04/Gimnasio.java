package ejercicio04;

import java.util.Arrays;
import java.util.Iterator;

public class Gimnasio {
	
	Cliente listado [];

	
	//Constructores
	public Gimnasio(Cliente[] listado) {
		this.listado = listado;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Gimnasio [listado=" + Arrays.toString(listado) + "]";
	}

	
	//GettersSetters
	public Cliente[] getListado() {
		return listado;
	}

	public void setListado(Cliente[] listado) {
		this.listado = listado;
	}
	
	
	//Cálculos
	public double seleccionarIMC (int seleccion) {
		double imc = listado [seleccion].calcularIMC();
		return Math.round(imc);
	}
	
	public void addCliente (Cliente c, int seleccion) {
		for (int i = 0; i < listado.length; i++) {
			
		}
	}
	
	public void mostrarClientesActivos () {
		for (int i = 0; i < listado.length; i++) {
			if (listado [i].isEstado())
			System.out.println(listado [i]);	
		}
	}
	
	public void mostrarClientes () {
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado [i]);	
		}
	}
	
	public void mostrarClientesEach () {
		for (Cliente cliente : listado) {
			System.out.println(cliente);
		}
	}

	public double calcularMediaIMC () {
		int contador = 0;
		double mediaIMC = 0.0, cien = 100.0;
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] != null && listado [i].isEstado()) {
				mediaIMC += listado [i].calcularIMC();
			}	
		}
		return Math.round(mediaIMC*cien)/cien;
	}
	
}
