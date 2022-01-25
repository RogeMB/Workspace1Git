package ejercicio06;

import java.util.Arrays;

public class Sala {
	//Las filas y las butacas de cada fila están numeradas empezando por 0.
	private int iD;
	private int numFilas;
	private int butacasPorFila;
	private int totalOcupadas;
	private double precio;
	private double recaudacion;
	private String pelicula;
	private Entrada e[][];  //Definimos un array bidimensional de objetos Entrada, sin instanciar
	
	//Constructores
	public Sala(int iD, int numFilas, int butacasPorFila, double precio, String pelicula) {
		int IDEntrada = -1;  //Variable que cuenta e identifica el número total de Entradas
		
		this.iD = iD;
		this.numFilas = numFilas;
		this.butacasPorFila = butacasPorFila;
		this.recaudacion = 0;
		this.precio = precio;
		this.pelicula = pelicula;
	
		//Construcción de las entradas:
		e = new Entrada[numFilas][butacasPorFila];  // PASO 2: Creamos un array de objetos Entrada  
		for (int fila = 0; fila < numFilas; fila++) {
			for(int butaca = 0; butaca<butacasPorFila; butaca++) {
				IDEntrada++;
				// PASO 3: Definimos y creamos cada elemento del array:
				e[fila][butaca] = new Entrada(IDEntrada,fila,butaca,precio);
			}
		}
	}
	
	//ToString
	@Override
	public String toString() {
		return "Sala [iD=" + iD + ", numFilas=" + numFilas + ", butacasPorFila=" + butacasPorFila + ", totalOcupadas="
				+ totalOcupadas + ", precio=" + precio + ", recaudacion=" + recaudacion + ", pelicula=" + pelicula
				+ ", e=" + Arrays.toString(e) + "]";
	}

	//GettersSetters
	public int getID() {
		return iD;
	}
	
	public void setID(int iD) {
		this.iD=iD;
	}
	
	public int getNumFilas() {
		return numFilas;
	}

	public void setNumFilas(int numFilas) {
		this.numFilas = numFilas;
	}

	public int getButacasPorFila() {
		return butacasPorFila;
	}

	public void setButacasPorFila(int butacasPorFila) {
		this.butacasPorFila = butacasPorFila;
	}

	public int getTotalOcupadas() {
		return totalOcupadas;
	}

	public void setTotalOcupadas(int totalOcupadas) {
		this.totalOcupadas = totalOcupadas;
	}

	public double getPrecio() {
		return precio;
	}

	//Cálculos
	public void setPrecio(double precio) {
		this.precio = precio;
		
		for(int fila=0;fila<numFilas;fila++) {
			for(int butaca=0;butaca<butacasPorFila;butaca++) {
				e[fila][butaca].setPrecio(precio);
			}
		}
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}	
	
	public boolean isLibre(int fila,int butaca) {
		// Devuelve true o false dependiendo de si la butaca correspondiente está libre
		return e[fila][butaca].isLibre();
	}
	
	public boolean hayButacas() {
		// Devuelve true si quedan butacas libres EN LA SALA
		// Recorremos todas las filas, y todas las butacas de cada fila, en busca de alguna libre.
		// Si encontramos, devolvemos true y salimos. Si recorremos todas, devolvemos false.
		for (int fila=0;fila<numFilas;fila++) {
			for (int butaca=0;butaca<butacasPorFila;butaca++) {
				if (e[fila][butaca].isLibre())
					return true;
			}
		}
		return false;
	}
	
	public boolean imprimeButacasLibresOcupadas(int fila) {
		// Imprime las butacas libres y ocupadas en la fila, y devuelve true si hay alguna libre (false, si no)
		boolean hayLibres = false;
		int butaca;
		String sLibre;
		
		System.out.println("Butacas libres en la fila "+ fila + ":");
		for (butaca = 0; butaca<butacasPorFila;butaca++) {
			if (isLibre(fila, butaca)) {
				sLibre = "Libre";
				hayLibres = true;
			}
			else
				sLibre = "Ocupada";
			System.out.println("\t"+butaca+": "+sLibre);
		}
		return hayLibres;
	}
	
	public void vender(int fila,int butaca) {
		// Señalamos la localidad como ocupada:
		e[fila][butaca].setLibre(false);
		// Aumentamos la recaudación con el precio de la localidad:
		this.recaudacion = this.recaudacion + e[fila][butaca].getPrecio();
	}
}
