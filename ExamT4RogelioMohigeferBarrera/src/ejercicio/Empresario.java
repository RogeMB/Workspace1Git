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
		return "Empresario [nombreEmpresa=" + nombreEmpresa + ", CantPatrocinio=" + CantPatrocinio + "]";
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
	public double calcularPrecioEntrada() {
		// TODO Auto-generated method stub
		final double descuento = 0.90;
		if (this.CantPatrocinio > 100) {
			return super.calcularPrecioEntrada() * descuento;
		} else {
			return super.calcularPrecioEntrada();
		}
	}
			
	public void invitarCafe () {
		System.out.println("\t\t***Consumición gratis***");
	}
		

}
