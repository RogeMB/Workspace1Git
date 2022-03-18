package ejercicio06;

import java.util.Objects;

public class Trabajador implements ITrabajable, Comparable<Trabajador> {
	
	
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
	public int hashCode() {
		return Objects.hash(apellidos, dni, horasTrabajadas, nombre, sueldoFinal);
	}

	
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
	
	@Override
	public double calcularSueldo(double horas, double euroHora, double bono, double horasExtra, double euroHoraExtra) {
		// TODO Auto-generated method stub
		double sueldof = (horas * euroHora) + (horasExtra * euroHoraExtra) + bono;
		return sueldof;
	}
	
	
	@Override
	public int compareTo(Trabajador t) {
		// TODO Auto-generated method stub
		return (dni.compareTo(t.getDni()));
	}
	
}
