package ejercicio02;

public class TarjetaVisita extends Documento {
	
	private String nombreContacto;
	private String telefono;
	private String email;

	
	// Constructores
	public TarjetaVisita(String nombreEmpresa, String departamento,
			String titulo, String nombreContacto, String telefono, String email) {
		super(nombreEmpresa, departamento, titulo);
		this.nombreContacto = nombreContacto;
		this.telefono = telefono;
		this.email = email;
	}

	// ToString
	@Override
	public String toString() {
		return super.toString() + "TarjetaVisita [nombreContacto=" + nombreContacto + ", telefono=" + telefono + ", email=" + email + "]";
	}


	// GettersSetters
	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
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

	
	// Métodos
	@Override
	public void imprimirOtros() {
		// TODO Auto-generated method stub
		super.imprimirOtros();
		System.out.println (getNombreEmpresa () + "\t\t\t" + getDepartamento()  + "\n\t\t"  + getTitulo() 
					+ "\n\t\t" + this.nombreContacto + "\n\t" + this.telefono + " \t\t\t" + this.email);
		}
	
}
	