package ejemploInterfaz;

public class Carta implements Imprimible {
	
	private String cuerpo;
	private String cabecera;
	
	
	
	public Carta(String cabecera, String cuerpo) {
		super();
		this.cuerpo = cuerpo;
		this.cabecera = cabecera;
		
	}



	@Override
	public String toString() {
		return "Carta [cuerpo=" + cuerpo + ", cabecera=" + cabecera + "]";
	}

	


	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	
	@Override
	public void imprimirAsterisco () {
		System.out.println("****" + cabecera + "****");
		System.out.println(cuerpo);
	}
	
	
	
}
