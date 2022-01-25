package ejercicio06;

public class Entrada {
	
	private int ID, fila, butaca;
	private double precio;
	private boolean libre;

	
	//Constructores
	public Entrada(int ID, int fila, int butaca, double precio, int butacasPorFila) {
		
		this.ID = ID;
		this.fila = fila;
		this.butaca = butaca;
		this.precio = precio;
		this.libre = true;
	}
	
	public Entrada () {
	
	}
	
	//ToString
	@Override
	public String toString() {
		return "Entrada [ID=" + ID + ", fila=" + fila + ", butaca=" + butaca + ", precio=" + precio + ", libre=" + libre
				+ "]";
	}


	// GettersSetters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getButaca() {
		return butaca;
	}

	public void setButaca(int butaca) {
		this.butaca = butaca;
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
}
