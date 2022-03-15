package ejercicio04;

import java.util.Comparator;
import java.util.Objects;

public class Contacto implements Comparator {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String direccion;
	private String empresa;
	
	// Constructor
	
	public Contacto(int id, String nombre, String apellidos, String telefono, String email, String direccion,
			String empresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.empresa = empresa;
	}


	
	// GandS
	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	// ToString
	
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", email=" + email + ", direccion=" + direccion + ", empresa=" + empresa + "]";
	}


	// HashCode
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, direccion, email, empresa, id, nombre, telefono);
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
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(empresa, other.empresa) && id == other.id
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}



	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	// 
	

}
