package ejercicio;

public class Familiar extends VisitanteGeneral {
	
	private int numeroHijos;

	// Cons
	public Familiar(String nombre, int id, double precioBase, int edad, int numeroHijos) {
		super(nombre, id, precioBase, edad);
		this.numeroHijos = numeroHijos;
	}


	// ToString
	@Override
	public String toString() {
		return super.toString() +  "Familiar [numeroHijos=" + numeroHijos + "]";
	}



	
	
	// GandS
	
	public int getNumeroHijos() {
		return numeroHijos;
	}
	
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}



	
	
	// Métodos
	
	
	@Override
	public double calcularPrecioEntrada(double descuentoMenores, double descuentoAnciano, double descuentoEmpresario, double cantidadPorHijo) {
		// TODO Auto-generated method stub
		return super.calcularPrecioEntrada(descuentoMenores, descuentoAnciano, descuentoEmpresario, cantidadPorHijo) - this.numeroHijos * cantidadPorHijo;
	}
	
}
