package ejercicio06v2;

public class Entrada {
	/*Cada Entrada (una de las clases) de cine tendrá un número identificativo, precio, si está libre u
	ocupada, número de la fila y de butaca. Todas las funcionalidades estarán en la clase Sala, que
	estará caracterizada por número identificador, número total de localidades, un objeto tipo Entrada y
	un array de localidades (tipo Entrada).*/
	
	private int idEntrada;
	private double precio;
	private boolean libre;
	private int numFila;
	private int numButaca;
	
	
	//Contructor
	public Entrada(int idEntrada, double precio, boolean libre, int numFila, int numButaca) {
		this.idEntrada = idEntrada;
		this.precio = precio;
		this.libre = libre;
		this.numFila = numFila;
		this.numButaca = numButaca;
	}


	public Entrada(int idEntrada, boolean libre, int numFila, int numButaca) {
		this.idEntrada = idEntrada;
		this.precio = 5;
		this.libre = libre;
		this.numFila = numFila;
		this.numButaca = numButaca;
	}

	//ToString
	@Override
	public String toString() {
		return "Entrada [idEntrada=" + idEntrada + ", precio=" + precio + ", libre=" + libre + ", numFila=" + numFila
				+ ", numButaca=" + numButaca + "]";
	}
	
	
	//GettersSetters
	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumButaca() {
		return numButaca;
	}

	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}
}
