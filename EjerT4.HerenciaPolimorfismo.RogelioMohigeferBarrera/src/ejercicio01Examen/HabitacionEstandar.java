package ejercicio01Examen;

public class HabitacionEstandar {
	
	private double precioBase;
	private boolean esLibre;
	private String nombreCliente;
	private int numeroDias;
	private int numeroOcupantes;
	
	
	public HabitacionEstandar(double precioBase, boolean esLibre, String nombreCliente, int numeroDias,
			int numeroOcupantes) {
		super();
		this.precioBase = precioBase;
		this.esLibre = esLibre;
		this.nombreCliente = nombreCliente;
		this.numeroDias = numeroDias;
		this.numeroOcupantes = numeroOcupantes;
	}


	@Override
	public String toString() {
		return "HabitacionEstandar [precioBase=" + precioBase + ", esLibre=" + esLibre + ", nombreCliente="
				+ nombreCliente + ", numeroDias=" + numeroDias + ", numeroOcupantes=" + numeroOcupantes + "]";
	}


	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isEsLibre() {
		return esLibre;
	}
	
	public void setEsLibre(boolean esLibre) {
		this.esLibre = esLibre;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}
	
	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}
	
	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}
	
	
	
	
	public double calcularPrecio (double porc) {
		return precioBase*numeroDias;
	}
	
	

}
