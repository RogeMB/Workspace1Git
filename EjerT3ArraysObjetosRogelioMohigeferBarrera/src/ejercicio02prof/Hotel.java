package ejercicio02prof;

import java.util.Arrays;

public class Hotel {
	
	Habitacion lista [];

	
	//Constructores
	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Hotel() {

	}

	@Override
	public String toString() {
		return "Hotel [habitaciones=" + Arrays.toString(lista) + "]";
	}
	
	//GettersSetters
	public Habitacion[] getHabitaciones() {
		return lista;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.lista = habitaciones;
	}

	//Metodos
	public boolean comprobarLimpieza (int numH) {
		return lista [numH].isLimpia();
	}
	
	public void imprimirLimpia (int numH) {
		if (comprobarLimpieza (numH)) {
			System.out.println("La habitación está hecha");
		}else {
			System.out.println("Todavía no se ha limpiado la habitación.");
		}
	}
	
	public double calcularPrecio (int numH) {
		return lista [numH].getPrecio() * lista [numH-1].getNumDias(); 
	}
	
	public void imprimirListado () {
		for (int i=0; i<lista.length; i++)
			System.out.println(lista [i]);
	}
	
	public double calcularPrecioExtras (int numH, double extras) {
		if (lista[numH].isExtras()==true) {
			return calcularPrecio(numH) + extras;
		}else {	
			return calcularPrecio (numH);
		}
	}
	
	
}
