package ejemploInterfaz;

public class Web implements Imprimible {
	
	private String titulo;

	
	public Web(String titulo) {
		super();
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Web [titulo=" + titulo + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	@Override
	public void imprimirAsterisco() {
		// TODO Auto-generated method stub
		System.out.println(titulo);
	}
	
	
	
}
