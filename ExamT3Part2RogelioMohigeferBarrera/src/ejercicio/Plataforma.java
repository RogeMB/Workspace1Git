package ejercicio;

import java.util.Arrays;

public class Plataforma {
	
	Deposito listado [];
	private static int capacidadtotal;
	
	
	//Contructores
	public Plataforma(Deposito[] listado) {
		this.listado = listado;
	}
	
	public Plataforma() {
		
	}


	
	//ToString
	@Override
	public String toString() {
		return "Plataforma [listado=" + Arrays.toString(listado) + "]";
	}

	
	//GettersSetters
	public Deposito[] getListado() {
		return listado;
	}

	public void setListado(Deposito[] listado) {
		this.listado = listado;
	}

	public static int getCapacidadtotal() {
		return capacidadtotal;
	}

	public static void setCapacidadtotal(int capacidadtotal) {
		Plataforma.capacidadtotal = capacidadtotal;
	}
	
	
	//Calculos
/*	
	public void establecerVolumen (int seleccion) {
		listado [seleccion].setVolumen(listado [seleccion].calcularVolumen());
	}
	
	public int calcularCapacidadTotal () {
		for (int i = 0; i < listado.length; i++) {
			capacidadtotal+=listado[i].getVolumen();
		}
		return capacidadtotal;
	}
	*/
	/*
	public void addDeposito (int posicion, double altura, double radio, int litros, double precio) {
		
		if (posicion >= 0 && listado[posicion]==null){
			listado[posicion].setAltura(altura);
			listado[posicion].setRadio(radio);
			listado[posicion].setLitros(litros);
			listado[posicion].setPrecio(precio);
			
			this.establecerVolumen(posicion);
			this.calcularCapacidadTotal();
		}else {
			this.posicionOcupada();
		}

	}
	*/
	
	public void addPiso (Deposito d, int posicion) {
		listado [posicion] = d;
		/*numero de depositos++ - podemos hacer una variable con el numero de depositos*/
		/*totalLitros+=d.getPrecioventa*/
 		/*agregar deposito y sumar el volumen del deposito al total del numero de litros de toda la plataforma*/
	}
	
	public void posicionOcupada () {
		System.out.println("\n\t***ERROR***. Posición ocupada.");
	}
	
	
	public double calcularPrecioVenta (int seleccion, int beneficio) {
		int cien=100, uno=1;
		beneficio = (beneficio/cien)+uno;
		return (listado[seleccion].getPrecio()*beneficio)-listado[seleccion].getPrecio();
	}
	
	public void venderDeposito (int seleccion) {
		listado [seleccion]=null;
	}
	
	public double gananciaRepsolDeposito (int seleccion, double precioLitro) {
		return listado [seleccion].getLitros()*precioLitro;
	}
	
	public double gananciaRepsolTodos (double precioLitro) {
		double total = 0.0;
		for (int i = 0; i < listado.length; i++) {
			total += listado[i].getLitros() * precioLitro;
		}
		return total;
	}
	/*
	public double gananciaRepsolLleno (double precioLitro) {
		double total = 0.0;
		for (int i = 0; i < listado.length; i++) {
			total += listado[i].getVolumen() * precioLitro;
		}
		return total;
	}*/
	
	public static void bienvenido (String nombre) {
		System.out.println("\tBienvenido/a, "+nombre+". \n\tEste es el programa Cuanto-Más-Crudo-Mejor"
				+ "\n\tVersion 1.0");
	}
	
	public static void imprimirMenu () {
		System.out.print("\nIngrese una opción entre las siguientes:"
				+ "\n\t0. Salir"
				+ "\n\t1. Agregar un depósito"
				+ "\n\t2. Ver lista de depósitos"
				+ "\n\t3. Calcular precio de venta"
				+ "\n\t4. Calcular número de litros de toda la Plataforma"
				+ "\n\t5. Calcular benficio de Repsol con la venta de un depósito"
				+ "\n\t6. Calcular beneficio de Repsol con la venta de todos los depósitos"
				+ "\n\t7. Calcular beneficio de Repsol si todos los depósitos están llenos"
				+ "\nRespuesta: ");
	}
	
	public static void imprimirTarugo () {
		System.out.println("\n***ERROR***. Venga, usted puede, ingrese una opción válida.");
	}
	
	public static void imprimirDespedida () {
		System.out.println("\n\t***AGRADECEMOS SU CONFIANZA. (Puede que reciba algún spam comercial "
				+ "con nuevas versiones)***");
	}
	
}
