package ejercicio01;

public class Producto {
	
	private String nombre;
	private int codProd;
	private int tasacion;
	private double precioFab;
	private boolean fragil;
	
	
	//Constructores
	public Producto(String nombre, int codProd, int tasacion, double precioFab, boolean fragil) {
		this.nombre = nombre;
		this.codProd = codProd;
		this.tasacion = tasacion;
		this.precioFab = precioFab;
		this.fragil = fragil;
	}

	public Producto() {

	}
	
	//ToString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codProd=" + codProd + ", tasacion=" + tasacion + ", precioFab="
				+ precioFab + ", fragil=" + fragil + "]";
	}
	
	//GetttersSetters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public int getTasacion() {
		return tasacion;
	}

	public void setTasacion(int tasacion) {
		this.tasacion = tasacion;
	}

	public double getPrecioFab() {
		return precioFab;
	}

	public void setPrecioFab(double precioFab) {
		this.precioFab = precioFab;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

}
