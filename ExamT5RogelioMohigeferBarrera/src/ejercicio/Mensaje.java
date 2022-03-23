package ejercicio;

import java.util.Objects;

public class Mensaje implements Comparable<Mensaje>{
	
	private int id;
	private String nombreContacto;
	private String Cuerpo;
	
	// Constructor
	
	public Mensaje(int id, String nombreContacto, String cuerpo) {
		super();
		this.id = id;
		this.nombreContacto = nombreContacto;
		Cuerpo = cuerpo;
	}


	
	// ToString
	
	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", nombreContacto=" + nombreContacto + ", Cuerpo=" + Cuerpo + "]";
	}




	
	// GandS
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getCuerpo() {
		return Cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		Cuerpo = cuerpo;
	}




	
	
	// Equals&&HashC
	
	/*@Override
	public int hashCode() {
		return Objects.hash(Cuerpo, id, nombreContacto);
	}*/


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(Cuerpo, other.Cuerpo) && id == other.id
				&& Objects.equals(nombreContacto, other.nombreContacto);
	}

	

	// Métodos


	@Override
	public int compareTo(Mensaje m) {
		if(this.id<m.getId()) {
			return -1;	
		}else if(this.id>m.getId()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
}
