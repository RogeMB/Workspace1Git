package ejercicio05;

import java.util.Objects;

public class Contacto implements Comparable <Contacto>{
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	
	
	// Constructor
	
	public Contacto(String dni, String nombre, String apellidos, String telefono, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}

	
	
	// ToString
	
	@Override
	public String toString() {
		return "Contacto [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", email=" + email + "]";
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		Contacto other = (Contacto) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}
	

	// CompareTo  // Orden natural
	
	@Override
	public int compareTo(Contacto c) {
		// TODO Auto-generated method stub
		return (nombre.compareTo(c.getNombre()));
	}



	
	
	

}
