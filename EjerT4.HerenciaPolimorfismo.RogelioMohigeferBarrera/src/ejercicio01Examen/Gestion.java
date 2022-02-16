package ejercicio01Examen;

import java.util.Arrays;

public class Gestion {
	
	private HabitacionEstandar listado [];

	public Gestion(HabitacionEstandar[] listado) {
		super();
		this.listado = listado;
	}

	
	
	@Override
	public String toString() {
		return "Gestion [listado=" + Arrays.toString(listado) + "]";
	}

	
	
	public HabitacionEstandar[] getListado() {
		return listado;
	}

	public void setListado(HabitacionEstandar[] listado) {
		this.listado = listado;
	}
	
	
	public double calcularUna (HabitacionEstandar h, double porc) {
		return h.calcularPrecio(porc); // el metodo reescrito NO NECESITA CASTEO. EL CASTEO SOLO para métodos únicos de clases hijas 
	}
	
	
	public void addHabitacion (HabitacionEstandar h, int numHab) {
		listado [numHab] = h;
	}
	
	public double calcularTotalRecaudado (double porc, int numHab) {
		double total=0.0;
		for (int i = 0; i < numHab; i++) {  //numhab es una variable de principal para las posiciones del array [numHab++]
			if (/*!*/listado[i].isEsLibre())
				total+=calcularUna (listado[i], porc);	
		}
		return total;
	}
	
	public void mostrarOcupadas (int numHab) {
		for (int i = 0; i < numHab; i++) {
			if(listado[i].isEsLibre())
				System.out.println(listado[i]);
		}
	}	
		
	public void mostarDatos () {
		//2 opciones, o un instance of por cada tipo de clase hija. O hacer este método es la clase padre y reescribirlo. y llamarlo desde aqui
	}
	
	public void mostrarFactura () {
	//ticket	
			
	}
	
	
}
