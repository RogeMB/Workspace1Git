package ejercicio;

public class Empresario extends VisitanteGeneral {
	
	private String nombreEmpresa;
	private double CantPatrocinio;

	
	// Const

	public Empresario(String nombre, int id, double precioBase, int edad, String nombreEmpresa, double cantPatrocinio) {
		super(nombre, id, precioBase, edad);
		this.nombreEmpresa = nombreEmpresa;
		CantPatrocinio = cantPatrocinio;
	}

	// ToString
	@Override
	public String toString() {
		return super.toString() + "Empresario [nombreEmpresa=" + nombreEmpresa + ", CantPatrocinio=" + CantPatrocinio + "]";
	}
	

	
		
	// GandS

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public double getCantPatrocinio() {
		return CantPatrocinio;
	}

	public void setCantPatrocinio(double cantPatrocinio) {
		CantPatrocinio = cantPatrocinio;
	}
	

	
	
	// Métodos
	
	@Override
	public double calcularPrecioEntrada(double descuentoMenores, double descuentoAncianos, double descuentoEmpresario, double cantidadPorHijo) {
		// TODO Auto-generated method stub
		final double divisor = 100.0;
		double minimoParadescuento = 100.0;
		if (this.CantPatrocinio > minimoParadescuento) {
			return super.calcularPrecioEntrada(descuentoMenores, descuentoAncianos, descuentoEmpresario, cantidadPorHijo) * (1-(descuentoEmpresario/divisor));
		} else {
			return super.calcularPrecioEntrada(descuentoMenores, descuentoAncianos, descuentoEmpresario, cantidadPorHijo);
		}
	}
			
	public void invitarCafe () {
		System.out.println("\t\t***Consumición gratis***");
	}
		

}
