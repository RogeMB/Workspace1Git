package ejercicio02;

public class Socio implements ICuotable{
	
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private double cuota;
	private boolean activo;
	
	// Constructor

	
	public Socio(int id, String nombre, String apellidos, int edad, double cuota, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cuota = cuota;
		this.activo = activo;
	}
	


	// ToString
	
	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", cuota="
				+ cuota + ", activo=" + activo + "]";
	}

	
	
	// Getters&Setters
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	// Métodos
	
	
	
	
	
	
	@Override
	public double calcularCuota(double descuentoMenores, double descuentoMayores, double bonificacionTres, int minimoMiembros, int cantidadMiembros) {
		// TODO Auto-generated method stub
		final double divisor=100.0;
		int edadMenor =  18;
		int edadAnciano = 65;
		if (edad < edadMenor) {
			return cuota*(1-(descuentoMenores/divisor));
		}else if (edad>=edadMenor && edad<=edadAnciano) {
			return cuota;
		}else {
			return cuota*(1-(descuentoMayores/divisor));
		}
	}
	
	
	
	
	
	
	
	
}
