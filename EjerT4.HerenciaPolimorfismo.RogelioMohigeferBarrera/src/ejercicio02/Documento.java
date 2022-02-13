package ejercicio02;


public class Documento {
	
	private String nombreEmpresa;
	private String fecha;
	private String lugar;
	private String firmaAutor;
	private String departamento;
	private String titulo;
	private String cuerpo;
	
	
	//Constructores
	public Documento(String nombreEmpresa, String fecha, String lugar, String firmaAutor, String departamento,
			String titulo, String cuerpo) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.fecha = fecha;
		this.lugar = lugar;
		this.firmaAutor = firmaAutor;
		this.departamento = departamento;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}


	// para la carta
	public Documento(String fecha, String lugar, String firmaAutor, String cuerpo) {
		super();
		this.fecha = fecha;
		this.lugar = lugar;
		this.firmaAutor = firmaAutor;
		this.cuerpo = cuerpo;
	}

	// para la tarjeta visita
	public Documento(String nombreEmpresa, String departamento, String titulo) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.departamento = departamento;
		this.titulo = titulo;
	}
	

	//ToString
	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", fecha=" + fecha + ", lugar=" + lugar + ", firmaAutor="
				+ firmaAutor + ", departamento=" + departamento + ", titulo=" + titulo + ", cuerpo=" + cuerpo + "]";
	}


	//GettesrSetters
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFirmaAutor() {
		return firmaAutor;
	}

	public void setFirmaAutor(String firmaAutor) {
		this.firmaAutor = firmaAutor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	
	// Métodos
	
	public void imprimirOtros () {
		
	}
	
	public void imprimirDocumento () {
		System.out.println(this.nombreEmpresa + "\n\t\t\tEn "+this.lugar + " a " + this.fecha +
	"\n\t\tTítulo: " + this.titulo + "\n" + this.cuerpo + "\n" + this.departamento + "\n\t\t\tFirmado por: " 
				+ "\n\t\t\t" + this.firmaAutor);
	}
	
	

}
