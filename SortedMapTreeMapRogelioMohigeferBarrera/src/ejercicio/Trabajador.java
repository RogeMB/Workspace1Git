package ejercicio;

import java.util.Objects;
/* 
 * Clase POJO Trabajador con atributos, ToString, Getters And Setters y Constructor. Implementa a Comparable
 * para comparar por orden natural por el DNI. También implementa la interfaz ITrabajable para calcular
 *  el sueldo de cada trabajador.
 */


public class Trabajador implements ITrabajable, Comparable<Trabajador> {
	// La forma de implementar dos o más interfaceds es así, separadas por comas.
	
	private String dni;
	private String nombre;
	private String apellidos;
	private double horasTrabajadas;
	private double sueldoFinal;
	
	// Constructor
	
	public Trabajador(String dni, String nombre, String apellidos, double horasTrabajadas, double sueldoFinal) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}

	// ToString
	
	@Override
	public String toString() {
		return "Trabajador [Dni= " + dni + "; Nombre= " + nombre + "; Apellidos= " + apellidos + "; Horas trabajadas= "
				+ horasTrabajadas + "; Sueldo final= " + sueldoFinal + "€]";
	}

	
	// GandS
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	// Equals
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Double.doubleToLongBits(horasTrabajadas) == Double.doubleToLongBits(other.horasTrabajadas)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldoFinal) == Double.doubleToLongBits(other.sueldoFinal);
	}


	
	// Métodos	
	// Método que hemos elegido para calcula el sueldo de cada trabajador
	@Override
	public double calcularSueldo(double horas, double euroHora, double bono, double horasExtra, double euroHoraExtra) {
		// TODO Auto-generated method stub
		double sueldof = (horas * euroHora) + (horasExtra * euroHoraExtra) + bono;
		return sueldof;
	}
	
	// Orden que hemos elegido para el natural
	@Override
	public int compareTo(Trabajador t) {
		// TODO Auto-generated method stub
		return (dni.compareTo(t.getDni()));
	}
	
}
