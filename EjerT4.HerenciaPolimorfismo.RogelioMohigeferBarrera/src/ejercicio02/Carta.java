package ejercicio02;

public class Carta extends Documento {
	
	private String destinatario;
	private String saludo;
	private String despedida;
	private String posdata;
	
	
	//Constructores
	public Carta(String destinatario, String fecha, String lugar, String firmaAutor,  String saludo, String despedida, String cuerpo, String posdata) {
		super(fecha, lugar, firmaAutor, cuerpo);
		this.destinatario = destinatario;
		this.saludo = saludo;
		this.despedida = despedida;
		this.posdata = posdata;
	}


	//ToString
	@Override
	public String toString() {
		return super.toString() + "Carta [destinatario=" + destinatario + ", saludo=" + saludo + ", despedida=" + despedida + ", posdata="
				+ posdata + "]";
	}

	//GettersSetters
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getDespedida() {
		return despedida;
	}

	public void setDespedida(String despedida) {
		this.despedida = despedida;
	}

	public String getPosdata() {
		return posdata;
	}


	public void setPosdata(String posdata) {
		this.posdata = posdata;
	}

	// Métodos
	
	@Override
	public void imprimirOtros() {
		// TODO Auto-generated method stub
		super.imprimirOtros();
			System.out.println(this.destinatario + "\n\t\t\tEn "+getLugar () + " a " + getFecha() + "\n" + this.saludo +
					"\n" + getCuerpo() + "\n" + this.despedida + "\n\t\t\tFirmado por: " 
					+ "\n\t\t\t" + getFirmaAutor() + "\n Posdata: " + this.posdata);
		
	}




	
	


	
	
}
