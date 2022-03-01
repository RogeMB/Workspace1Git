package ejercicio;

public class VisitanteGeneral implements IEntrada {
	
	private String nombre;
	private int id;
	private double precioBase;
	private int edad;
	
	//Const
	
	public VisitanteGeneral(String nombre, int id, double precioBase, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.precioBase = precioBase;
		this.edad = edad;
	}

	
	// ToStr
	@Override
	public String toString() {
		return "VisitanteGeneral [nombre=" + nombre + ", id=" + id + ", precioBase=" + precioBase + ", edad=" + edad
				+ "]";
	}

	
	// GandS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	// Métodos
	
	@Override
	public double calcularPrecioEntrada(double descuentoMenores, double descuentoMayores, double flexible) {
		// TODO Auto-generated method stub
		final double divisor=100.0;
		int edadMenor =  18;
		int edadAnciano = 65;
		if (edad < edadMenor) {
			return 0;
		}else if (edad>=edadMenor && edad<=edadAnciano) {
			return precioBase;
		}else {
			return precioBase*(1-(descuentoMayores/divisor));
		}
	}

}
