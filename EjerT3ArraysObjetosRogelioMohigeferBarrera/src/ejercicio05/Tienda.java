package ejercicio05;

import java.util.Arrays;

public class Tienda {

	private int tamano;				
	private Electrodomestico e[];
	private int ultimoIndice;

	
	//Constructores
	public Tienda() {
		
	}
	
	public Tienda(int tamano) {
		super();
		if (tamano <= 0) {
			tamano = 1;
		}
		this.tamano = tamano;
		e = new Electrodomestico[tamano];
		this.ultimoIndice = -1;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Tienda [tamano=" + tamano + ", e=" + Arrays.toString(e) + ", ultimoIndice=" + ultimoIndice + "]";
	}

	
	//GettersSetters
	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public Electrodomestico[] getE() {
		return e;
	}

	public void setE(Electrodomestico[] e) {
		this.e = e;
	}

	public int getUltimoIndice() {
		return ultimoIndice;
	}

	public void setUltimoIndice(int ultimoIndice) {
		this.ultimoIndice = ultimoIndice;
	}

	//Cálculos
	//Métodos para añadir electrodomésticos.(admiten 3 diferentes formas de ser llamados correspondiente a los 3 constructores)
	public boolean nuevoElectrodomestico () {
		// El último índice admisible es tamano - 1. Una vez alcanzado, ya se ha completado el tamaño máximo
		if (this.ultimoIndice < tamano - 1) {
			 // En la última posición, añado un objeto Electrodomestico con los valores por defecto
			this.ultimoIndice++;
			e[this.ultimoIndice] = new Electrodomestico(); // TERCER PASO: Definimos y Creamos cada objeto del array
			return true;
		} else
			return false;  //Se ha alcanzado el máximo de electrodomésticos permitidos (tamano). No se añade nada.
	}
	
	public boolean nuevoElectrodomestico (double precioBase, double peso) {
		//El último índice admisible es tamano -1. Una vez alcanzado, ya se ha completado el tamaño máximo
		if (this.ultimoIndice < tamano - 1) {
			 // En la última posición, añado un objeto Electrodomestico con los valores argumentos
			this.ultimoIndice++;
			e[this.ultimoIndice] = new Electrodomestico(precioBase, peso); 
			return true;
		} else
			return false;  //Se ha alcanzado el máximo de electrodomésticos permitidos (tamano). No se añade nada.
	}
	
	public boolean nuevoElectrodomestico (double precioBase, String color, char consumoEnergetico, double peso) {
		//El último índice admisible es tamano -1. Una vez alcanzado, ya se ha completado el tamaño máximo
		if (this.ultimoIndice < tamano - 1) {
			 //En la última posición, añado un objeto Electrodomestico con los valores argumentos
			this.ultimoIndice++;
			e[this.ultimoIndice] = new Electrodomestico(precioBase, color, consumoEnergetico, peso); 
			return true;
		} else
			return false;  //Se ha alcanzado el máximo de electrodomésticos permitidos (tamano). No se añade nada.
	}

	
	public void listaElectrodomesticos() {
		System.out.println("\nLISTADO GENERAL DE ELECTRODOMÉSTICOS EN STOCK");
		System.out.println("Nº REG\tCOLOR\tCONS.ENERG.\tPESO");
		for (int i = 0; i<=ultimoIndice; i++) {
			System.out.println(i +"\t" + e[i].getColor() +"\t    " + e[i].getConsumoEnergetico() +"\t\t" + e[i].getPeso() );
		}
		System.out.println("=============================================");
	}
	
	public double precioFinal(int i) {
		if (i >= 0 && i <= ultimoIndice)
			return e[i].precioFinal();
		else
			return 0.0;
	}
	
	public double sumaPreciosFinales() {
		double suma = 0.0;
		for (int i = 0; i <= ultimoIndice; i++) {
			suma = suma + precioFinal(i);
		}
		return suma;
	}
	
	public double media() {
		return sumaPreciosFinales() / (ultimoIndice + 1);
	}
}
