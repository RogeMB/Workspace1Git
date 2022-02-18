package ejercicio02Examen;

import java.util.Arrays;

public class Ventas {
	
	private Producto listado [];
	private double recaudado;
	
	

	//Constructor	
	public Ventas(Producto[] listado) {
		super();
		this.listado = listado;
		this.recaudado = 0;
	}


	//GandS
	public Producto[] getListado() {
		return listado;
	}
	
	public void setListado(Producto[] listado) {
		this.listado = listado;
	}


	public double getRecaudado() {
		return recaudado;
	}
	
	public void setRecaudado(double recaudado) {
		this.recaudado = recaudado;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Ventas [listado=" + Arrays.toString(listado) + "]";
	}
	
	
	//Métodos
	
	public void mostrarListado () {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i].isActivo()) {
				System.out.println((i+1) + ". " + listado [i]);
				listado[i].avisarPeligro();
			}
			
		}
	}
	
	
	public void annadirProducto (Producto p) {
		listado=Arrays.copyOf(listado, listado.length+1);
		listado[listado.length-1] = p;
	}	
	
	public double venderProducto (int indice, int cantidad, int fijo, double porcentaje) {
		listado[indice].setCantidadStock(listado[indice].getCantidadStock()-cantidad);
		if (listado[indice].getCantidadStock()==0) {
			listado[indice].setActivo(false);
		}
		 this.recaudado+=listado[indice].calcularPVP(porcentaje, fijo)*cantidad;
		 return listado[indice].calcularPVP(porcentaje, fijo)*cantidad; 
	}
	
	public double calcularCambio (double costeVenta, double pago) {
		return Math.round((pago-costeVenta)*100.0)/100.0;
	}
	
		
	/*
	public double calcularRecaudado (int indice, int fijo, double porcentaje) {
		double total = 0.0;
		for (int i = 0; i < listado.length; i++) {
			if (!listado[indice].isActivo()) {
				total+=listado[indice].calcularPVP(porcentaje, fijo);
			}	
		}return total;
	}
	 */
	
	public int cantidadStock () {
		int stock = 0;
		for (int i = 0; i < listado.length; i++) {
			if (listado[i].isActivo()) {
				stock+= listado [i].getCantidadStock();
			}
		}
		return stock;	
	}
	
	
	
}	
