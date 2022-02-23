package ejercicio01;

public class Nota {
	/*
	 * Esta clase es la POJO
	 */
	private int id;
	private String titulo;
	private String cuerpo;
	private boolean esUrgente;
	
	
	// Constructor
	
	public Nota(int id, String titulo, String cuerpo, boolean esUrgente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.esUrgente = esUrgente;
	}

	
	// ToString
	
	@Override
	public String toString() {
		return "Nota [id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", esUrgente=" + esUrgente + "]";
	}

	// Getters&Setters
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isEsUrgente() {
		return esUrgente;
	}

	public void setEsUrgente(boolean esUrgente) {
		this.esUrgente = esUrgente;
	}

	
	// Métodos
	
	
	
}
